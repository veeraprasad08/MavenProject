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
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("Your email id");
		driver.findElement(By.xpath(".//*[@id='XXXnext']")).click();
		Thread.sleep(5000L);
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("Password");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		System.out.println("This is first changes");
		System.out.println("This is second changes");
		System.out.println("This is third changes");
		System.out.println("This is fourth changes");
		System.out.println("This is fifth changes");
		System.out.println("This is sixth changes");
		System.out.println("This is seventh changes");
		System.out.println("This is eighth changes");
		System.out.println("This is nineth changes");
	}
	
		

}
