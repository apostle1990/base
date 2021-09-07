package Socket;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread{

    private Socket socket = null;

    public ServerThread(Socket socket){
        this.socket = socket;
    }

    public void run(){
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        OutputStream os = null;
        PrintWriter pw = null;

        try {
            is = socket.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            String info = null;

            while ((info= br.readLine())!=null){
                System.out.println("这是服务器，客户端说：" + info);
            }
            socket.shutdownInput();

            os = socket.getOutputStream();
            pw = new PrintWriter(os);
            pw.write("服务器欢迎您");

            pw.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (pw!=null) pw.close();
            if (os!=null) pw.close();
            if (br!=null) pw.close();
            if (isr!=null) pw.close();
            if (is!=null) pw.close();
            if (socket!=null) pw.close();
        }
    }
}
