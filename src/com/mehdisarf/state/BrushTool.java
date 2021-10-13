package com.mehdisarf.state;

public class BrushTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Brush");
    }

    @Override
    public void mouseUp() {
        System.out.println("bruuuuuuuuuuush");
    }
}
