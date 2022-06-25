package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestLeafLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement usernameElement=driver.findElement(By.id("username"));
		usernameElement.sendKeys("Demosalesmanager");
		WebElement passwordElement=driver.findElement(By.name("PASSWORD"));
		passwordElement.sendKeys("crmsfa");
		WebElement loginButton=driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement crmsfaElement=driver.findElement(By.linkText("CRM/SFA"));
		crmsfaElement.click();
		
		
	
		

	}

}
