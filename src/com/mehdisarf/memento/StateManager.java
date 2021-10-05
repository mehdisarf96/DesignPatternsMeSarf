package com.mehdisarf.memento;

import java.util.ArrayList;
import java.util.List;

public class StateManager {

    private List<EditorState> prevStates = new ArrayList<>();

    public void push(EditorState currentState) {
        prevStates.add(currentState);
    }

    public EditorState pop() {
        int lastIndex = prevStates.size() - 1;
        EditorState lastState = prevStates.get(lastIndex);
        prevStates.remove(lastIndex);

        return lastState;
    }
}
