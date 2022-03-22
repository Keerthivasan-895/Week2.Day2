package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBAssignment2DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[contains (text(),'Email')]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("aaa@gmail.com");
		driver.findElement(By.xpath("//button[contains (text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).getText();
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
		String text2 = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		if (text2.equals("Duplicate Lead")) {
			System.out.println("Title verified successfully");
		} else {
			System.out.println("Title verified not displayed");
		}
		driver.findElement(By.className("smallSubmit")).click();
		String text3 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text3.equals(text)) {
			System.out.println("I can confirm that both the First Name are same");
		} else {
			System.out.println("I can confirm that both the First Name are not same");
		}
		driver.close();
	}

}
