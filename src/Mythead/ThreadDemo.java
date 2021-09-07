package Mythead;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadDemo {
    public static void main(String[] args) throws Exception {
//        Mythread1 t = new Mythread1();
//        Mythread2 t2 = new Mythread2();
//        Thread t = new Thread(t2);
//        t.start();
//        while (true){
//            System.out.println("2");
//        }
        List<Future<Integer>> list = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i=0; i<10; i++){
            list.add(service.submit(new Mythread3((int)(Math.random() * 100))));
        }
        int sum=0;
        for (Future<Integer> future : list){
            while (!future.isDone()){
                sum +=future.get();
            }
        }
        System.out.println(sum);
    }

}
class Mythread1 extends Thread{
    public void run(){
        while (true){
            System.out.println("1");
        }
    }
}

class Mythread2 implements Runnable{
    public void run(){
        while (true){
            System.out.println("1");
        }
    }
}

class Mythread3 implements Callable<Integer>{
    private int upperBounds;

    public Mythread3(int upperBounds){
        this.upperBounds = upperBounds;
    }

    public Integer call() {
        int sum =0;
        for (int i=1; i<=upperBounds; i++){
            sum +=i;
        }
        return sum;
    }
}