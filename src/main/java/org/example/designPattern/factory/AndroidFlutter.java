package org.example.designPattern.factory;

public class AndroidFlutter extends Flutter {
    @Override
    public UiFactory createUiFactory() {
        return new AndroidFactory();
    }
}
