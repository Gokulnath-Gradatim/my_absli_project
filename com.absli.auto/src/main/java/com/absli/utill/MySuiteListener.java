package com.absli.utill;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MySuiteListener implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {

		System.out.println("Suite Name: "+suite.getName());
	}
	
	@Override
	public void onFinish(ISuite suite) {
		
		System.out.println("Finished Suite Name: "+suite.getName());
	}
}
