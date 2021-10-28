package com.mehdisarf.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {

        int lastIndex = urls.size() - 1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastIndex);

        return lastUrl;
    }

    public List<String> getUrls() {
        return urls;
    }
}
