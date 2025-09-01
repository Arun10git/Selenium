package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class I_TestCases_Execution_From_XML {
	WebDriver driver;
  @Test
  public void google() {
	  driver.get("https://www.google.com");
  }
  @Test
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  @Test
  public void selenium() {
	  driver.get("https://www.selenium.dev");
  }
  @Test
  public void jira() {
	  driver.get("https://www.jira.com");
  }
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  @Test
  public void twitter() {
	  driver.get("https://www.x.com");
  }
  @Test
  public void zomato() {
	  driver.get("https://www.zomato.com");
  }
  @Test
  public void bugzilla() {
	  driver.get("https://www.bugzilla.org");
  }
  @Test
  public void redmine() {
	  driver.get("https://www.redmine.org");
  }
  @Test
  public void swiggy() {
	  driver.get("https://www.swiggy.com");
  }
  
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
