package test.pages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.pages.BasePage;
import webbrowser.WebBrowser;


public class LoginPage extends BasePage {

    private WebElement emailw;
    private  WebElement pass;
    private WebElement login;
    public static final String PAGE_IDENTIFIER = "Login Page";

    public LoginPage(){
        System.out.println("test");
    }


    public void clickLogin() {
        login = WebBrowser.getDriver().findElement(By.id("loginbutton"));
        login.click();
    }


    public void fillINEmailPass(String email, String password) {
        emailw =WebBrowser.getDriver().findElement(By.id("email"));
        pass = WebBrowser.getDriver().findElement(By.id("pass"));
        emailw.clear();
        pass.clear();
        emailw.sendKeys(email);
        pass.sendKeys(password);
    }

    public void getURL(String url){
        WebBrowser.getDriver().get(url);
    }


}
