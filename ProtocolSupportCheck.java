import java.net.URL;
import java.net.URLConnection;

public class ProtocolSupportCheck {
    public static void main(String[] args) {
        String[] protocols = { "http", "https", "ftp", "file" };

        for (String protocol : protocols) {
            try {
                // Attempt to open a connection with a dummy URL using each protocol
                URL url = new URL(protocol + "://www.example.com");
                URLConnection connection = url.openConnection();
                connection.connect();
                System.out.println(protocol.toUpperCase() + " is supported.");
            } catch (Exception e) {
                System.out.println(protocol.toUpperCase() + " is not supported.");
            }
        }
    }
}
