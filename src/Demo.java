import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo {
SoftAssert sa=new SoftAssert();
@Test()
@Parameters({"URL","Username","Password"})
public void test1(String urlname,String uname,String pass) 
{
System.out.println("GitUp TestNG hello");
System.out.println(urlname+" "+uname+" "+pass);
}
/*Assert.assertTrue(false);
sa.assertTrue(false,"test1 is failed");
sa.assertEquals(12,13,"test2 is failed count mismatches");
System.out.println("test completed");
sa.assertAll();*/





@Test(enabled=true)
public void test2() {
System.out.println("GitUp TestNG bye");

}

@Test()
public void test4() {
System.out.println("GitUp TestNG good");

}

@AfterSuite
public void test3() {
System.out.println("I am after suite");
}



}
