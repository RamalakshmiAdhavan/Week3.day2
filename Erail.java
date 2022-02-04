package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		Object Duration = 50;
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
		driver.findElement(By.id("chkSelectDateOnly")).click();
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MS");
		Thread.sleep(500);
		fromStation.sendKeys(Keys.TAB);
		
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU");
		Thread.sleep(500);
		toStation.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		int size = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr")).size();
		java.util.List<String> trainNames=new ArrayList<String>();
		
		for(int i=1;i<=size;i++) {
			String names = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+ i +"]/td[2]")).getText();
			Thread.sleep(500);
			trainNames.add(names);
			}
		int totalTrains = trainNames.size();
		System.out.println("Total Trains on this route"+totalTrains);
		
		Set<String> uniqueTrains= new HashSet<String>(trainNames);
		uniqueTrains.addAll(trainNames);
		int uniqueTrainSize = uniqueTrains.size();
		System.out.println("Total Trains on this route"+uniqueTrainSize);
		
		if(uniqueTrainSize==totalTrains)
			System.out.println("There are no duplicate trains");
		else
			System.out.println("Duplicate trains are present");
		driver.close();
	}
}


