package test.pages;

public abstract class BasePage {

    protected HeaderMenu headerMenu = new HeaderMenu();
    protected BottomMenu bottomMenu = new BottomMenu();
    protected SideMenu sideMenu = new SideMenu();

    public abstract void getPage();

}
