import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class SimpleHttpGet {
    public static void main(String[] args) {
        String urlStr = "https://jsonplaceholder.typicode.com/posts/1"; // Replace with your URL

        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(urlStr).openConnection();
            conn.setRequestMethod("GET");

            try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String response = in.lines().reduce("", (acc, line) -> acc + line + "\n");
                System.out.println("Response: \n" + response);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
