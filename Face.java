import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Programiranje\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/"); //ctrl+shift+f da formatiras kod
		driver.findElement(By.xpath("id('email')")).sendKeys("ssd");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		int a= 5;
		getScreenshot(driver);
		
	}
	public static void getScreenshot(WebDriver driver) throws IOException
	{
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// da uzmem sliku ekrana
		FileUtils.copyFile(src, new File("D:\\Screenshot selenium\\screenshotfb.png"));

	}

}
