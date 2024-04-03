package selleniun_project;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Password_validation {
	
	static WebDriver browser;
	static WebElement textBox;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:/Drivers/geckodriver-v0.34.0-win64/geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		browser.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
	}
	
	@Test
	public void FP_Q2_TC1_validPassword() {
		textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("idohad1");
		browser.findElement(By.name("validate")).click();
		
		String expected = "Valid Value";
		String actual = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q2_TC2_invalidPassword() {
		textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("idohad$");
		browser.findElement(By.name("validate")).click();
		
		String expected = "Invalid Value";
		String actual = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q2_TC3_validPassword() {
		textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("idohad*");
		browser.findElement(By.name("validate")).click();
		
		String expected = "Valid Value";
		String actual = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q2_TC4_invalidShortPassword() {
		textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("hada");
		browser.findElement(By.name("validate")).click();
		
		String expected = "Invalid Value";
		String actual = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q2_TC5_invalidLongPassword() {
		textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("ido123had1");
		browser.findElement(By.name("validate")).click();
		
		String expected = "Invalid Value";
		String actual = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, actual);
		browser.close();
	}
	
}
