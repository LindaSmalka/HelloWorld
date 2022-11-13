package lekcijaSesiTest.majasDarbs;

import lekcijaCetri.labDarbs.Rinkis;
import lekcijaSesi.majasDarbs.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    Calculator calculator = new Calculator();


    @Test
    public void testCalculatorAdd() {
        System.out.println("Testējam summu");
        int expectedAdd = 13;
        int actualAdd = calculator.add(5, 8);
        Assert.assertEquals(actualAdd, expectedAdd);
    }

    @Test
    public void testCalculatorSubstract() {
        System.out.println("Testējam starpību");
        int expectedSubstract = 125;
        int actualSubstract = calculator.substract(145, 20);
        Assert.assertEquals(actualSubstract, expectedSubstract);
    }

    @Test
    public void testCalculatorMultiply() {
        System.out.println("Testējam reizināšanu");
        int expectedMultiply = 45;
        int actualMultiply = calculator.multiply(5, 9);
        Assert.assertEquals(actualMultiply, expectedMultiply);
    }


    @Test
    public void testCalculatordivision() {
        System.out.println("Testējam dalīšanu");
        float expecteddivision = 20;
        float actualdivision = calculator.divide(100, 5);
        Assert.assertEquals(actualdivision, expecteddivision);
    }


}
