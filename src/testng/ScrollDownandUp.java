package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class ScrollDownandUp {
	WebDriver driver;
  @Test
  public void pagescrolldown() throws InterruptedException {
	  driver.get("https://www.selenium.dev");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
	  Thread.sleep(2000);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("scroll(0,1900)");
	Thread.sleep(2000);
	//jse.executeScript("scroll(1500,0)");
driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div/div[2]/div[9]/h5/a")).click();
}
  @Test
  public void IdentifyLocatorElement() throws InterruptedException {
	  driver.get("https://www.selenium.dev");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
	  {
		  WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div/div[2]/div[9]/h5/a"));
		  Coordinates coordinate = ((Locatable)element).getCoordinates();
		  coordinate.onPage();
		  coordinate.inViewPort();
	  }
	  driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div/div[2]/div[9]/h5/a")).click();
  }

	
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}


