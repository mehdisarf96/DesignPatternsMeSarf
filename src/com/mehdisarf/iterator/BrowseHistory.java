package com.mehdisarf.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private String[] urls = new String[10];

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {

        int lastIndex = urls.size() - 1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastIndex);

        return lastUrl;
    }

    public String[] getUrls() {
        return urls;
    }
}
