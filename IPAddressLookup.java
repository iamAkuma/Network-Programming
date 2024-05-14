import java.net.*;

public class IPAddressLookup {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("IP Address of www.google.com: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Unable to find IP address for www.google.com");
        }
    }
}
