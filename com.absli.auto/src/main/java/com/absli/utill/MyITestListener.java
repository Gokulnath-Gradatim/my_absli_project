package com.absli.utill;
import java.io.IOException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.absli.base.AbsliBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class MyITestListener extends AbsliBase implements ITestListener  {
	
	public ExtentSparkReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
			

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		System.out.println("*****Starting Test Case*****");
		System.out.println("Test Case Started: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("Test Case Success: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		try {
			String failureTestCaseName = result.getName();
			TestUtill.takeScreenshotAtEndOfTest(failureTestCaseName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("*****Test Case is Failed*****");
		System.out.println("Test Case Name: "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.AMBER));
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		try {
			String skippedTestCaseName = result.getName();
			TestUtill.takeScreenshotAtEndOfTest(skippedTestCaseName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("*****Test case is Skipped*****");
		System.out.println("Test Case Name: "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		String reportName = "Test-Report-" +TestUtill.getDateTimeString() +".html";
		htmlReporter=new ExtentSparkReporter("./extent-reports/" + reportName);
		
		try {
			htmlReporter.loadXMLConfig("./extent-config.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		extent=new ExtentReports();

		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Tester", "Gokul");
		extent.setSystemInfo("OS", System.getProperty("os.name"));
		extent.setSystemInfo("Java Version", System.getProperty("java.version"));
		extent.setSystemInfo("Browser", prof.getProperty("browser"));
		extent.setSystemInfo("Application URL", prof.getProperty("url"));
		extent.setSystemInfo("Username", prof.getProperty("username"));
		extent.setSystemInfo("Password", prof.getProperty("password"));
		
		
		htmlReporter.config().setDocumentTitle("Absli Automation Test Report");
		htmlReporter.config().setReportName("Regression Test Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		System.out.println("Test Name: "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		ITestListener.super.onFinish(context);
		System.out.println("Test Finished: "+context.getName());
	}

}
