package com.ks;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

@Component
public class WebsiteScanner {

    void scanWebsites(Map<File, String> webs, String[] word) {
        for (int i = 0; i < word.length; i++) {
            int iterator = i;
            webs.forEach((key, value) -> {
                try {
                    webScanner(key, word[iterator], webs);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    private void webScanner(File file, String word, Map<File, String> web) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            final String lineFromFile = scanner.nextLine();
            if (lineFromFile.contains(word)) {
                System.out.println("I found " + word + " in website " + web.get(file));
                break;
            }
        }
    }
}
