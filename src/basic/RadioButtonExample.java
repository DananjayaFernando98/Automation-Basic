package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium Webdriver\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		
		//Click Your most favorite browser
		WebElement selectBrowser = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]/span"));
		selectBrowser.click();
		
		
		//Find the default select radio button
		WebElement checkeSelectedButton01 = driver.findElement(By.id("j_idt87:console2:0"));
		WebElement checkSelectedButton02 = driver.findElement(By.id("j_idt87:console2:1"));
		WebElement checkSelectedButton03 = driver.findElement(By.id("j_idt87:console2:2"));
		WebElement checkSelectedButton04 = driver.findElement(By.id("j_idt87:console2:3"));
		
		boolean checkButton01 = checkeSelectedButton01.isSelected();
		boolean checkButton02 = checkSelectedButton02.isSelected();
		boolean checkButton03 = checkSelectedButton03.isSelected();
		boolean checkButton04 = checkSelectedButton04.isSelected();
		
		System.out.println("Is Selected Chrome Browser : " + checkButton01);
		System.out.println("Is Selected Firefox Browser : " + checkButton02);
		System.out.println("Is Selected Safari Browser : " + checkButton03);
		System.out.println("Is Selected Edge Browser : " + checkButton04);
		
		
		//Select the age group (only if not selected)
		WebElement selectageButton = driver.findElement(By.name("j_idt87:age"));
		selectageButton.click();
	}

}
