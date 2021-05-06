package day1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.BrowserUtility;
import utility.TakeScreenShot;

public class testme {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  WebDriver driver = BrowserUtility.GetDrivers("Chrome");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	  TakeScreenShot.capturescreen(driver);
  }

  @AfterTest
  public void afterTest() {
  }

}
