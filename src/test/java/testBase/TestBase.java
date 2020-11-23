package testBase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import reports.ExtentManager;

public class TestBase
{
    public ExtentReports rep;
    public ExtentTest test;
    @BeforeMethod
    public void init()
    {
        rep = ExtentManager.getReports();
        test = rep.createTest("TestA");

    }

    @AfterMethod
    public void quit()
    {
        rep.flush();
    }
}
