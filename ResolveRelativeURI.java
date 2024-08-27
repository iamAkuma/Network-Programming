import java.net.URI;

public class ResolveRelativeURI {
    public static void main(String[] args) {
        String base = "https://www.example.com/path/";
        String relative = "subdir/resource.html";

        URI baseURI = URI.create(base);
        URI resolvedURI = baseURI.resolve(relative);

        System.out.println("Resolved URI: " + resolvedURI);
    }
}
