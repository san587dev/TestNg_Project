package suiteb;

import org.testng.annotations.Test;
import testBase.TestBase;

public class TestB extends TestBase
{
    @Test
    public void testB0() throws InterruptedException {
        System.out.println("Starting test B0");
        Thread.sleep(4000);
        System.out.println("Ending test B0");
    }

    @Test
    public void testB1() throws InterruptedException {
        System.out.println("Starting test B1");
        Thread.sleep(4000);
        System.out.println("Ending test B1");
    }
}
