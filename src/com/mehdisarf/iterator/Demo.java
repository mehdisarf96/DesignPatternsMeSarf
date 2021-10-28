package com.mehdisarf.iterator;

public class Demo {
    public static void main(String[] args) {

        BrowseHistory history = new BrowseHistory();

        history.push("www.google.com");
        history.push("www.mehdisarf.com");
        history.push("www.github.com");
        history.push("www.sarfmehdi.com");
        history.push("www.stackoverflow.com");

        for (int i = 0; i < history.getUrls().size(); i++) {
            System.out.println(history.getUrls().get(i));
        }
    }
}
