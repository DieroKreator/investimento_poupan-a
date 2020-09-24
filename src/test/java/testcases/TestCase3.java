package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestCase3 extends BaseTest{
		
		@Test(priority=1)
		public void doUserReg() {
			System.out.println("Exe user reg test");
		}
		
		@Test(priority=2,dependsOnMethods="doUserReg")
		public void doLogin() {
			System.out.println("Exe login");
		}
	
}
