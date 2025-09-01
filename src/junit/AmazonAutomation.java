package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AmazonAutomation {
static WebDriver driver;
@Test
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void amazon() {
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kurta sets for woman");
		driver.findElement(By.className("nav-right")).click();
		driver.findElement(By.xpath("//img[@alt=\"ANNI DESIGNER Women's Rayon Blend Solid Straight Kurta with Pant & Dupatta\"]")).click();
		driver.findElement(By.id("a-autoid-13-announce")).click();
		driver.findElement(By.id("quantity_2")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.className("a-input-text")).sendKeys("9629323522");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.className("a-link-normal")).click();
		}

}
