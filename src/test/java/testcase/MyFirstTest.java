package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println("Started");
		driver.get("https://www.zoho.com/");
		driver.findElement(By.linkText("Sign In")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement textBox = driver.findElement(By.id("login_id"));
		js.executeScript("arguments[0].value='rubayet52@gmail.com';", textBox);
		
		System.out.println("Email Entered");
		
		Thread.sleep(1000);

		driver.findElement(By.id("nextbtn")).click();

		WebElement passWord = driver.findElement(By.id("login_id"));
		js.executeScript("arguments[0].value='Asa12#$%';", passWord);
		
		System.out.println("Password Entered");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		
		System.out.println("Successful Login");

		driver.quit();
	}

}
