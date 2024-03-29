package com.ks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class Reader {

    private final WebsURL websURL;
    private final WebsiteReader websiteReader;
    private final WebsiteScanner websiteScanner;
    private final Map<File, String> fileList;

    @Autowired
    public Reader(WebsURL websURL, WebsiteScanner websiteScanner, WebsiteReader websiteReader) {
        this.websiteReader = websiteReader;
        this.websiteScanner = websiteScanner;
        this.websURL = websURL;
        fileList = new HashMap<>();
    }

    @PostConstruct
    public void test() throws IOException {
        websiteReader.readWebsites(websURL, fileList);
        websiteScanner.scanWebsites(fileList, websURL.getWords());
    }
}
