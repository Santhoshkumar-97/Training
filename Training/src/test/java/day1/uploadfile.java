package day1;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.BrowserUtility;

 

public class uploadfile {
    WebDriver driver;
  @Test
  public void f() {
      // call the driver from utility package
      driver=BrowserUtility.GetDrivers("chrome");
      // To manage timeouts
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.get("http://demo.guru99.com/test/upload/");
      driver.manage().window().maximize();
      WebElement uploadfile=driver.findElement(By.id("uploadfile_0"));
      uploadfile.sendKeys("C:\\Users\\public\\documents\\test.txt");
  }
}
