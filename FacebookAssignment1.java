package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'first')]")).sendKeys("Keer");
		driver.findElement(By.name("lastname")).sendKeys("R");
		driver.findElement(By.xpath("(//input[contains (@class,'inputtext')])[5]")).sendKeys("9679679879");
		driver.findElement(By.id("password_step_input")).sendKeys("Test@123");
		WebElement day = driver.findElement(By.id("day"));
		Select d1=new Select(day);
		d1.selectByIndex(1);
		WebElement month = driver.findElement(By.id("month"));
		Select d2=new Select(month);
		d2.selectByValue("4");
		WebElement year = driver.findElement(By.id("year"));
		Select d3=new Select(year);
		d3.selectByVisibleText("1994");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	}

}
