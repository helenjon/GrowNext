package com.epam.grownext.test.pages;

public abstract class BasePage {

    public final HeaderMenu headerMenu = new HeaderMenu();
    public final BottomMenu bottomMenu = new BottomMenu();
    public final SideMenu sideMenu = new SideMenu();

    public abstract void getPage();

}
