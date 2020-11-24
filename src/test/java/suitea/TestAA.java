package suitea;

import org.testng.annotations.Test;
import testBase.TestBase;

public class TestAA extends TestBase
{
    @Test
    public void testAA0() throws InterruptedException {
        System.out.println("Starting testing AA0");
        Thread.sleep(4000);
        System.out.println("Ending testing AA0");
    }

    @Test
    public void testAA1() throws InterruptedException {
        System.out.println("Starting test AA1");
        Thread.sleep(4000);
        System.out.println("Ending testing AA1");
    }
}
