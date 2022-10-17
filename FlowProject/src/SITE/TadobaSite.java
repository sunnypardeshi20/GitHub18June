package SITE;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TadobaSite 

{
	public static void main(String[] args) throws InterruptedException, IOException
	{

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\smtod\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mytadoba.org/");
	Thread.sleep(2000);
	//page1
	WebElement bookNow = driver.findElement(By.xpath("//a[@id='header-link-orange']"));
	bookNow.click();
	
	//page2
	Thread.sleep(3000);
	WebElement safariregularBook = driver.findElement(By.xpath("//a[@href='https://booking.mytadoba.org/safari/']"));
	safariregularBook.click();
	//page3
	Set<String>handles=driver.getWindowHandles();
	Iterator<String>itr=handles.iterator();
	String parentId=itr.next();
	String childId=itr.next();
	Thread.sleep(3000);
	driver.switchTo().window(childId);
	System.out.println("child Window");
	WebElement selectDate = driver.findElement(By.xpath("//img[@title='Select date']"));
	selectDate.click();
	Thread.sleep(2000);
	WebElement nextButtondate = driver.findElement(By.xpath("//a[@title='Next']"));
	nextButtondate.click();
	WebElement inputFormat = driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[3]/td[2]/a"));
	inputFormat.click();
	Thread.sleep(2000);
	WebElement radioZone = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/section[1]/div[2]/div/div/div/div/div[3]/div/div/div/form/div[1]/ul/li[2]/div/ul/li[3]"));
	radioZone.click();
	WebElement nextButton = driver.findElement(By.xpath("//input[@id='gform_submit_button_1']"));
	nextButton.click();
	Thread.sleep(3000);
	JavascriptExecutor JS=(JavascriptExecutor)driver;
	JS.executeScript("window.scrollBy(0,400)");


	
	
	

	
//	
	
	
	
}
}
