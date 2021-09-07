import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Systemin {
    public static void main(String[] args) throws IOException {
        input2();
    }

    public static void input1(){
        System.out.println("输入数组长度：");
        Scanner input = new Scanner(System.in);

        int len = input.nextInt();

        int[] array=new int[len];

        //遍历数组，并给其赋值
        for(int i=0;i<len;i++){
            System.out.println("输入数组元素："+ i);
            array[i] = input.nextInt();
        }

        //打印数组
        for(int i:array){
            System.out.print(i+" ");
        }
    }

    public static void input2() throws IOException {
        System.out.println("输入数组长度：");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(input.readLine());

        int[] array=new int[len];

        //遍历数组，并给其赋值
        for(int i=0;i<len;i++){
            System.out.println("输入数组元素："+ i);
            array[i]=Integer.parseInt(input.readLine());
        }

        //打印数组
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}
