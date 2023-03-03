import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Listener failed code is executed"+ result.getName());
	}
public void onTestSuccess(ITestResult result) {
		System.out.println("Listener pass code is executed");
	}


}
