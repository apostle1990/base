package WR;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Fcopy {
    private Fcopy(){
        throw new AssertionError();
    }

    public static void filecopy(String source, String  target) throws IOException {
        try (InputStream in = new FileInputStream(source)){
            try (OutputStream out = new FileOutputStream(target)){
                byte[] buffer = new byte[4096];
                int bytesToread;
                while ((bytesToread = in.read(buffer)) != -1){
                    out.write(buffer, 0, bytesToread);
                }
            }
        }
    }

    public static void filecopyNio(String source, String  target) throws IOException{
        try (FileInputStream in = new FileInputStream(source)){
            try (FileOutputStream out = new FileOutputStream(target)){
                FileChannel inChannel = in.getChannel();
                FileChannel outChannel = out.getChannel();
                ByteBuffer buffer = ByteBuffer.allocate(4096);
                while (inChannel.read(buffer) != -1){
                    buffer.flip();
                    outChannel.write(buffer);
                    buffer.clear();
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String source = "./src/WR/sf.txt";
        String target1 = "./src/WR/sf1.txt";
        String target2 = "./src/WR/sf2.txt";
        filecopy(source, target1);
        filecopyNio(source, target2);
    }
}
