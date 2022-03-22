package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBAssignment2EditLead {
	
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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("ramya");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		String title = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		if (title.equals(title)) {
			System.out.println("Title of the page verified successfully");
		} else {
			System.out.println("Title of the page not verified");
		}
			driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("GOOGLE");
			driver.findElement(By.className("smallSubmit")).click();
			String companyname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
        if (companyname.contains("GOOGLE")) {
			System.out.println("Changed name get appears");
		} else {
			System.out.println("Changed name not appears");
		}
		driver.close();
	}

}
