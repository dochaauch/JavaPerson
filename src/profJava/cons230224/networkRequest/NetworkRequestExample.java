package profJava.cons230224.networkRequest;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class NetworkRequestExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        String[] urls = {"https://www.9tv.co.il",
                        "https://www.tel-ran.com",
                        "https://javapoint.com",
                        "https://google.com"};

        for (String url : urls) {
            CompletableFuture.supplyAsync(() -> makeRequest(url), executor)
                    .thenAccept(s -> saveToFile(s, url));//вызывается, когда закончится задание
        }
        executor.shutdown();
    }

    private static void saveToFile(String res, String file) {
        try(FileWriter writer = new FileWriter(file.replace("https://", "")
                +".html")) {
            writer.write(res);
            writer.flush();//
        } catch (IOException io){
            System.out.println(io);
        }
    }
    private static String makeRequest(String urlString) {
        URL url;
        String result = "";
        try {
            url =  new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            try(BufferedReader in =new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                result = in.lines().collect(Collectors.joining());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
