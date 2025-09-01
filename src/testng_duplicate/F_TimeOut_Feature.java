package testng_duplicate;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class F_TimeOut_Feature {
	WebDriver driver;
  @Test
  public void method1() {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Arun");
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("1234");
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
  }
  @Test(timeOut=3000)
  public void method2() {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Raj");
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("12345");
	driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
  }
 
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
