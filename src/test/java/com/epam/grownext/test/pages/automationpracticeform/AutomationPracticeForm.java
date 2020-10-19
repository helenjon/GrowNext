package com.epam.grownext.test.pages.automationpracticeform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.epam.grownext.test.pages.BasePage;
import com.epam.grownext.webbrowser.WebBrowser;

public class AutomationPracticeForm extends BasePage {

    public static final String PAGE_IDENTIFIER = "Automation Practice Form";

    private static final String INPUT_XPATH = "//input[@value='%s']";
    private static final String URL = "https://www.toolsqa.com/automation-practice-form/";

    @Override
    public void getPage() {
        WebBrowser.getDriver().get(URL);
    }

    public AutomationPracticeForm() {
        WebBrowser.getDriver().get(URL);
    }

    public void setValue(String text) {
        WebElement element = WebBrowser.getDriver().findElement(By.xpath(String.format(INPUT_XPATH, text)));
        Actions actions = new Actions(WebBrowser.getDriver());
        actions.moveToElement(element);
        element.click();

    }
}
