package com.mehdisarf.memento.excercise.solution;

public class Demo {
    public static void main(String[] args) {

        Document doc1 = new Document();
        StateManager stateManager = new StateManager();

        doc1.setContent("hello. good morning.");
        doc1.setFontName("arial");
        doc1.setFontSize(9);
        DocumentState firstState = doc1.createState();
        stateManager.push(firstState);

        doc1.setContent("good afternoon. what's up?");
        doc1.setFontName("tahoma");
        doc1.setFontSize(12);
        DocumentState secondState = doc1.createState();
        stateManager.push(secondState);

        doc1.setContent("good night. bye");
        doc1.setFontName("B nazanin");
        doc1.setFontSize(17);

        System.out.println(doc1);

        doc1.restore(stateManager.pop());
        System.out.println(doc1);

        doc1.restore(stateManager.pop());
        System.out.println(doc1);
    }
}
