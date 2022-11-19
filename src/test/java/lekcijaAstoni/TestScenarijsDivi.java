package lekcijaAstoni;

import lekcijaAstoni.pageObjects.*;
import lekcijaSeptini.labDarbs.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenarijsDivi extends BaseTest {

    @Test
    public void testCheckoutPageMandatoryFields() throws InterruptedException {

        System.out.println("Ielogoties ar pareizu lietotāja vārdu/paroli");
        LoginPage loginPage = new LoginPage (parluks);
        loginPage.login("standard_user", "secret_sauce");
        ProductsPage produktuLapa = new ProductsPage(parluks);
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");

        System.out.println("Doties uz grozu");
        CartPage grozaLapa = new CartPage(parluks);
        produktuLapa.getCartButton().click();
        Assert.assertEquals(grozaLapa.getPageTitle().getText(),"YOUR CART");

        System.out.println("Doties uz Checkout");
        grozaLapa.getCheckoutButton().click();
        CheckoutPage checkoutLapa = new CheckoutPage(parluks);
        Assert.assertEquals(checkoutLapa.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutLapa.clickContinueButton();

        System.out.println("Pārbaudīt, ka FirstName/LastName/Zip code ir obligāts");

        Assert.assertEquals(checkoutLapa.getErrorText(),"Error: First Name is required");

        System.out.println("Pārbaudīt, ka forma parāda pareizu kļūdas paziņojumu");
        checkoutLapa.inputFirstName("Linda");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getErrorText(),"Error: Last Name is required");

        checkoutLapa.inputLastName("Test");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getErrorText(),"Error: Postal Code is required");

        checkoutLapa.inputPostalCode("LV");

        System.out.println("Doties tālāk");
        checkoutLapa.clickContinueButton();
        CheckoutOverviewPage checkoutOverviewLapa = new CheckoutOverviewPage(parluks);
        Assert.assertEquals(checkoutOverviewLapa.getPageTitle().getText(),"CHECKOUT: OVERVIEW");

        System.out.println("Tests pabeigts");

        Thread.sleep(5000);

    }
}
