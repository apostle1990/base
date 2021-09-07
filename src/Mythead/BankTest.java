package Mythead;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankTest {
    public static void main(String[] args) {
        Account account = new Account();
        ExecutorService service = Executors.newFixedThreadPool(100);
        for (int i=1; i<=100; i++){
            service.execute(new AddMoneyThread(account,1));
        }
        service.shutdown();
        while (!service.isTerminated()){}
        System.out.println("账户余额：" + account.getBalance());
    }
}

class Account {
//    private Lock lock = new ReentrantLock();

    private double balance;

//    synchronized
    public void deposit(double money){
//        lock.lock();
//        try{
//            double newbalance = balance + money;
//            try{
//                Thread.sleep(10);
//            }
//            catch (InterruptedException ex){
//                ex.printStackTrace();
//            }
//            balance = newbalance;
//        }
//        finally {
//            lock.unlock();
//        }
        double newbalance = balance + money;
        try{
            Thread.sleep(10);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        balance = newbalance;
    }

    public double getBalance(){
        return balance;
    }
}

class AddMoneyThread implements Runnable{
    private  Account account;
    private  double money;

    public AddMoneyThread(Account account, double money){
        this.account = account;
        this.money = money;
    }

    @Override
    public void run(){
        account.deposit(money);
//       synchronized (account){
//           account.deposit(money);
//       }
    }
}
