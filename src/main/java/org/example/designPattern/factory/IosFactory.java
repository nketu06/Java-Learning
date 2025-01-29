package org.example.designPattern.factory;

import java.awt.*;

public class IosFactory implements UiFactory{
    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public Scrollbar createScrollbar() {
        return null;
    }
}
