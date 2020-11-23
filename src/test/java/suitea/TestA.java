package suitea;

import org.testng.annotations.Test;
import testBase.TestBase;

public class TestA extends TestBase {

    @Test
    public void testA() throws InterruptedException {
        System.out.println("Starting testing A");
        Thread.sleep(3000);
        System.out.println("Ending testing A");
    }

    @Test
    public void testA1() throws InterruptedException {
        System.out.println("Starting test A1");
        Thread.sleep(4000);
        System.out.println("Ending testing A1");
    }
}
