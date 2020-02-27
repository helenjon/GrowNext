package test.pages.litecart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.utilities.MyLog;
import webbrowser.WebBrowser;

public class RegionalSettings  {

    String dropdownCase;

    RegionalSettings(){
        System.out.println("RegionalSettings");
        MyLog.info("RegionalSettings   opened");
    }


    public void selectDropdown(String arg0){
        dropdownCase = arg0;
        switch (arg0) {
            case "Language":
                WebBrowser.getDriver().findElement(By.xpath("//form[@name='region_form']//select[@name = 'language_code']")).click();
                break;
            case "Currency":
                WebBrowser.getDriver().findElement(By.xpath("//form[@name='region_form']//select[@name = 'language_code']")).click();
                break;
            case "Country":
                WebBrowser.getDriver().findElement(By.xpath("//form[@name='region_form']//select[@name = 'language_code']")).click();
                break;
            case "Zone/State/Province":
                WebBrowser.getDriver().findElement(By.xpath("//form[@name='region_form']//select[@name = 'language_code']")).click();
                break;
            default:
                MyLog.error(new IllegalArgumentException(arg0 + " is not found").getMessage());

        }
    }


    public void selectValue(String arg0){
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

    private void selectLanguage(String arg0)  {
        if ("Suomi".equals(arg0))
             WebBrowser.getDriver().findElement(By.xpath("//form[@name='region_form']//select[@name = 'language_code']/option[@value = 'fi']")).click();
        if ("Svenska".equals(arg0))
            WebBrowser.getDriver().findElement(By.xpath("//form[@name='region_form']//select[@name = 'language_code']/option[@value = 'sv']")).click();
        if ("English".equals(arg0))
            WebBrowser.getDriver().findElement(By.xpath("//form[@name='region_form']//select[@name = 'language_code']/option[@value = 'en']")).click();
    }

    private void selectCurrency(String arg0)  {}

    private void selectCountry(String arg0)  {}

    private void selectZip(String arg0)  {}



    public WebElement getSaveBatton(){
        return  WebBrowser.getDriver().findElement(By.xpath("//button[@name='save']"));
    }

    public String getPageLanguageValue(){
        return WebBrowser.getDriver().findElement(By.xpath(".//div[@id='region']/div[@class='language']")).getAttribute("textContent");
    }


}
