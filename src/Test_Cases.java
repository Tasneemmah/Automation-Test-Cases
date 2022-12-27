import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Cases {
public WebDriver driver;
	
	@BeforeTest
	
	public void Login() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("tmahmuod22@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Tasneem1234567");
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[11]")).click();	
	}
	
	@Test
	public void Test_The_Title() {
		String ActaultitleName = driver.getTitle();
		String ExpectedTitle = "GitHub";
		
		Assert.assertEquals(ActaultitleName, ExpectedTitle);
	}
	@Test(groups="Automation")
	public void Test_The_Log_Out_Process () {
		System.out.println("Logged out");
	}
	
	@Test(groups="Automation") 
	public void Test_The_Existance_Of_The_User_Name() {
	}
}