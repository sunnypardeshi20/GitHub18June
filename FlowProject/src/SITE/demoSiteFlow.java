package SITE;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demoSiteFlow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\smtod\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//WebElement search=driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act=new Actions(driver);
		WebElement search=driver.findElement(By.xpath("//a[@title='Women']"));
		act.moveToElement(search).perform();
		
		//search.click();
		WebElement top=driver.findElement(By.xpath("//a//a[@title='Tops']"));
		top.click();
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,500)");
		WebElement selectproduct=driver.findElement(By.xpath("//select[@id='selectProductSort']"));
		Select s=new Select(selectproduct);
		s.isMultiple();
		s.selectByVisibleText("Price: Lowest first");
		WebElement chiffonDress=driver.findElement(By.xpath("//img[@src='http://automationpractice.com/img/p/2/0/20-home_default.jpg']"));
		chiffonDress.click();
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(iframe);
		WebElement quantity=driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		quantity.click();
//		Actions act=new Actions(driver);
//		act.moveToElement(quantity).perform();
//		act.click().perform();
//		act.doubleClick().perform();
		WebElement size=driver.findElement(By.xpath("//select[@id='group_1']"));
		Select s1=new Select(size);
		s1.isMultiple();
		s1.selectByVisibleText("M");
		WebElement color=driver.findElement(By.xpath("//a[@name='Green']"));
		color.click();
		WebElement addcart=driver.findElement(By.xpath("//button[@class='exclusive']"));
		addcart.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		//Actions act=new Actions(driver);
		WebElement checkout=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a"));
		checkout.click();
		Thread.sleep(1000);
		//act.moveToElement(checkout).perform();
		//Thread.sleep(1000);

		//act.click(checkout).perform();
		
		
		

	}		


}
