package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RCDCDDMOKF {
	WebDriver driver;
  @Test
  public void RightClick() throws InterruptedException {
	  driver.get("https://www.techlearn.in");
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  act.contextClick(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-18\"]/a"))).build().perform();
	   }
  @Test
  public void DoubleClick() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/double-tap/");
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  //act.doubleClick(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).build().perform();
	  //Thread.sleep(2000);
	  //driver.switchTo().alert().accept();
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).doubleClick().build().perform();
	  driver.switchTo().alert().accept();
  }
  @Test
  public void draganddrop() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/drag-and-drop/");
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  WebElement source = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
	  WebElement target = driver.findElement(By.xpath("//*[@id=\"div1\"]"));
	  act.dragAndDrop(source, target).build().perform();
	  
  }
  @Test
  public void MouseOver() throws InterruptedException {
	  driver.get("https://www.techlearn.in");
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-19\"]/a"))).build().perform();
	  //driver.findElement(By.xpath("//*[@id=\"mega-menu-item-1405\"]/a")).click();
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-1405\"]/a"))).click().build().perform();
	  
  }
  @Test
  public void KeyBoardFuntion() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  act.sendKeys(Keys.TAB).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
