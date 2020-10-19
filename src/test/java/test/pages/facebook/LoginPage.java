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
        WebElement emailElement;
        WebElement pass;
        emailElement =WebBrowser.getDriver().findElement(By.id("email"));
        pass = WebBrowser.getDriver().findElement(By.id("pass"));
        emailElement.clear();
        pass.clear();
        emailElement.sendKeys(email);
        pass.sendKeys(password);
    }

    public void getURL(String url) {
        WebBrowser.getDriver().get(url);
    }
}
