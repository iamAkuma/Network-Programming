import java.net.InetAddress;
import java.net.UnknownHostException;

public class Local {
    public static void main(String[] args) {
        try {
            // Get the InetAddress object for the local machine
            InetAddress localHost = InetAddress.getLocalHost();

            // Get the hostname of the local machine
            String hostName = localHost.getHostName();

            // Get the IP address of the local machine
            String ipAddress = localHost.getHostAddress();

            // Print the hostname and IP address
            System.out.println("Hostname of the local machine: " + hostName);
            System.out.println("IP address of the local machine: " + ipAddress);
        } catch (UnknownHostException e) {
            // Handle the exception if the host is not found
            System.out.println("Unable to determine local host information.");
            e.printStackTrace();
        }
    }
}
