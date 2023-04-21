package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Webdriver\\\\Chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.leafground.com/input.xhtml");
		
		driver.manage().window().maximize();
		
		//enter the name
		WebElement nameBox = driver.findElement(By.id("j_idt88:name"));
		nameBox.sendKeys("Dananjaya Fernando");
		
		//Append text
		WebElement Appendtext = driver.findElement(By.id("j_idt88:j_idt91"));
		Appendtext.sendKeys("Text ");
		
		//Retrive
		WebElement getTextBox = driver.findElement(By.id("j_idt88:j_idt97"));
		String value = getTextBox.getAttribute("value");
		System.out.println(value);
		
		//clear text
		WebElement clearBox = driver.findElement(By.id("j_idt88:j_idt95"));
		clearBox.clear();
		
		//disabled check
		WebElement disabledBox = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean enabled = disabledBox.isEnabled();
		System.out.println(enabled);
	}

}
