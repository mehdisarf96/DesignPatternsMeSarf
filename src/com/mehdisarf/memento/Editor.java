package com.mehdisarf.memento;

import java.util.ArrayList;
import java.util.List;

public class Editor {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // hala mibinam ke method e save() careTaker ye EditorState migire va tuye list state hash zakhire mikone.
    // pas man bayad ye method dashte basham ke khorak e method save() careTaker ro faraham va tamin bokone.
    // so:
    public EditorState createState() {
        return new EditorState(this.content); // state ro misaze, va dar yek zaman e moshakhas
        // az ruye 'internal state' e editor, state ro por mikone va barmigardune.
    }

    // zemnan mibnam ke method e pop e careTaker, akharin state, ro barmigardune.
    // khob in be che dard mikhore? be in dard ke man(yani editor, yani originator) un akharin state, yadegari ro begiram
    // va internal state am ro restore konam be un state. bargardam be un.
    // (man e originator enqadr zalil nashodam ke set kardan field ham ro ham yeki dg anjam bede.
    public void restore(EditorState state) {
        this.content = state.getContent();
    }
}
