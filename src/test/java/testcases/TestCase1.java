package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest{
	
	@BeforeTest
	public void createDBConnection() {
		System.out.println("Creating db connection");
	}
	
	@AfterTest
	public void closeDBConnection() {
		System.out.println("Closing db connection");
	}
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launching browser");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing browser");
	}
	
	@Test(priority=1)
	public void doUserReg() {
		System.out.println("Exe user reg test");
	}
	
	@Test(priority=2)
	public void doLogin() {
		System.out.println("Exe login");
	}

}
