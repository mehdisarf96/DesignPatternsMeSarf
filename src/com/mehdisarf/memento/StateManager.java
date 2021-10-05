package com.mehdisarf.memento;

import java.util.ArrayList;
import java.util.List;

public class StateManager {

    private List<EditorState> prevStates = new ArrayList<>();

    public void save(EditorState currentState) { // in signature ro az ruye khat paeini sakhtam.
        prevStates.add(currentState); // ye kar SMii ine ke tuye prevStates, state, store koni.
    }

    public EditorState pop() { // in signature ro az ruye khotut paeini sakhtam.

        // ye kar SMii ine ke akharin state zakhire shode tuye prevState ro bargarduni va bad az
        // list hazfesh koni.
        int lastIndex = prevStates.size() - 1;
        EditorState lastState = prevStates.get(lastIndex);
        prevStates.remove(lastIndex);

        return lastState;
    }
}
