package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class J_TestCases_Execution_From_Groups_XML2 {
	WebDriver driver;
  @Test(groups="search")
  public void google() {
	  driver.get("https://www.google.com");
  }
  @Test(groups="email")
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  @Test(groups="bug")
  public void selenium() {
	  driver.get("https://www.selenium.dev");
  }
  @Test(groups="bug")
  public void jira() {
	  driver.get("https://www.jira.com");
  }
  @Test(groups="social")
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  @Test(groups="social")
  public void twitter() {
	  driver.get("https://www.x.com");
  }
  @Test(groups="food")
  public void zomato() {
	  driver.get("https://www.zomato.com");
  }
  @Test(groups="bug")
  public void bugzilla() {
	  driver.get("https://www.bugzilla.org");
  }
  @Test(groups="bug")
  public void redmine() {
	  driver.get("https://www.redmine.org");
  }
  @Test(groups="food")
  public void swiggy() {
	  driver.get("https://www.swiggy.com");
  }
  
  @BeforeClass(groups="social")
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
