package org.example.designPattern.factory;

public class IosFlutter extends Flutter {

    @Override
    public UiFactory createUiFactory() {
        return new IosFactory();
    }
}
