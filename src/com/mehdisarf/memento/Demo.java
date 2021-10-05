package com.mehdisarf.memento;

public class Demo {
    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.setContent("AAA");
        EditorState firstState = editor.createState();

        StateManager stateManager = new StateManager();
        stateManager.push(firstState);

        editor.setContent("BBB");
        EditorState secondState = editor.createState();

        stateManager.push(secondState);

        editor.setContent("CCC");
        EditorState thirdState = editor.createState();

        System.out.println("--------------------");
        System.out.println(editor.getContent());

        System.out.println("--------------------");
        editor.restore(stateManager.pop());
        System.out.println(editor.getContent());

        System.out.println("--------------------");
        editor.restore(stateManager.pop());
        System.out.println(editor.getContent());
    }
}
