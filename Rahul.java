import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahul {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j=0;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","Carrot"}; 
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000L);
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		//cc
		for(int i=0;i<products.size();i++)
			
		{
			
		String[] name=products.get(i).getText().split("-");
		String formattedName=name[0].trim();
		
		List itemsNeededList = Arrays.asList(itemsNeeded);
		
		if(itemsNeededList.contains(formattedName))
		{
			
		j++;	
		//click on  Add to cart
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		if(j==itemsNeeded.length)
		
		{
         break;
		}
	}
		//System.out.println(driver.findElement(By.id("results")).getText());
        // css selektor "[ono sto pise u inspekt npr [id='start'] i posle npr buttin"

		//driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/a[4]/img")).click();
		//driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/div[2]/div[2]/button")).click();
		//Thread.sleep(3000L);
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/input")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/button")).click();

}
}
}