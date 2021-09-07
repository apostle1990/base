package WR;

import java.io.*;

public class Copy2 {

    public static void main(String[] args) {
        File source = new File("./src/WR");
        File target = new File("./src/WR1");
        try {
            copyfile(source,target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyfile(File soure, File target) throws IOException {
        try (BufferedInputStream inbuff = new BufferedInputStream(new FileInputStream(soure)); BufferedOutputStream outbuff = new BufferedOutputStream(new FileOutputStream(target))) {
            byte[] b = new byte[1024 * 5];
            int len;
            while ((len = inbuff.read(b)) != -1) {
                outbuff.write(b, 0, len);
            }
            outbuff.flush();
        }
    }

    private static void copydirectiory(String sourcedir, String targetdir) throws IOException{

        File fsource = new File(sourcedir);
        if (!fsource.exists() || !fsource.isDirectory()) {
            return;
        }

        File ftarget = new File(targetdir);
        if (!ftarget.exists()){
            ftarget.mkdirs();
        }
        File[] file = fsource.listFiles();
        for (int i=0; i < file.length; i++){
            if (file[i].isFile()){
                File sourceFile = file[i];
                File targetFile = new File(ftarget, file[i].getName());
                copyfile(sourceFile,targetFile);
            }
            if (file[i].isDirectory()){
                String subSourceDir = sourcedir + File.separator + file[i].getName();
                String subTargetDir = targetdir + File.separator + file[i].getName();
                copydirectiory(subSourceDir, subTargetDir);
            }
        }

    }
}
