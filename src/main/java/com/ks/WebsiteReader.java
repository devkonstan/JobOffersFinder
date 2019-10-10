package com.ks;

import org.springframework.stereotype.Component;

import java.io.*;
import java.net.URL;
import java.util.Map;

@Component
public class WebsiteReader {

    void readWebsites(WebsURL websURL, Map<File, String> files) throws IOException {
        for (int i = 0; i < websURL.getWebUrls().length; i++) {
            readWeb(websURL.getWebUrls()[i], i + ".html");
            files.put(new File(i + ".html"), websURL.getWebUrls()[i]);
        }
    }

    private void readWeb(String link, String fileName) throws IOException {
        URL web = new URL(link);

        BufferedReader in = new BufferedReader(new InputStreamReader(web.openStream()));
        String input;
        StringBuilder builder = new StringBuilder();
        while ((input = in.readLine()) != null) {
            builder.append(input);
            builder.append(System.lineSeparator());
        }
        in.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));
        writer.write(builder.toString());
        writer.close();
    }
}
