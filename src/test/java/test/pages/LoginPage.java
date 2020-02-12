package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {


    private WebDriver driver;
    private WebElement emailw;
    private  WebElement pass;
    private WebElement login;

    public static final String PAGE_IDENTIFIER = "Login Page";

    public LoginPage(WebDriver driver) {
        this.driver= driver;
     }

    public void clickLogin() {
        login = driver.findElement(By.id("loginbutton"));
        login.click();
    }


    public void fillINEmailPass(String email, String password) {
        emailw =driver.findElement(By.id("email"));
        pass = driver.findElement(By.id("pass"));
        emailw.clear();
        pass.clear();
        emailw.sendKeys(email);
        pass.sendKeys(password);
    }

    public void getURL(String url){
        driver.get(url);
    }


}
