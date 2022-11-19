package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {

    WebDriver parluks;

    private By pageTitle = By.className("title");

    private By productNameJacket = By.id("item_5_title_link");

    private By finishButton = By.id("finish");


    public WebElement getPageTitle(){
        return parluks.findElement(pageTitle);
    }

    public WebElement getProductNameJacket() { return parluks.findElement(productNameJacket);}

    public void clickFinishButton(){ parluks.findElement(finishButton).click();
    }

    public CheckoutOverviewPage(WebDriver parluks) {
        this.parluks = parluks;
    }
}
