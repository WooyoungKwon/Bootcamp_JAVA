package Day22;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class Day22 {
    public static void main(String args[]) {
        
        System.out.println("멀티캐스트 타임 서버");
        DatagramSocket serverSocket = null; //UDP
        try {
            serverSocket = new DatagramSocket();
            while (true) {
                String dateText = new Date().toString();
                byte[] buffer = new byte[256];
                buffer = dateText.getBytes();

                InetAddress group = InetAddress.getByName("165.246.80.158");
                DatagramPacket packet;
                packet = new DatagramPacket(buffer, buffer.length, group, 10000);
                serverSocket.send(packet);
                System.out.println("전송된 시간 : " + dateText);
                try {
                    Thread.sleep(1000); // 1초 단위 리셋
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException ex) {
            System.out.println("입출력 예외 발생!");
        }
    }
}
