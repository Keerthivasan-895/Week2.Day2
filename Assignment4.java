package Week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Interact with EDIT
		
		  driver.get("http://leafground.com/pages/Edit.html");
		  driver.findElement(By.id("email")).sendKeys("keer@gamil.com");
		  driver.findElement(By.xpath("//input[@value='Append ']")).
		  sendKeys("Added the text at the last"); Actions builder=new Actions(driver);
		  builder.sendKeys(Keys.TAB).perform(); String defaultText =
		  driver.findElement(By.xpath("//input[@name='username']")).getAttribute(
		  "value"); System.out.println(defaultText);
		  driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear(); boolean
		  enabled =
		  driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled(); if
		  (enabled) { System.out.println("Confirm that edit field is enabled");
		  
		  } else { System.out.println("Confirm that edit field is disabled"); }
		 
		 
		//Interact with Bond with Buttons
		
		  driver.get("http://leafground.com/pages/Button.html");
		  driver.findElement(By.id("home")).click();
		  driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		  System.out.println(driver.findElement(By.id("position")).getLocation());
		  System.out.println(driver.findElement(By.id("color")).getCssValue(
		  "background-color"));
		  System.out.println(driver.findElement(By.id("size")).getSize().getHeight());
		  
		//Interact with play Hyperlinks
		
		  driver.get("http://leafground.com/pages/Link.html");
		  driver.findElement(By.linkText("Go to Home Page")).click();
		  driver.findElement(By.linkText("HyperLink")).click();
		  System.out.println(driver.findElement(By.
		  linkText("Find where am supposed to go without clicking me?")).getAttribute(
		  "href")); if
		  (driver.findElement(By.linkText("Verify am I broken?")).isDisplayed()) {
		  System.out.println("Verified the link"); } else {
		  System.out.println("Not verified the link"); }
		  driver.findElement(By.xpath("(//a[contains(text(),'Go to Home Page')])[2]")).
		  click(); List<WebElement> countOfLink = driver.findElements(By.xpath("//a"));
		  System.out.println(countOfLink.size());
	
		//Interact with Images
		
		  driver.get("http://leafground.com/pages/Image.html");
		  driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		  driver.findElement(By.xpath("//img[@alt='Images']")).click(); String text
		  =driver.findElement(By.xpath("//label[@for='position']")).getText();
		  if(text.equals("Am I Broken Image?")) { System.out.println("Yes"); } else {
		  System.out.println("No"); } WebElement keyboardClick =
		  driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")); Actions
		  builder=new Actions(driver); builder.click(keyboardClick).perform();

		//Interact with Dropdown
		
		  driver.get("http://leafground.com/pages/Dropdown.html"); WebElement dropdown1
		  = driver.findElement(By.id("dropdown1")); Select d1=new Select(dropdown1);
		  d1.selectByIndex(1); WebElement dropdown2 =
		  driver.findElement(By.xpath("//select[@name='dropdown2']")); Select d2=new
		  Select(dropdown2); d2.selectByVisibleText("Appium"); WebElement dropdown3 =
		  driver.findElement(By.id("dropdown3")); Select d3=new Select(dropdown3);
		  d3.selectByValue("4"); Select listValues=new
		  Select(driver.findElement(By.xpath("//select[@class='dropdown']")));
		  List<WebElement> options = listValues.getOptions();
		  System.out.println(options.size());
		  driver.findElement(By.xpath("(//select)[5]")).sendKeys("Selenium");
		  WebElement selectDropdown = driver.findElement(By.xpath("(//select)[6]"));
		  Select dd=new Select(selectDropdown); dd.selectByIndex(1);
		  dd.selectByValue("2"); dd.selectByVisibleText("Loadrunner");
		 
		//Interact with Checkboxes
		
		driver.get("http://leafground.com/pages/checkbox.html");
		WebElement c1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		c1.click();
		WebElement c2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		c2.click();
		boolean selected = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected();
		if (selected) {
			System.out.println("Confirm Selenium is checked");
		} else {
			System.out.println("Not checked");
		}
		boolean selected2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).isSelected();
		
		  if (selected2) {
		  driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click(); }
		  
		  boolean selected3 =
		  driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).isSelected();
		  if (selected3) {
			  driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		  }
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();	
	
	}
}
