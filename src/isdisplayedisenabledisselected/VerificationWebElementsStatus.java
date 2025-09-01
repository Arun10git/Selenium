package isdisplayedisenabledisselected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerificationWebElementsStatus {
	WebDriver driver;
  @Test
  public void isDisplayed() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(2000);
	  boolean lyp = driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).isDisplayed();
	  if(lyp == true)
	  {
		  System.out.println("Lost your password is diplayed");
		  driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
	  }
		  else {
			  System.out.println("Lost your password is not displayed");
		  }
	  }
  @Test
  public void isEnabled() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(2000);
	  boolean username = driver.findElement(By.xpath("//*[@id=\"user_login\"]")).isEnabled();
	  if (username == true) {
		  System.out.println("username text box is enabled");
		  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Arun");
	  }
	  else {
		  System.out.println("username text box is not displayed");
	  }
  }
  @Test
  public void isSelected() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	  boolean rm = driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();
	  	  if (rm == true) {
		  System.out.println("remember me check box is clicked");
	  }
	  else {
		  System.out.println("remember me check box is not clicked");
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
