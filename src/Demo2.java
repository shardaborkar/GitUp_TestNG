import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {
	@Parameters({"URL","Username","Password"})
	@Test(groups= {"Smoke"})
public void test3(String urlname,String uname,String pass) {
	System.out.println("good");
	System.out.println(urlname+" "+uname+" "+pass);
}
	@BeforeTest
	public void test4() {
		System.out.println("I want to execute first");
	}
	@AfterTest
	public void test5() {
		System.out.println("I want to execute @ last");
	}
}
