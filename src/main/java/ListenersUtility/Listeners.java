package ListenersUtility;


import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners  implements ITestListener,ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		Reporter.log("siut execution started-configuree report",true);
		
}

	@Override
	public void onFinish(ISuite suite) {
		Reporter.log("siut execution ended- report backup",true);
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("siut execution sucess",true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("siut execution  failure",true);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("siut execution skiped",true);
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("siut execution started",true);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("siut execution started ended",true);
	}

}
