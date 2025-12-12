package com.selenium.ui.reporter;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;


public class ExtentManager {

	public static ExtentReports extentreports;

	public synchronized static ExtentReports getInstance() {
		if (extentreports == null) {
			return createInstance();
		} else {
			return extentreports;
		}
	}

	public static ExtentReports createInstance() {

		String reportDir = System.getProperty("user.dir") + "/test-output/ExtentReport/";
		File folder = new File(reportDir);
		if (!folder.exists()) {
			folder.mkdirs(); // creates test-output AND ExtentReport if missing
		}
		String filePath = reportDir + "Automation.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(filePath);
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Myphysicianplan");
		reporter.config().setDocumentTitle("Automation Report");
		extentreports = new ExtentReports();
		extentreports.attachReporter(reporter);
		return extentreports;
	}


}
