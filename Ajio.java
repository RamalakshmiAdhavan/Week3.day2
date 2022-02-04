package week3.day2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	WebDriverManager.chromedriver().setup();
	ChromeDriver = new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//label[@for='Women']")).click();
	
	driver.findElement(By.xpath("//label[@for='Women - Fashion Bags']")).click();
	Thread.sleep(2000);
	
	String totalItems = driver.findElement(By.className("length")).getText();
	System.out.println("Total number of items : " + totalItems);
	
	System.out.println(" List of Brands");
	
	List bagBrandList = (List) driver.findElements(By.className("brand"));
	System.out.println(" Size :" + bagBrandList.size());

	for (WebElement webElement : bagBrandList) {
		String text = webElement.getText();
		System.out.println(text);
	}
	
	}
}
