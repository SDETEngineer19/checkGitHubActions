package com.qa.omayo.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practiceTest {

	protected static WebDriver driver = null;
	protected static WebDriverWait wait = null;
	
	@BeforeMethod
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	
	@Test
	public void validations() {
		
		String title = driver.getTitle();
		Assert.assertEquals("omayo (QAFox.com)", title);
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
