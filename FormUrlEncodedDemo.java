import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.net.URLDecoder;

public class FormUrlEncodedDemo {
    public static void main(String[] args) {
        String originalString = "name=John Doe&age=30&city=New York";

        try {
            // Encode the original string
            String encodedString = URLEncoder.encode(originalString, "UTF-8");
            System.out.println("Encoded String: " + encodedString);

            // Decode the encoded string
            String decodedString = URLDecoder.decode(encodedString, "UTF-8");
            System.out.println("Decoded String: " + decodedString);

        } catch (UnsupportedEncodingException e) {
            System.out.println("Encoding/Decoding error: " + e.getMessage());
        }
    }
}
