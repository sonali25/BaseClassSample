package Sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class SeleniumPrac extends BaseClass1Test {
	
  @Test
  public void f() {
	  System.out.println("hhiiiiiiiii...");
	  driver.findElement(By.id("UserName")).sendKeys("sonali");
      driver.findElement(By.id("Password")).sendKeys("sonali");
      driver.findElement(By.id("Profession")).click();
      driver.findElement(By.id("Doctor")).click();
      driver.findElement(By.id("Female")).click();
      driver.findElement(By.id("Submit")).click();
      driver.findElement(By.id("link")).click();
	 
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
	 
  }

}
