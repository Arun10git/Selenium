package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoThree {
static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void google() {
	driver.get("https://www.google.com");
	}
	@Disabled
	@Test
	void selenium() {
		driver.get("https://www.selenium.dev");
	}
	@Disabled
	@Test
	void twitter() {
		driver.get("https://www.x.com");
	}
	@Test
	void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test
	void facebook() {
		driver.get("https://www.facebook.com");
	}
}
