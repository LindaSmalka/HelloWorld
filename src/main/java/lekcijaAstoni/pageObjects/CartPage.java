package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    WebDriver parluks; //visur

    private By checkoutButton = By.id("checkout");
    private By pageTitle = By.className("title");
    private By cartElements = By.className("shopping_cart_badge");
    private By productNameJacket = By.id("item_5_title_link");


    public String getCartElements () {return parluks.findElement(cartElements).getText();}
    public WebElement getCheckoutButton(){
        return parluks.findElement(checkoutButton);
    }
    public WebElement getProductNameJacket() { return parluks.findElement(productNameJacket);}
    public WebElement getPageTitle () { return parluks.findElement(pageTitle);  }

    public CartPage(WebDriver parluks) {
        this.parluks = parluks;
    }
}
