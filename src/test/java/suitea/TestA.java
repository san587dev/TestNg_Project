package suitea;

import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import testBase.TestBase;

public class TestA extends TestBase {

    @Test
    public void testA0() throws InterruptedException {
       // System.out.println("Starting testing A0");
        log("Starting testing A0");
        Thread.sleep(4000);
        log("Ending testing A0");
    }

    @Test
    public void testA1() throws InterruptedException {
        log("Starting test A1");
        Thread.sleep(4000);
        log("Ending testing A1");
    }
}
