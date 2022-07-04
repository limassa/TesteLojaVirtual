package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.jv.Nalika;

public class Utils {

	public static WebDriver driver;
	
	public static void acessarSistema() {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
	}
	
	
	public static <T> T Na(Class<T> classe) {
		return PageFactory.initElements(driver, classe);
	
		
	}
	
}
