package basic;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
;


public class ButtonExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Selenium Webdriver\\\\Chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/button.xhtml");
		
		
		//Find the position of the Submit button
		WebElement  getpositionButton = driver.findElement(By.id("j_idt88:j_idt94"));
		Point xypoint = getpositionButton.getLocation();
		int xValue = xypoint.getX();
		int yValue = xypoint.getY();
		System.out.println("X Value is : "+ xValue+ "\n" + "Y Value is : "+ yValue);
		
		//Find the Save button color
		WebElement colorButton = driver.findElement(By.id("j_idt88:j_idt96"));
		String color = colorButton.getCssValue("background");
		System.out.println("Button color is :" + color);
		
		
		//Confirm if the button is disabled.
		WebElement disabledcheck = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean enabled = disabledcheck.isEnabled();
		System.out.println(enabled);
		
		//Find the height and width of this button
		WebElement sizeButton = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().getWidth();
		System.out.println("Height is : " + height + "\n" + "Width is : " + width);
		
		//Goto home
		//WebElement gotohome = driver.findElement(By.id("j_idt88:j_idt90"));
		//gotohome.click();
		
		
		//Mouse hover and confirm the color changed
		WebElement hoverCheck = driver.findElement(By.id("j_idt88:j_idt100"));
		Actions hoverc = new Actions(driver);
		hoverc.moveToElement(hoverCheck).perform();
		String hovercolor = hoverCheck.getCssValue("background-color");
		System.out.println("Hover color is :" + hovercolor);
		
		WebElement hideButton = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
		hideButton.click();
		
		WebElement imageshow  = driver.findElement(By.id("j_idt88:j_idt102:j_idt104"));
		boolean finalans = imageshow.isDisplayed();
		System.out.println("Image Display : " + finalans);
		
		WebElement anyClick =  driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
		anyClick.sendKeys(Keys.SPACE);
		//System.out.println("Image Display : " + finalans);
		
		
		
		
		
		
		//How many rounded buttons are there
		List <WebElement> countButton = driver.findElements(By.xpath("//*[@id=\"j_idt88\"]/div/div[2]/div[4]/button"));
		int buttons = countButton.size();
		System.out.println("Rounded Button Count is : " + buttons);
		
		
		
		
	}

}
