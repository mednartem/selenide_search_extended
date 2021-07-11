package qa.guru.homework.pages;

import com.codeborne.selenide.SelenideElement;

public class BasePage {


    public void setValueOfElement(SelenideElement element, String value) throws InterruptedException {
        getElement(element).setValue(value);
    }

    public void clickElement(SelenideElement element) throws InterruptedException {
        getElement(element).click();
    }

    private SelenideElement getElement(SelenideElement element) throws InterruptedException {
        if (element.isDisplayed()) {
            return element.scrollTo();
        } else {
            element.wait(30000);
            return element.scrollTo();
        }
    }

}
