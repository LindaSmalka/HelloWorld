package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    WebDriver parluks;

    private By pageTitle = By.cssSelector("span.title");

    private By cartButton = By.id("shopping_cart_container");

    private By addToCartJacketButton = By.id("add-to-cart-sauce-labs-fleece-jacket");


    public WebElement getCartButton(){return parluks.findElement(cartButton);}

    public WebElement getAddToCartJacketButton(){
        return parluks.findElement(addToCartJacketButton);
    }

    public WebElement getPageTitle(){
        return parluks.findElement(pageTitle);
    }


    public ProductsPage(WebDriver parluks) {
        this.parluks = parluks;
    }
}
