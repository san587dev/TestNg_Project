package suiteb;

import org.testng.annotations.Test;
import testBase.TestBase;

public class TestB extends TestBase
{
    @Test
    public void testB0() throws InterruptedException {
        log("Starting test B0");
        Thread.sleep(4000);
        log("Ending test B0");
    }

    @Test
    public void testB1() throws InterruptedException {
        log("Starting test B1");
        Thread.sleep(4000);
        log("Ending test B1");
    }
}
