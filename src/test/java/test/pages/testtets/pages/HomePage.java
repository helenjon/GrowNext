package test.pages.testtets.pages;

import test.pages.BasePage;
import test.pages.testtets.TestBasePage;


public class HomePage extends TestBasePage {

    public HomePage(){
        header.headerone();
        bottom.bottomone();
        sideMenu.sidemenu();
    }

    public static void main(String[] args) {
        new HomePage();
    }


}
