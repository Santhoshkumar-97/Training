package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {
  WebDriver driver;
  
  public static void capturescreen(WebDriver driver) throws IOException{
	  TakesScreenshot srcshot=(TakesScreenshot)driver;
	  
	  File src=srcshot.getScreenshotAs(OutputType.FILE);
	  
	  FileUtils.copyFile(src, new File("C:\\Users\\Public\\Documents\\seleniumplus\\Screenshot\\","screenshot.png"));
  }
}
