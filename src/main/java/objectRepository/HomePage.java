package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By sign_in = By.xpath("//*[@id=\"MenuContent\"]/a[2]");
//---Creating a constructor
	public HomePage (WebDriver driver){
		this.driver=driver; // when variable name & instance variable name are same we use this keyword
		
	}
	
	public void signin() {
		driver.findElement(sign_in).click();
		
	}
}
