package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {

		// Pseudo Code

//		  1. Launch URL "http://leaftaps.com/opentaps/control/login"

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

//		  2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("test");
		driver.findElement(By.id("lastNameField")).sendKeys("leaf");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("testnov");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("lerafnov");
		driver.findElement(By.id("createContactForm_description")).sendKeys("selenium");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("test@gmail.com");
		WebElement stat = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select statprov = new Select(stat);
		statprov.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote"))
				.sendKeys("this is to create and edit contact form testleaf");
		driver.findElement(
				By.xpath("//textarea[@id='updateContactForm_importantNote']/following::input[@name='submitButton']"))
				.click();
		System.out.println(driver.getTitle());

	}

}
