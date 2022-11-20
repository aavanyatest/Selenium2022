package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Keys.TAB);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Keys.BACK_SPACE);
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aavanya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ekambaram");
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(source);
		dd.selectByIndex(2);
		//dd.selectByValue("LEAD_CONFERENCE");
		WebElement ele=dd.getFirstSelectedOption();
		System.out.println(ele.getText());
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		//driver.close();
	}

}
