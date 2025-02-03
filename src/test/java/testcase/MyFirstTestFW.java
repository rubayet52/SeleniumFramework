package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFirstTestFW extends BaseTest {

	@Test
	public static void LoginTest() throws InterruptedException {

		System.out.println("Start Login Test");
		driver.findElement(By.linkText("Sign In")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement textBox = driver.findElement(By.id("login_id"));
		js.executeScript("arguments[0].value='rubayet52@gmail.com';", textBox);

		Thread.sleep(1000);

		driver.findElement(By.id("nextbtn")).click();

		WebElement passWord = driver.findElement(By.id("login_id"));
		js.executeScript("arguments[0].value='Asa12#$%';", passWord);

		System.out.println("Password Entered");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();

		System.out.println("Successful Login");
	}
}
