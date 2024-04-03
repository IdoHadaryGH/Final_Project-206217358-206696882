package selleniun_project;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Selenium_calculator {
	
	static WebDriver browser;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:/Drivers/geckodriver-v0.34.0-win64/geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		browser.get("https://testpages.eviltester.com/styled/apps/calculator.html");
	}
	
	@Test
	public void FP_Q3_TC1_additionOperationBetweenIntegers() {
		browser.findElement(By.id("button01")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button02")).click();
		browser.findElement(By.id("buttonequals")).click();
		
		String expected = "3";
		String actual = browser.findElement(By.id("calculated-display")).getAttribute("value");
		System.out.println("TC1- Answer to plus operation: "+ actual);
		assertEquals(expected, actual);
		browser.close();
	}
	@Test
	public void FP_Q3_TC2_additionOperationBetweenDecimals() {
		browser.findElement(By.id("button01")).click();
		browser.findElement(By.id("buttondot")).click();
		browser.findElement(By.id("button05")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button02")).click();
		browser.findElement(By.id("buttondot")).click();
		browser.findElement(By.id("button05")).click();
		browser.findElement(By.id("buttonequals")).click();
		
		String expected = "4";
		String actual = browser.findElement(By.id("calculated-display")).getAttribute("value");
		System.out.println("TC2- Answer to plus operation: "+ actual);
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q3_TC3_subtractionOperationBetweenIntegers() {
		browser.findElement(By.id("button04")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button03")).click();
		browser.findElement(By.id("buttonequals")).click();
		
		String expected = "1";
		String actual = browser.findElement(By.id("calculated-display")).getAttribute("value");
		System.out.println("TC3- Answer to minus operation: "+ actual);
		assertEquals(expected, actual);
		browser.close();
	}
	@Test
	public void FP_Q3_TC4_subtractionOperationBetweenDecimals() {
		browser.findElement(By.id("button04")).click();
		browser.findElement(By.id("buttondot")).click();
		browser.findElement(By.id("button05")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button02")).click();
		browser.findElement(By.id("buttondot")).click();
		browser.findElement(By.id("button05")).click();
		browser.findElement(By.id("buttonequals")).click();
		
		String expected = "2";
		String actual = browser.findElement(By.id("calculated-display")).getAttribute("value");
		System.out.println("TC4- Answer to minus operation: "+ actual);
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q3_TC5_multiplicationOperationBetweenIntegers() {
		browser.findElement(By.id("button05")).click();
		browser.findElement(By.id("buttonmultiply")).click();
		browser.findElement(By.id("button06")).click();
		browser.findElement(By.id("buttonequals")).click();
		
		String expected = "30";
		String actual = browser.findElement(By.id("calculated-display")).getAttribute("value");
		System.out.println("TC5- Answer to multiplication operation: "+ actual);
		assertEquals(expected, actual);
		browser.close();
	}
	@Test
	public void FP_Q3_TC6_multiplicationOperationBetweenDecimals() {
		browser.findElement(By.id("button07")).click();
		browser.findElement(By.id("buttondot")).click();
		browser.findElement(By.id("button05")).click();
		browser.findElement(By.id("buttonmultiply")).click();
		browser.findElement(By.id("button08")).click();
		browser.findElement(By.id("buttondot")).click();
		browser.findElement(By.id("button05")).click();
		browser.findElement(By.id("buttonequals")).click();
		
		String expected = "63.75";
		String actual = browser.findElement(By.id("calculated-display")).getAttribute("value");
		System.out.println("TC6- Answer to multiplication operation: "+ actual);
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q3_TC7_divisionOperationBetweenIntegers() {
		browser.findElement(By.id("button09")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button03")).click();
		browser.findElement(By.id("buttonequals")).click();
		
		String expected = "3";
		String actual = browser.findElement(By.id("calculated-display")).getAttribute("value");
		System.out.println("TC7- Answer to division operation: "+ actual);
		assertEquals(expected, actual);
		browser.close();
	}
	@Test
	public void FP_Q3_TC8_divisionOperationBetweenIntegerAndZero() {
		browser.findElement(By.id("button09")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button00")).click();
		browser.findElement(By.id("buttonequals")).click();
		
		String expected = "Infinity";
		String actual = browser.findElement(By.id("calculated-display")).getAttribute("value");
		System.out.println("TC8- Answer to division operation: "+ actual);
		assertEquals(expected, actual);
		browser.close();
	}
	
}
