package com.mehdisarf.memento;

public class Test {
    public static void main(String[] args) {

        Editor editor = new Editor();

        editor.setContent("alef");
        editor.setContent("be");
        editor.setContent("jim");

        System.out.println(editor.getContent());

        System.out.println(editor.getContent());

        System.out.println(editor.getContent());
    }
}
