package test.pages;

public abstract class BasePage {

    public HeaderMenu headerMenu = new HeaderMenu();
    public BottomMenu bottomMenu = new BottomMenu();
    public SideMenu sideMenu = new SideMenu();

    public abstract void getPage();

}
