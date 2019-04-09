import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTcp {

    private BufferedReader reader;
    private ServerSocket serverSocket;
    private Socket socket;

    void getserver(){
        try {
            serverSocket = new ServerSocket(8998);
            System.out.println("服务器套接字已经创建成功");
            while (true){
                socket = serverSocket.accept();
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                getClientMessage();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void getClientMessage(){
        try {
            while (true){
                System.out.println("客户机："+reader.readLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            if (reader != null)
                reader.close();
            if (socket != null)
                socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main (String args[]){
        MyTcp tcp = new MyTcp();
        tcp.getserver();
    }

}
