package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("test1");
		driver.findElement(By.name("lastname")).sendKeys("leaf1");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test@123");
		WebElement date=driver.findElement(By.id("day"));
		Select da= new Select(date);
		da.selectByValue("5");
		
		WebElement month=driver.findElement(By.id("month"));
		Select mon= new Select(month);
		mon.selectByVisibleText("Feb");
		
		WebElement year=driver.findElement(By.id("year"));
		Select yr= new Select(year);
		yr.selectByVisibleText("1995");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
	}

}
