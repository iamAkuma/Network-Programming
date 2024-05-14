import java.net.InetAddress;
import java.net.NetworkInterface;

public class MACAddress {
    public static void main(String[] args) {
        try {
            // Get the local host address
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("IP Address: " + localHost.getHostAddress());

            // Get the MAC address directly from the network interface
            NetworkInterface networkInterface = NetworkInterface.getByInetAddress(localHost);
            byte[] macAddress = networkInterface.getHardwareAddress();

            // Format the MAC address as a string
            StringBuilder macAddressString = new StringBuilder();
            for (int i = 0; i < macAddress.length; i++) {
                macAddressString.append(String.format("%02X%s", macAddress[i], (i < macAddress.length - 1) ? "-" : ""));
            }
            System.out.println("MAC Address: " + macAddressString.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
