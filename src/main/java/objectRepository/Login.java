package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	By username = By.name("username");
	By password = By.name("password");
	By login_button = By.name("signon");
	
	public Login (WebDriver driver){
		this.driver=driver; // when variable name & instance variable name are same we use this keyword
	}
	public void login_credential(String u1, String p1) {
		//driver.findElement(username).clear();
		driver.findElement(username).sendKeys(u1);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(p1);
		driver.findElement(login_button).click();
	}
}
