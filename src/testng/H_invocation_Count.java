package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class H_invocation_Count {
	WebDriver driver;
  @Test(invocationCount=6)
  public void method1() {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("arun");
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("1234");
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	 
  }
  @Test
  public void method2() {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("raj");
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("123456");
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
