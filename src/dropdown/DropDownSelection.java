package dropdown;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDownSelection {
	WebDriver driver;
  @Test
  public void DropDownValues() throws InterruptedException {
	  driver.get("https://www.redmine.org");
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("abcd1234@gmail.com");
	  Thread.sleep(2000);
	 // Select l = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
	 // l.selectByVisibleText("German (Deutsch)");
	  //l.selectByValue("fr");
	  //l.selectByIndex(7);
	 // l.selectByContainsVisibleText("Bulga");
	  new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]"))).selectByIndex(7);
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

}
