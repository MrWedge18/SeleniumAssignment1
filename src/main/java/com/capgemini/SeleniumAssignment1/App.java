package com.capgemini.SeleniumAssignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mwang3\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://html.com/input-type-file/");
		WebElement fileUpload = driver.findElement(By.id("fileupload"));
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"post-206\"]/div/div[4]/form/input[2]"));
		fileUpload.sendKeys("C:\\Users\\mwang3\\Documents\\test.txt");
		submit.click();
		
		driver.get("https://www.amazon.com/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("RTX 2080 TI");
		search.submit();
		WebElement test = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a"));
		test.click();
		WebElement buyNow = driver.findElement(By.id("buy-now-button"));
		buyNow.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement noThanks = driver.findElement(By.id("siNoCoverage-announce"));
		noThanks.click();
		
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("mr.wedge18@gmail.com");
		email.submit();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("password");
		password.submit();
		
		driver.close();
	}
}
