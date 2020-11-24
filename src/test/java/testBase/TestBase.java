package testBase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import reports.ExtentManager;

public class TestBase
{
    public ExtentReports rep;
    public ExtentTest test;
    @BeforeMethod
    public void init(ITestResult result)
    {
        //System.out.println(result.getMethod().getMethodName().toUpperCase());//This will dynamically get the name of the method
        rep = ExtentManager.getReports();// We can set the path of the reports in getRports().
        test = rep.createTest(result.getMethod().getMethodName().toUpperCase());

    }

    @AfterMethod
    public void quit()
    {
        rep.flush();// We are flushing the reports after every test function.
    }

    public void log(String msg)
    {
        test.log(Status.INFO,msg);
    }

}
