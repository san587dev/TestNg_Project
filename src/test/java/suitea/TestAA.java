package suitea;

import org.testng.annotations.Test;
import testBase.TestBase;

public class TestAA extends TestBase
{
    @Test
    public void testAA0() throws InterruptedException {
        log("Starting testing AA0");
        Thread.sleep(4000);
        log("Ending testing AA0");
    }

    @Test
    public void testAA1() throws InterruptedException {
        log("Starting test AA1");
        Thread.sleep(4000);
        log("Ending testing AA1");
    }
}
