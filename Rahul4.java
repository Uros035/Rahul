import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rahul4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Programiranje\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(0)
		System.out.println(driver.findElements(By.tagName("iframe")).size());//Koliko frejma ima 
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Thread.sleep(3000L);
		//driver.findElement(By.id("draggable")).click(); //kada ima frejm na app web ne moze se povuci preko id,
		Actions a =new Actions(driver);
		WebElement source =driver.findElement(By.id("draggable"));
		WebElement target =driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();//da izadjem iz frejma
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/ul/li[2]/a")).click();
		
		

	}

}
