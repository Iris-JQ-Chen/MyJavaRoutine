import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Weather extends Thread {

    String weather = "节目预报：八点有大型晚归，请收听";
    int port = 9898;
    InetAddress inetAddress = null;
    MulticastSocket multicastSocket = null;

    Weather(){

        try {
            inetAddress = InetAddress.getByName("224.255.10.0");
            multicastSocket = new MulticastSocket(port);
            multicastSocket.setTimeToLive(1);
            multicastSocket.joinGroup(inetAddress);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void run(){
        while (true){
            DatagramPacket packet = null;
            byte data[] = weather.getBytes();
            packet = new DatagramPacket(data,data.length,inetAddress,port);
            System.out.println(new String(data));
            try {
                multicastSocket.send(packet);
                sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main (String args[]){
        Weather weather = new Weather();
        weather.start();
    }

}
