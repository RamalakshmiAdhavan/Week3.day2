package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Leafgrounddisapper {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/disapper.html");
	driver.manage().window().maximize();	
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement element = driver.findElement(By.xpath("//button[@id='btn']"));
	wait.until(ExpectedConditions.invisibilityOf(element));
	WebElement element1 = driver.findElement(By.tagName("strong"));
	System.out.println("Hidden Text:"+element1.getText());
	driver.close();		

}
}