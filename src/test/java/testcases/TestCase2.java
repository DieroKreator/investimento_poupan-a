package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 extends BaseTest{
	
	@Test
	public void validateTitles() {
		
		String expected_title = "Yahoo.com";
		String actual_title = "Gmail.com";
		
		AssertJUnit.assertEquals(actual_title, expected_title);
	}
	
	
}
