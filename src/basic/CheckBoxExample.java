package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdrive.chrome.driver", 
				"C:\\Selenium Webdriver\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		
		//Basic CheckBox
		WebElement selectCheckBox =  driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt89\']/div[2]"));
		selectCheckBox.click();
		
		Thread.sleep(3000);
		//Ajax Notification Box
		WebElement ajaxCheckBox =  driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt91\']/div[2]"));
		ajaxCheckBox.click();
		
		Thread.sleep(3000);
		//Select favorite Programming Language
		WebElement favariteLanguage01 = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]"));
		WebElement favariteLanguage02 = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[2]/div/div[2]"));
		favariteLanguage01.click();
		favariteLanguage02.click();
		
		//three time select one checkBox
		WebElement one = driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]"));
		WebElement two = driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]"));
		WebElement three = driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]"));
		
		Thread.sleep(3000);
		one.click();
		Thread.sleep(3000);
		two.click();
		Thread.sleep(3000);
		three.click();
		
		Thread.sleep(3000);
		//Toggle Switch
		WebElement toggleButton = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]/div[2]"));
		toggleButton.click();
		
		Thread.sleep(3000);
		//Verify if check box is disabled
		WebElement checkDiseble = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]"));
		boolean answerforchecking = checkDiseble.isEnabled();
		System.out.println("Check Box Disebled :" + answerforchecking);
		
		
		
	}

}
