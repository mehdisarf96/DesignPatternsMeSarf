package com.mehdisarf.state;

public class Demo {
    public static void main(String[] args) {

        Canvas canvas = new Canvas();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
