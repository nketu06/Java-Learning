package org.example.designPattern.factory;

public abstract class Flutter {

    int refreshRate;

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public void setTheme(String theme) {
        System.out.println("The theme is " + theme);
    }

    // pratical factory simply take a value here and will return factory

    public abstract UiFactory createUiFactory();
}
