package com.mehdisarf.memento;

import java.util.ArrayList;
import java.util.List;

public class Editor {

    private String content;
    private List<EditorState> prevStates = new ArrayList<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {

        if (this.content == null)
            this.content = content;
        else {

            // content ke avaz mishe yani mirim be ye state jadid.
            EditorState currentState = new EditorState(this.content); // createState() ya hamun createMemento() qarare dar ayande in karo bokone.
            prevStates.add(currentState);

            this.content = content;
        }
    }

    public void undo() {
        int lastIndex = prevStates.size() - 1;

        EditorState lastState = prevStates.get(lastIndex);
        prevStates.remove(lastIndex);

        this.content = lastState.getContent();
    }
}
