package test.pages;

import org.openqa.selenium.WebElement;
import test.pages.litecart.BottomLinksXpath;
import test.utilities.MyLog;

import java.util.ArrayList;
import java.util.List;

public class BottomMenu {

    List<WebElement> bottomLinks = new ArrayList<WebElement>();

//    public List<WebElement> getListBottomLinks(){
//        bottomLinks.addAll(WebBrowser.getDriver().findElements(By.xpath("//ul[@class= 'list-unstyled']//a")));
//        return bottomLinks;
//    }

    public WebElement getBottomLink(String arg0) {
        switch (arg0.replaceAll("[^a-zA-Z]", "")) {
            case "RubberDucks":
                return BottomLinksXpath.RubberDucks.getbottomLink();
            case "CustomerService":
                return BottomLinksXpath.CustomerService.getbottomLink();
            case "CreateAccount":
                return BottomLinksXpath.CreateAccount.getbottomLink();
            case "AboutUs":
                return BottomLinksXpath.AboutUs.getbottomLink();
            case "TermsConditions":
                return BottomLinksXpath.TermsConditions.getbottomLink();
            case "PrivacyPolicy":
                return BottomLinksXpath.PrivacyPolicy.getbottomLink();
            case "Ankkis":
                return BottomLinksXpath.Ankkis.getbottomLink();
            case "DeliveryInformation":
                return BottomLinksXpath.DeliveryInformation.getbottomLink();
            case "Login":
                return BottomLinksXpath.Login.getbottomLink();
            case "RegionalSettings":
                return BottomLinksXpath.RegionalSettings.getbottomLink();
            default:
                MyLog.error(new IllegalArgumentException().getMessage());
                throw new IllegalArgumentException();
        }
    }
}