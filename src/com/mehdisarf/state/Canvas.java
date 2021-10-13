package com.mehdisarf.state;

public class Canvas {

    private Tool currentTool;

    public void mouseDown() { // want to behave differently based on currentTool.
        currentTool.mouseDown();
    }

    public void mouseUp() { // want to behave differently based on currentTool.
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}