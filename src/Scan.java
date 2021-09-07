import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) throws IOException {
//        Scanner input = new Scanner(System.in);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(input.readLine());
//                input.nextInt();

        int[] array=new int[len];
        //遍历数组，并给其赋值
        for(int i=0;i<len;i++){
            array[i]=Integer.parseInt(input.readLine());
//                    input.nextInt();
        }

        //打印数组
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}
