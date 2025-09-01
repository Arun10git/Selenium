package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class E_DepondsOn_Methods {
	WebDriver driver;
  @Test(dependsOnMethods="method2")
  public void method1() {
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Arun");
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("12345");
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
  }
  @Test
  public void method2() {
	  driver.get("https://www.techlearn.in/admin");
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
