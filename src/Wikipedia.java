import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;

public class Wikipedia {
    public static void main(String[]args) throws IOException {

        String s ="https://it.wikipedia.org/wiki/Speciale:PaginaCasuale";
        URL url2 = new URL(s);

        HttpURLConnection myURLConnection2 = (HttpURLConnection) url2.openConnection();

        myURLConnection2.setInstanceFollowRedirects(false);

        String newConn = myURLConnection2.getHeaderField("location");

        System.out.println(newConn);

        Document document = Jsoup.connect(newConn).get();
        

        System.out.println(document.getElementsByTag("h1").text());

        Set<String>urlmembers = new HashSet<>();

        try {
            URL myURL = new URL("https://it.wikipedia.org/wiki/Speciale:PaginaCasuale");

                for (int i = 0; i < 3; i++) {

                URLConnection myURLConnection = myURL.openConnection();
                Thread.sleep((long) 0.2);

                HttpURLConnection url = (HttpURLConnection) myURLConnection;
                url.setInstanceFollowRedirects(false);

                url.getHeaderField("location");
                System.out.println( "("+ i+ ") \t" +  url.getHeaderField("location"));

                 urlmembers.add( url.getHeaderField("location"));
            }

                }catch(Exception e){
                e.printStackTrace();
            }
                System.out.println();
                System.out.println("HAI trovato : " + urlmembers.size());
    }
}
