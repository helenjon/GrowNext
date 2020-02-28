package test.pages.litecart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.utilities.MyLog;
import webbrowser.WebBrowser;

public class RegionalSettingsSetup  {

    private String dropdownCase;
    private static final String LANGUAGE_FIELD_XPATH = "//form[@name='region_form']//select[@name = 'language_code']";
    private static final String CURRENCY_FIELD_XPATH = "//form[@name='region_form']//select[@name = 'currency_code']";
    private static final String COUNTRY_FIELD_XPATH = "//form[@name='region_form']//select[@name = 'country_code']";
    private static final String ZONE_FIELD_XPATH = "//form[@name='region_form']//select[@name = 'zone_code']";
    private static final String SAVE_BUTTON_XPATH = "//button[@name='save']";

    public void selectDropdown(String arg0) {
        dropdownCase = arg0;
        switch (arg0) {
            case "Language":
                WebBrowser.getDriver().findElement(byLanguageField()).click();
                break;
            case "Currency":
                WebBrowser.getDriver().findElement(byCurrencyField()).click();
                break;
            case "Country":
                WebBrowser.getDriver().findElement(byCountryField()).click();
                break;
            case "Zone/State/Province":
                WebBrowser.getDriver().findElement(byZoneField()).click();
                break;
            default:
                MyLog.error(new IllegalArgumentException(arg0 + " is not found").getMessage());
        }
    }

    public void selectValue(String arg0) {
        switch (dropdownCase) {
            case "Language":
                selectLanguage(arg0);
                break;
            case "Currency":
                selectCurrency(arg0);
                break;
            case "Country":
                selectCountry(arg0);
                break;
            case "Zone/State/Province":
                selectZip(arg0);
                break;
            default:
                throw new IllegalArgumentException(arg0 +"is not found");
        }
    }

    private By byLanguageField() {     return By.xpath(LANGUAGE_FIELD_XPATH);    }
    private By byCurrencyField() {     return By.xpath(CURRENCY_FIELD_XPATH);    }
    private By byCountryField() {     return By.xpath(COUNTRY_FIELD_XPATH);      }
    private By byZoneField() {     return By.xpath(ZONE_FIELD_XPATH);      }
    private By bySaveButton() {     return By.xpath(SAVE_BUTTON_XPATH);      }


    private void selectLanguage(String arg0)  {
        if ("Suomi".equals(arg0))
             WebBrowser.getDriver().findElement(By.xpath("//form[@name='region_form']//select[@name = 'language_code']/option[@value = 'fi']")).click();
        if ("Svenska".equals(arg0))
            WebBrowser.getDriver().findElement(By.xpath("//form[@name='region_form']//select[@name = 'language_code']/option[@value = 'sv']")).click();
        if ("English".equals(arg0))
            WebBrowser.getDriver().findElement(By.xpath("//form[@name='region_form']//select[@name = 'language_code']/option[@value = 'en']")).click();
    }

    private void selectCurrency(String arg0) {}

    private void selectCountry(String arg0) {}

    private void selectZip(String arg0) {}

    public WebElement getSaveButton(){
        return  WebBrowser.getDriver().findElement(bySaveButton());
    }

}
