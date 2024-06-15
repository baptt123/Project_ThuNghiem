import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws IOException {
        InetAddress ip=InetAddress.getLocalHost();
        ServerSocket serverSocket=new ServerSocket(0);
        int port=serverSocket.getLocalPort();
        System.out.println(ip.getHostAddress());
        System.out.println(port);
    }
}