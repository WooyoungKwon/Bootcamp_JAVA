package Day23.NetworkInterfaceTest;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) {
        InetAddress addr = null;
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        System.out.println("IP 주소 : " + addr.getHostAddress());
        NetworkInterface network = null;
        try {
            network = NetworkInterface.getByInetAddress(addr);
        } catch (SocketException e){
            throw new RuntimeException(e);
        }
        //System.out.println("Mac 주소 : " + getMACIdentifier(network));
    }
}
