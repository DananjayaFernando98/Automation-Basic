package basic;

import javax.swing.Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Selenium Webdriver\\\\Chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		
		
		//Alert (Simple Dialog)
		WebElement SimpleAlert = driver.findElement(By.id("j_idt88:j_idt91"));
		SimpleAlert.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		
		
		//Alert (Confirm Dialog click button ok or cancel)
		WebElement ConfirmButton = driver.findElement(By.id("j_idt88:j_idt93"));
		ConfirmButton.click();
		Alert confirmAllert = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmAllert.dismiss();
		
		/*
		//Sweet Modal Dialog click X button
		WebElement clickxButton = driver.findElement(By.id("j_idt88:j_idt100"));
		clickxButton.click();
		Alert CrosButtonAllert = driver.switchTo().alert();
		CrosButtonAllert.accept();
		Thread.sleep(3000);
		WebElement clickClose = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a"));
		clickClose.click();
		
		
		*/
		
		
		
		
		//Alert (Prompt Dialog user enter keys)
		WebElement promtBox = driver.findElement(By.id("j_idt88:j_idt104"));
		promtBox.click();
		Alert confirmPromtButton = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmPromtButton.sendKeys("Hi,Google");
		confirmPromtButton.accept();
	}

}
