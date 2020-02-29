package test.pages.litecart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webbrowser.WebBrowser;

public enum BottomLinksXpath {

    RubberDucks (".//footer[@id='footer']//a[@href = 'http://kuopassa.net/litecart/en/rubber-ducks-c-1/']"),
    Ankkis (".//footer[@id='footer']//a[@href = 'http://kuopassa.net/litecart/en/ankkis-m-1/']"),
    CustomerService (".//footer[@id='footer']//a[@href = 'http://kuopassa.net/litecart/en/customer-service-s-0']"),
    RegionalSettings (".//footer[@id='footer']//a[@href = 'http://kuopassa.net/litecart/en/regional_settings']"),
    CreateAccount (".//footer[@id='footer']//a[@href = 'http://kuopassa.net/litecart/en/create_account']"),
    Login (".//footer[@id='footer']//a[@href = 'http://kuopassa.net/litecart/en/login']"),
    AboutUs (".//footer[@id='footer']//a[@href = 'http://kuopassa.net/litecart/en/about-us-i-1']"),
    DeliveryInformation (".//footer[@id='footer']//a[@href = 'http://kuopassa.net/litecart/en/delivery-information-i-2']"),
    PrivacyPolicy (".//footer[@id='footer']//a[@href = 'http://kuopassa.net/litecart/en/privacy-policy-i-3']"),
    TermsConditions (".//footer[@id='footer']//a[@href = 'http://kuopassa.net/litecart/en/terms-conditions-i-4']");

    private String bottomLink;

    BottomLinksXpath (String bottomLink) {
        this.bottomLink = bottomLink;
    }

    public WebElement getbottomLink() { return WebBrowser.getDriver().findElement(byBottomLinkXPATH()); }

    private By byBottomLinkXPATH() { return By.xpath(this.bottomLink); }


}
