package test.pages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.pages.BasePage;
import webbrowser.WebBrowser;

public class LoginPage extends BasePage {

    public static final String PAGE_IDENTIFIER = "Login Page";
    public static final String PAGE_URL = "https://www.facebook.com";

    @Override
    public void getPage() {
        WebBrowser.getDriver().get(PAGE_URL);
    }

    public void clickLogin() {
        WebBrowser.getDriver().findElement(By.id("loginbutton")).click();
    }

    public void fillInEmailPass(String email, String password) {
        WebElement emailw;
        WebElement pass;
        emailw =WebBrowser.getDriver().findElement(By.id("email"));
        pass = WebBrowser.getDriver().findElement(By.id("pass"));
        emailw.clear();
        pass.clear();
        emailw.sendKeys(email);
        pass.sendKeys(password);
    }

    public void getURL(String url) {
        WebBrowser.getDriver().get(url);
    }
}
