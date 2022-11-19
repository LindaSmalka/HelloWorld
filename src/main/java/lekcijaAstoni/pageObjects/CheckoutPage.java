package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    WebDriver parluks;

    private By pageTitle = By.className("title");
    private By continueButton = By.id("continue");

    private By errorText = By.cssSelector("h3");

    private By firstNameInputField = By.id("first-name");

    private By lastNameInputField = By.id("last-name");

    private By postalCodeInputField = By.id("postal-code");

    //MD klāt jāpieliek uzvārds / zip kods
    // arī metodes ar abiem

    public void inputPostalCode(String a){
        parluks.findElement(postalCodeInputField).sendKeys(a);
    }


    public void inputLastName(String a){
        parluks.findElement(lastNameInputField).sendKeys(a);
    }

   public void inputFirstName(String a){
       parluks.findElement(firstNameInputField).sendKeys(a);
   }


    public String getErrorText() {
        return parluks.findElement(errorText).getText();
    }

    public WebElement getPageTitle(){
        return parluks.findElement(pageTitle);
    }

    //uzreiz uzklikšķinās uz pogas
    public void clickContinueButton(){
        parluks.findElement(continueButton).click();
    }

//    public WebElement getContinueButton(){
//        return parluks.findElement(continueButton);
//    }




    public CheckoutPage(WebDriver parluks) {
        this.parluks = parluks;
    }
}
