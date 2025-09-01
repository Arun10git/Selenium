package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumLocators2 {
static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void techlearnlogin() {
		//driver.get("https://www.techlearn.in/admin");
		//driver.findElement(By.id("user_login")).sendKeys("Arun");
		//driver.findElement(By.className("input")).sendKeys("Arun");
		//driver.findElement(By.cssSelector(".input")).sendKeys("Arun");
		//driver.findElement(By.name("pwd")).sendKeys("12345");
		//driver.findElement(By.cssSelector("#user_pass")).sendKeys("12345");
		//driver.findElement(By.name("rememberme")).click();
		//driver.findElement(By.linkText("Lost your password?")).click();
		//driver.findElement(By.partialLinkText("Lost your")).click();
		
	}
	@Test
	void totallinks() {
		driver.get("https://www.redmine.org");
		List<WebElement>totallinks = driver.findElements(By.tagName("a"));
		System.out.println(totallinks.size());
	}
	}


