package iframes;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IFrames {
	WebDriver driver;
  @Test
  public void handleifrmaes() throws InterruptedException {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(5000);
	  WebElement frm = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
	  driver.switchTo().frame(frm);
	  driver.findElement(By.xpath("/html/body/button")).click();
	  driver.switchTo().alert().accept();
	  driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("/html/body/div[2]/div/a[5]")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
