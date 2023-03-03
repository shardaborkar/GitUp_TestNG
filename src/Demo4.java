import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo4 {
	@BeforeMethod
	public void  beforemethod() {
		System.out.println("I am before method");
	}
	@AfterMethod
	public void  aftermethod() {
		System.out.println("I am after method");
	}
	@Parameters({"URL"})
	
	@Test
	public void  WebLoginHomeLoan(String urlname) {
		System.out.println("WebLoginHomeLoan");
		System.out.println(urlname);
	}

	@Test(groups= {"Smoke"})
	public void  MobileLoginHomeLoan() {
		System.out.println("MobileLoginHomeLoan");
	}
	

	@Test(dataProvider="data")
	public void  APILoginHomeLoan(String uname,String pss) {
		System.out.println("APILoginHomeLoan");
		System.out.println(uname);
		System.out.println(pss);
	}
	
	@DataProvider
	public Object[][] data()
	{
	Object[][] obj=new Object[3][2];
	obj[0][0]="first username";
	obj[0][1]="first password";
	obj[1][0]="second username";
	obj[1][1]="second password";
	obj[2][0]="third username";
	obj[2][1]="third password";
	return obj;
	}
	
	@BeforeSuite
	public void test2() {
	System.out.println("I am the before suite");
	}
	}

