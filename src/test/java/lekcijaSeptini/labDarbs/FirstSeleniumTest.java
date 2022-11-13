package lekcijaSeptini.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver parluks;

    @BeforeMethod
    public void setupBrowser(){
        parluks = new ChromeDriver();
        parluks.navigate().to("https://www.lu.lv/");
    }

    @AfterMethod
    public void tearDownBrowser () {
        parluks.quit();
    }



    @Test
    public void testFirstWebPage() {
        System.out.println("Pirmais Selenium tests");
//        WebDriver parluks = new ChromeDriver();                         //var aizkomentēt jo augšā jau ir definēts klases ietvaros un ir Before un After metodes
//        parluks.navigate().to("https://www.lu.lv/");
        parluks.manage().window().maximize();
//        parluks.quit();
    }


    @Test
    public void testPageTitle (){
//        WebDriver parluks = new ChromeDriver();
//        parluks.get("https://www.lu.lv/");
        String nosaukums = parluks.getTitle();
        Assert.assertEquals(nosaukums, "Latvijas Universitāte");
//        parluks.quit();

    }


}
