package Sample;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseClass1Test {
	public static WebDriver driver=null;
 
	
	@AfterTest
  public void afterTest() {
   driver.quit();
  }

 

  @BeforeTest
  public void f() {
    
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("file:///home/synerzip/Desktop/json/AutomationTest.html");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  SeleniumPrac sp1=new SeleniumPrac();
	  sp1.f();
  }
}
