import java.io.*;
import java.net.*;

public class DownloadWebPage {
    public static void main(String[] args) {
        String webAddress = "https://www.google.com";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(webAddress).openStream()));
                BufferedWriter writer = new BufferedWriter(new FileWriter("downloaded_page.html"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Web page downloaded successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
