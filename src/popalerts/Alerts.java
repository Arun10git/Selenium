package popalerts;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Alerts {
	WebDriver driver;
  @Test
  public void okButton() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	  Thread.sleep(4000);
	  driver.switchTo().alert().accept();
  }
  @Test
  public void Cancel() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().dismiss();
  }
  @Test
  public void sendTextOk() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
	  Thread.sleep(2000);
	  /*driver.switchTo().alert().sendKeys("Raj");
	  driver.switchTo().alert().accept();*/
	  Alert alt = driver.switchTo().alert();
	  alt.sendKeys("Babu");
	  alt.accept();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
