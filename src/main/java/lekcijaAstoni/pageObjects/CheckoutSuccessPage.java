package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutSuccessPage {

    WebDriver parluks;

    private By pageTitle = By.className("title");

    private By thankYouMessage = By.cssSelector("h2");

    private By goBackHomeButton = By.id("back-to-products");

    public WebElement getPageTitle(){
        return parluks.findElement(pageTitle);
    }

    public String getMessageText() {
        return parluks.findElement(thankYouMessage).getText();
    }

    public void clickGoBackHomeButton () {parluks.findElement(goBackHomeButton).click();}





    public CheckoutSuccessPage(WebDriver parluks) {
        this.parluks = parluks;
    }
}
