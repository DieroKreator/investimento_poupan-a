package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {
	public static String browser = "chrome";
	public static WebDriver  driver;

	public static void main(String[] args) {
		if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equals("ie")) {
			
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			
		} else if (browser.equals("safari")) {
			
			driver = new SafariDriver();
		}
		
		driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");

		String title = driver.getTitle();
		System.out.println(title.length());
		System.out.println(title);

		driver.quit();

	}
}
