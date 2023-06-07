import java.net.*;

public class ip {
    public static void main(String [] args){
    try{
        InetAddress ipAddr=InetAddress.getLocalHost();
        System.out.println("Ip address of the machine is :"+ ipAddr.getAddress());
    }
    catch(UnknownHostException ex){
        ex.printStackTrace();
    }
    }
}
