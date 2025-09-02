package iframes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGithub {
WebDriver driver;
  
  @Test
  public void techlearnlogin() {
    driver.get("https://www.techlearn.in/admin/");
   driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Arun");
   }
  @BeforeTest
  public void beforeTest() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    
  }

}
