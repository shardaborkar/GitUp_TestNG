import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {
	@BeforeClass
	public void  beforeclass() {
		System.out.println("I am before class");
	}
	@AfterClass
	public void  afterclass() {
		System.out.println("I am after class");
	}
	@Test(groups= {"Smoke"})
public void  WebLoginCarLoan() {
	System.out.println("WebLoginCarLoan");
	
}
@Parameters({"URL"})
@Test(groups= {"Smoke"})
public void  MobileLoginCarLoan(String urlname) {
	System.out.println("MobileLoginCarLoan");
	System.out.println(urlname);
}

@Test(groups= {"Regression"})
public void  MobileSigninCarLoan() {
	System.out.println("MobileSigninCarLoan");
}
@Parameters({"URL"})
@Test(groups= {"Smoke","Regression"})
public void  MobileSignOutCarLoan(String urlname) {
	System.out.println("MobileSignoutCarLoan");

System.out.println(urlname);
}

@Test(groups= {"Regression"})
public void  APILoginCarLoan() {
	System.out.println("APILoginCarLoan");
}

}
