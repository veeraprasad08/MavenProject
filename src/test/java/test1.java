import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class test1 {
	
	public static WebDriver driver = null;
	
	@Test
	public static void testOne() throws InterruptedException{
		
		System.out.println("this is testing in testone");
		
		driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("veeraprasad.t");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(5000L);
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("Sreenithya13");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
	}
	
		

}
