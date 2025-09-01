package screenshots;

import org.testng.annotations.Test;
import org.testng.reporters.Files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ErrorPageScreenshot {
	WebDriver driver;
	public void errorPageLineScreenshot() throws IOException {
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("C:\\Program Files\\Screenshots\\ErrorPageScreenshot.png"));
	}
  @Test
  public void teachlearnlogin() {
	  driver.get("https://www.techlearn.in/admin/");
  try
  {
	  driver.findElement(By.id("user_login")).sendKeys("Arun");
	  Thread.sleep(2000);
	  driver.findElement(By.id("user_pass")).sendKeys("Hello@123");
	  Thread.sleep(2000);
	  driver.findElement(By.id("rememberme")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("wp-submit")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.className("wp-login-lost-password")).click();
    Thread.sleep(2000);
  }
    catch(Exception e) {
    	System.out.println("Error due to :"+e);
    	errorPageLineScreenshot();
    }
    
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
