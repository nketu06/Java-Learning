package org.example.designPattern.factory;

import java.awt.*;

public interface UiFactory {

    public Button createButton();
    public Menu createMenu();
    public Scrollbar createScrollbar();
}
