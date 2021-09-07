package WR;

import java.io.*;

public class StoF {

    public static void main(String[] args) {
        String str = "sftxt";
        WriteFile(str);
    }

    public static void WriteFile(String str){
        File file = new File("./src/WR/sf.txt");
        PrintStream ps = null;
        try{
            OutputStream fos = new FileOutputStream(file);
            ps = new PrintStream(fos);
            ps.print(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            assert ps != null;
            ps.close();
        }
    }
}
