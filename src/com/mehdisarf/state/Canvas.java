package com.mehdisarf.state;

public class Canvas {

    private ToolType currentTool;

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }

    public void mouseDown(){

        if (currentTool == ToolType.SELECTION){
            System.out.println("selection icon");
        }
        else if (currentTool == ToolType.BRUSH){
            System.out.println("brush icon");
        }
        else if (currentTool == ToolType.ERASER){
            System.out.println("eraser icon");
        }
    }

    public void mouseUp(){

        if (currentTool == ToolType.SELECTION){
            System.out.println("draw dashed rectangle");
        }
        else if (currentTool == ToolType.BRUSH){
            System.out.println("draw a line");
        }
        else if (currentTool == ToolType.ERASER){
            System.out.println("erase something");
        }
    }
}