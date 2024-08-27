import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class ListNetworkInterfaces {
    public static void main(String[] args) {
        try {
            // Get all network interfaces on the machine
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

            // Iterate through the list and print each interface
            while (interfaces.hasMoreElements()) {
                NetworkInterface networkInterface = interfaces.nextElement();
                System.out.println("Interface Name: " + networkInterface.getName());
                System.out.println("Display Name: " + networkInterface.getDisplayName());
                System.out.println("Is Up: " + networkInterface.isUp());
                System.out.println("Is Loopback: " + networkInterface.isLoopback());
                System.out.println("Is Virtual: " + networkInterface.isVirtual());
                System.out.println("Supports Multicast: " + networkInterface.supportsMulticast());
                System.out.println("=======================================");
            }
        } catch (SocketException e) {
            System.out.println("Error retrieving network interfaces.");
            e.printStackTrace();
        }
    }
}
