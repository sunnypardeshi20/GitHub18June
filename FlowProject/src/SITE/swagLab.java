package SITE;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class swagLab {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\smtod\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");

		WebElement Username = driver.findElement(By.xpath("//input[@class='input_error form_input']"));
		Username.sendKeys("standard_user");

		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("secret_sauce");

		WebElement Login = driver.findElement(By.xpath("//input[@name='login-button']"));
		Login.click();

		WebElement Filter = driver.findElement(By.xpath("//select[@class='product_sort_container']"));

		Select s = new Select(Filter);
		Thread.sleep(3000);
		s.selectByValue("lohi");
		
		WebElement BoltTshirt = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
		BoltTshirt.click();
		
		WebElement Addtocart_Button = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']"));
		Addtocart_Button.click();
		
		WebElement Cart_Button = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		Cart_Button.click();
		
		WebElement Checkout_Button = driver.findElement(By.xpath("//button[@name='checkout']"));
		Checkout_Button.click();
		
		WebElement First_name =	driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		First_name.sendKeys("varsha");
		
		WebElement Last_name =	driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		Last_name.sendKeys("Todkari");
		
		WebElement Pincode = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
		Pincode.sendKeys("411019");
		
		WebElement Continue_Button = driver.findElement(By.xpath("//input[@id='continue']"));
		Continue_Button.click();
		
		WebElement Finish_Button = driver.findElement(By.xpath("//button[@name='finish']"));
		Finish_Button.click();
		
		Thread.sleep(3000);
		
		WebElement Menu_Button = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		WebElement Logout_Button = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Menu_Button).perform();
		act.click(Menu_Button).perform();
		act.moveToElement(Logout_Button).perform();
		act.click(Logout_Button).perform();
		

	}

}


