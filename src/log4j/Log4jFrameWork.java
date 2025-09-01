package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jFrameWork {
	WebDriver driver;

  @Test
  public void techlearnlogin() {
	  Logger log= Logger.getLogger("Techlearn login module");
	  PropertyConfigurator.configure("Log4j.properties");
	  driver = new ChromeDriver();
	  log.info("Chrome browser window is launched");
	  driver.manage().window().maximize();
	  log.info("Browser window maximized");
	  driver.get("https://www.techlearn.in/admin/");
	  log.info("Techlearn website admin page is opened");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Arun");
	  log.info("user name entered in the username field");
	  
	
	  
	  
  }
}
