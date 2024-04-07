package selleniun_project;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Triangle_classification {
	
	static WebDriver browser;
	static WebElement textBox;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:/Drivers/geckodriver-v0.34.0-win64/geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
	}
	
	@Test
	public void FP_Q1_TC1_equilateral() {
		textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("2");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("2");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("2");
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String expected = "Equilateral";
		String actual = browser.findElement(By.className("answer")).getText();
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q1_TC2_isosceles() {
		textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("48");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("48");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("34");
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String expected = "Isosceles";
		String actual = browser.findElement(By.className("answer")).getText();
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q1_TC3_isosceles() {
		textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("77");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("25");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("77");
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String expected = "Isosceles";
		String actual = browser.findElement(By.className("answer")).getText();
		assertEquals(expected, actual);
		browser.close();
	}

	@Test
	public void FP_Q1_TC4_isosceles() {
		textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("8");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("5");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("5");
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String expected = "Isosceles";
		String actual = browser.findElement(By.className("answer")).getText();
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q1_TC5_scalene() {
		textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("44");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("55");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("66");
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String expected = "Scalene";
		String actual = browser.findElement(By.className("answer")).getText();
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q1_TC6_notTriangle() {
		textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("10");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("10");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("30");
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String expected = "Error: Not a Triangle";
		String actual = browser.findElement(By.className("answer")).getText();
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q1_TC7_notTriangle() {
		textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("1");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("7");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("1");
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String expected = "Error: Not a Triangle";
		String actual = browser.findElement(By.className("answer")).getText();
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q1_TC8_notTriangle() {
		textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("90");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("10");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("10");
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String expected = "Error: Not a Triangle";
		String actual = browser.findElement(By.className("answer")).getText();
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q1_TC9_notTriangle() {
		textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("1");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("4");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("6");
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String expected = "Error: Not a Triangle";
		String actual = browser.findElement(By.className("answer")).getText();
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q1_TC10_side1NotANumber() {
		textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("@");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("5");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("4");
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String expected = "Error: Side 1 is not a Number";
		String actual = browser.findElement(By.className("answer")).getText();
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q1_TC11_side2NotANumber() {
		textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("2");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("H");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("3");
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String expected = "Error: Side 2 is not a Number";
		String actual = browser.findElement(By.className("answer")).getText();
		assertEquals(expected, actual);
		browser.close();
	}
	
	@Test
	public void FP_Q1_TC12_side3NotANumber() {
		textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("7");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("9");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("%");
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String expected = "Error: Side 3 is not a Number";
		String actual = browser.findElement(By.className("answer")).getText();
		assertEquals(expected, actual);
		browser.close();
	}
	
	
}
