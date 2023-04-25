package basic;

import java.util.List;
import java.util.ListResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Selenium Webdriver\\\\Chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		//Which is your favorite UI Automation tool
		WebElement dropDown1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select select = new Select(dropDown1);
		//select by index
		select.selectByIndex(2);
		//Thread.sleep(3000);
		//select by visible text
		select.selectByVisibleText("Selenium");
		
		List<WebElement> listOption = select.getOptions();
		int size = listOption.size();
		System.out.println("Number of Element : " + size);
		
		
		/*
		 
		 
		WebElement clickButton = driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/button"));
		clickButton.click();
		WebElement multipleSelect = driver.findElement(By.id("j_idt87:auto-complete"));
		Select MultiSelectBox = new Select(multipleSelect);
		MultiSelectBox.selectByValue("AWS");
		MultiSelectBox.selectByValue("Appium");
		MultiSelectBox.selectByValue("Selenium WebDriver");
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"j_idt87:country\"]"));
		Select Countryselect = new Select(country);
		Countryselect.selectByValue("1");
		//country.sendKeys("Germany");
		
		
		//WebElement VerifyCity = driver.findElement(By.id("j_idt87:city"));
		//Select selectCity = new Select(VerifyCity);
		//List<WebElement> CityVerify = selectCity.getOptions();
		//boolean answer = CityVerify.isEmpty();
		//System.out.println(answer);
		
		*/
	}

}
