import java.net.MalformedURLException;
import java.net.URL;

public class URL_Example {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.linkedin.com/learning/photoshop-2020-one-on-one-fundamentals/welcome-to-one-on-one?u=76811570");
            manage(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void manage(URL url) {
        System.out.println(url);
        System.out.println("Host: " + url.getHost());
        System.out.println("File: " + url.getFile());
        System.out.println("Path: " + url.getPath());
        System.out.println("default port: " + url.getDefaultPort());
    }
}
