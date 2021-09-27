package com.mehdisarf.memento;

import java.util.ArrayList;
import java.util.List;

public class Editor {

    private String content;
    private List<String> previousContents = new ArrayList<>();

    private String title;
    private List<String> previousTitles = new ArrayList<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (this.content == null)
            this.content = content;
        else {
            previousContents.add(this.content);
            this.content = content;
        }
    }

    public List<String> getPreviousContents() {
        return previousContents;
    }

    public void setPreviousContents(List<String> previousContents) {
        this.previousContents = previousContents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void undo() {
        this.content = previousContents.get(previousContents.size() - 1);
        previousContents.remove(previousContents.size() - 1);
    }
}
