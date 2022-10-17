package SITE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomato {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\smtod\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
		search.sendKeys("pizza");
		search.click();
		WebElement login=driver.findElement(By.xpath("//a[text()='Log in']"));
		login.click();
		WebElement iframe1=driver.findElement(By.xpath("//iframe[@id='auth-login-ui']"));
		driver.switchTo().frame(iframe1);
		WebElement mobno=driver.findElement(By.xpath("//div[@inputmode='numeric']"));
		
//		mobno.sendKeys("7588190004");
//		mobno.click();
//		
		
		
//		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
//		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
//
//		WebElement restselect=driver.findElement(By.xpath("//div[@class='sc-dznXNo dqNfqo']"));
//		restselect.click();
//		
	}

}
