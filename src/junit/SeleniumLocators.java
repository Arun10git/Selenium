package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumLocators {
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
	void amazon() throws InterruptedException {
	driver.get("https://www.amazon.in");
	Thread.sleep(2000);
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys("9629323522");
	Thread.sleep(2000);
	driver.findElement(By.className("a-button-input")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#ap_password")).sendKeys("Arun@10");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Forgot password?")).click();
	}

}
