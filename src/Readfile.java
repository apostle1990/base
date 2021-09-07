import java.io.File;

public class Readfile {
    public static void main(String[] args) {
        String path = "E:/1";
        readfile(path);
    }
    private static void readfile(String path){
        File file = new File(path);
        File[] fs = file.listFiles();
        if (fs == null) return;
        for (File f : fs){
            if (f.isFile()){
                System.out.println(f.getPath());
            }else {
                readfile(f.getPath());
            }
        }
    }
}
