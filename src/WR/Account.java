package WR;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Account {
    private Account(){
        throw new AssertionError();
    }

    public static int countword(String filename, String word) throws IOException {
        int counter =0;
        try(FileReader fr = new FileReader(filename)){
            try(BufferedReader br = new BufferedReader(fr)){
                String line = null;
                while ((line = br.readLine()) !=null ){
                    int index = -1;
                    while (line.length() >= word.length() && (index = line.indexOf(word)) >=0){
                        counter++;
                        line = line.substring(index + word.length());
                    }
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        String filename = "./src/WR/sf.txt";
        String word = "dqw";
        int count = countword(filename, word);
        System.out.println(count);
    }
}
