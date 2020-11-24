package suitec;

import org.testng.annotations.Test;
import testBase.TestBase;

public class TestC extends TestBase
{
    @Test
    public void testC0() throws InterruptedException {
        System.out.println("Starting test C0");
        Thread.sleep(4000);
        System.out.println("Ending test C0");
    }

    @Test
    public void testC1() throws InterruptedException {
        System.out.println("Starting test C1");
        Thread.sleep(4000);
        System.out.println("Ending test C1");
    }
}
