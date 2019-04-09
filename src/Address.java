import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address {

    public static void main (String args[]){

        InetAddress ip;
        while (true){
            try {
                ip = InetAddress.getLocalHost();
                String localname = ip.getHostName();
                String localip = ip.getHostAddress();
                System.out.println("本机名："+localname);
                System.out.println("本机IP地址："+localip);

                Thread.sleep(5000);
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }

}
