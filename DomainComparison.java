import java.net.InetAddress;
import java.net.UnknownHostException;

public class DomainComparison {
    public static void main(String[] args) {
        String domain1 = "google.com";
        String domain2 = "google.com";

        try {
            // Get IP addresses for both domains
            InetAddress[] addresses1 = InetAddress.getAllByName(domain1);
            InetAddress[] addresses2 = InetAddress.getAllByName(domain2);

            // Compare the IP addresses
            boolean areSame = false;
            for (InetAddress addr1 : addresses1) {
                for (InetAddress addr2 : addresses2) {
                    if (addr1.equals(addr2)) {
                        areSame = true;
                        break;
                    }
                }
                if (areSame)
                    break;
            }

            System.out.println("The domains " + domain1 + " and " + domain2 + " are the same: " + areSame);

        } catch (UnknownHostException e) {
            System.out.println("Unable to resolve one or both domains.");
        }
    }
}
