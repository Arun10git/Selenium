package verificationmethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TabTitleAppUrlAppText {
	WebDriver driver;
	@Test
	public void VerifyTabTitle() {
		driver.get("https://www.google.com");
		String expectedTitle = "Google";
		System.out.println("Expected TabTitle is -"+expectedTitle);
		String actualTitle = driver.getTitle();
		System.out.println("Actual TabTitle is -"+actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);

	}
	@Test
	public void VerifyAppUrl() {
		driver.get("https://www.google.com");
		String expectedUrl = "https://www.google.com/";
		String actualUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualUrl, expectedUrl);

	}
	@Test
	public void VerifyAppText() {
		driver.get("https://www.google.com");
		String expectedgtext = "Gmail";
		String actualgtext = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/a")).getText();
		Assert.assertEquals(actualgtext, expectedgtext);
		String expectedgimg = "Images";
		String actualgimg = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[2]/a")).getText();
		Assert.assertEquals(actualgimg, expectedgimg);
	}
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
