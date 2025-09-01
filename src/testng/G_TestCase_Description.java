package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class G_TestCase_Description{
	WebDriver driver;
  @Test(description="verify google page")
  public void test1() {
	  driver.get("https://www.google.com");
  }
  @Test(description="verify selenium page")
  public void test2() {
	  driver.get("https://www.selenium.dev");
  }
  @Test(description="verify jira page")
  public void test3() {
	  driver.get("https://www.jira.com");
  }
  @Test(description="verify zomato page")
  public void test4() {
	  driver.get("https://www.zomato.com");
  }
  @Test(description="verify gmail page")
  public void test5() {
	  driver.get("https://www.gmail.com");
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
