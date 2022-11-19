package lekcijaSeptini.labDarbs;

import lekcijaAstoni.pageObjects.LoginPage;
import lekcijaAstoni.pageObjects.ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoLoginTest extends BaseTest {
//    WebDriver parluks;      ///aiztaisam ciet, jo pielikām Extends
//
//    @BeforeMethod
//    public void setupBrowser(){
//        parluks = new ChromeDriver();
//        parluks.manage().window().maximize();
//        parluks.navigate().to("https://www.saucedemo.com/");
//    }
//
//    @AfterMethod
//    public void tearDownBrowser () {
//        parluks.quit();
//    }



    @Test
    public void testLoginPageObjectExample (){
        LoginPage loginPage = new LoginPage (parluks);
        loginPage.login("hghghgh", "jhdjfhdjsf");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username and password do not match any " +
                "user in this service");
    }



    @Test
    public void testLoginWrongUsernameAndPassword () throws InterruptedException {
//        Thread.sleep(5000); //ja mēs gribam lai lapa atveras mazliet ilgāk
        WebElement lietotajVardsIevadesLauks= parluks.findElement(By.id("user-name"));  //userNameInputField
        lietotajVardsIevadesLauks.sendKeys("nepareizi");

        WebElement parolesIevadesLauks = parluks.findElement(By.id("password"));
        parolesIevadesLauks.sendKeys("xhxhgs");

        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();

        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));

        String errorText = errorTextField.getText();
        Assert.assertEquals(errorText, "Epic sadface: Username and password do not match any user in this service");

        Thread.sleep(5000);
    }


    //uztaisam metodi, ko varam pec tam izmantot testos, lai nebutu viss jaraksta pa jaunu
    private void testLogin(String username, String password, String expectedErrorMessage) {


        WebElement lietotajVardsIevadesLauks= parluks.findElement(By.id("user-name"));  //userNameInputField
        lietotajVardsIevadesLauks.sendKeys(username);

        WebElement parolesIevadesLauks = parluks.findElement(By.id("password"));
        parolesIevadesLauks.sendKeys(password);

        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();

        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));

        String errorText = errorTextField.getText();
        Assert.assertEquals(errorText, expectedErrorMessage);

    }

    @Test
    public void testLoginWrongUsernameAndPassword2 () {
        testLogin("gdfdsf", "jhdsfjsdjf", "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void testLoginEmptyUsernameAndPassword () {
        testLogin("", "", "Epic sadface: Username is required");
    }

    @Test
    public void testLoginEmptyUsernameAndFilledPassword () {
        testLogin("", "dfsdfsdfsd", "Epic sadface: Username is required");
    }

    @Test
    public void testLoginFilledUsernameAndEmptyPassword () {
        testLogin("testtest", "", "Epic sadface: Password is required");
    }




    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = new LoginPage (parluks);
        loginPage.login("standard_user", "secret_sauce");
        ProductsPage produktuLapa = new ProductsPage(parluks);

        wait.until(ExpectedConditions.visibilityOf(produktuLapa.getPageTitle()));
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");



    }

}
