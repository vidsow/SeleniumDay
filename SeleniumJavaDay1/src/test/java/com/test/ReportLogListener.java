package com.test;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;


public class ReportLogListener implements ITestListener {
	Logger log=LogManager.getLogger(ReportLogListener.class);

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	System.out.println(result.getMethod().getMethodName()+"Test Start");
	log.info(result.getMethod().getMethodName()+"Test Started");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+"Test Success");
		log.info(result.getMethod().getMethodName()+"Test Success");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+"Test Failure");
		log.info(result.getMethod().getMethodName()+"Test Failure");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+"Test Skipped");
		log.info(result.getMethod().getMethodName()+"Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+"Test FailedButwithin Success Percentage");
		log.info(result.getMethod().getMethodName()+"Test Failed But Witin Success Percentage");
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+"Test Start");
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+"Test Finish");
		
	}
	}
	