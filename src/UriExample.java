import java.net.URI;
import java.net.URISyntaxException;

public class UriExample {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.linkedin.com/learning/photoshop-2020-one-on-one-fundamentals/welcome-to-one-on-one?u=76811570");
            manage(uri);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static void manage(URI uri) {
        System.out.println(uri);
        System.out.println("getAuthority: " + uri.getAuthority());
        System.out.println("schema: " + uri.getScheme());
        System.out.println("UserInfo: " + uri.getUserInfo());
    }
}
