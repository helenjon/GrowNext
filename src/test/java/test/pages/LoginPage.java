package test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends TestBase  {

   // private WebDriver driver;
    @FindBy(id="email")
    WebElement emailw;
    @FindBy(id="password")
    WebElement pass;
    @FindBy(id="loginbutton")
    WebElement login;

    public LoginPage(){
        TestBase.initialization();
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);

    }

    public void clickLogin() {
        login.click();
    }


    public void fillINEmailPass(String email, String password) {
        emailw.clear();
        pass.clear();
        emailw.sendKeys(email);
        pass.sendKeys(password);

    }

    public void getURL(String url){
        driver.get(url);
    }




}
