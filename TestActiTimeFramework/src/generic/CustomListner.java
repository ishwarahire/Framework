package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class CustomListner extends BaseTest implements ITestListener {

@Override
public void onTestStart(ITestResult result) {
	Reporter.log("test has been started", true);
	
	
}

@Override
public void onTestSuccess(ITestResult result) {

	Reporter.log("test successfully executed", true);
}

@Override
public void onTestFailure(ITestResult result) {

		String MethodName = result.getMethod().getMethodName();
		Reporter.log("test"+MethodName+"is failed screenshot is taken",true);
		failed(MethodName);
	}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	
}

@Override
public void onTestFailedWithTimeout(ITestResult result) {

	
}

@Override
public void onStart(ITestContext context) {
	
	
}

@Override
public void onFinish(ITestContext context) {
	Reporter.log("Execution has been finished", true);
}
	
	
	
	
}
