package lekcijaAstoni;

import lekcijaAstoni.pageObjects.*;
import lekcijaSeptini.labDarbs.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenarijsViens extends BaseTest {

    @Test
    public void testPageFlow () throws InterruptedException {
        System.out.println("Ielogoties");
        LoginPage loginPage = new LoginPage (parluks);
        loginPage.login("standard_user", "secret_sauce");

        System.out.println("Pārbaudīt, ka lietotājs ir ielogojies");
        ProductsPage produktuLapa = new ProductsPage(parluks);
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");

        System.out.println("Ievietot Grozā 1 produktu");
        produktuLapa.getAddToCartJacketButton().click();

        System.out.println("Doties uz grozu un pārbaudīt, kā šī prece ir grozā");
        produktuLapa.getCartButton().click();
        CartPage grozaLapa = new CartPage(parluks);
        Assert.assertEquals(grozaLapa.getProductNameJacket().getText(), "Sauce Labs Fleece Jacket");
        Assert.assertEquals(grozaLapa.getCartElements(), "1");

        System.out.println("Doties uz Checkout");
        grozaLapa.getCheckoutButton().click();
        CheckoutPage checkoutLapa = new CheckoutPage(parluks);
        Assert.assertEquals(checkoutLapa.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");

        System.out.println("Ievadīt vārdu/uzvārdu/pasta indeksu");
        checkoutLapa.inputFirstName("Linda");
        checkoutLapa.inputLastName("Test");
        checkoutLapa.inputPostalCode("LV");

        System.out.println("Doties uz Checkout overview lapu, pārbaudīt datus");
        checkoutLapa.clickContinueButton();
        CheckoutOverviewPage checkoutOverviewLapa = new CheckoutOverviewPage(parluks);
        Assert.assertEquals(checkoutOverviewLapa.getPageTitle().getText(),"CHECKOUT: OVERVIEW");
        Assert.assertEquals(checkoutOverviewLapa.getProductNameJacket().getText(), "Sauce Labs Fleece Jacket");

        System.out.println("Doties uz finish lapu un pārbaudīt vai viss bija veiksmīgi");
        checkoutOverviewLapa.clickFinishButton();
        CheckoutSuccessPage checkoutSuccessLapa = new CheckoutSuccessPage(parluks);
        Assert.assertEquals(checkoutSuccessLapa.getPageTitle().getText(),"CHECKOUT: COMPLETE!");
        Assert.assertEquals(checkoutSuccessLapa.getMessageText(),"THANK YOU FOR YOUR ORDER");

        System.out.println("Doties atpakaļ uz pirmo lapu ar pogu 'Back Home'");
        checkoutSuccessLapa.clickGoBackHomeButton();
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");

        System.out.println("Tests pabeigts");

        Thread.sleep(5000);

    }

}
