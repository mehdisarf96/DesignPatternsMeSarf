package com.mehdisarf.state;

public class Demo {
    public static void main(String[] args) {

        Canvas canvas = new Canvas();

        canvas.setCurrentTool(ToolType.SELECTION);
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(ToolType.BRUSH);
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(ToolType.ERASER);
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
