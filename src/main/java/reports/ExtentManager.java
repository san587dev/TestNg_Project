package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import javax.xml.crypto.Data;
import java.io.File;
import java.util.Date;

public class ExtentManager
{
    static ExtentReports reports;
    public static ExtentReports getReports()
    {
        if(reports == null)
        {
            reports = new ExtentReports();
            Date d = new Date();
            System.out.println(d.toString().replaceAll(":","-"));
            String reportsFolder = d.toString().replaceAll(":","-")+"//screenshots";

            String screenshotFolderPath = System.getProperty("user.dir")+"//reports//"+reportsFolder;
            String reportsFolderPath = System.getProperty("user.dir")+"//reports//"+d.toString().replaceAll(":","-");

            File f = new File(screenshotFolderPath);
            f.mkdirs();
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportsFolderPath);
            sparkReporter.config().setReportName("Production Regression Testing");
            sparkReporter.config().setDocumentTitle("Automation Reports");
            sparkReporter.config().setTheme(Theme.DARK);
            sparkReporter.config().setEncoding("utf-8");

            reports.attachReporter(sparkReporter);
        }
        return reports;
    }
}
