package pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryClass
{
	static WebDriver driver;

	@FindBy(how = How.ID, using= "UserName")
	static WebElement Username;

	@FindBy(how = How.ID, using="Password")
	static WebElement Password;
	
	@FindBy(how = How.XPATH, using="//*[@id=\"loginForm\"]/form/div[3]/input[1]")
	static WebElement Login;
	
 public static void main(String[] args)  
 
 {
	//Initiate and call the browser
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Lakshmi Jasti\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	System.setProperty("webdriver.firefox.driver","C:\\Program Files\\Mozilla Firefox\\firefox.exe" );
	WebDriver driver= new FirefoxDriver(); 

	//Implicit wait
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	//Navigate to the URL
	driver.get("http://horse-dev.azurewebsites.net");
	System.out.println("Webapplication launched successfully");
	
	//Call the PageFactory class to identify the WebElements
	PageFactory.initElements(driver, PageFactoryClass.class);
			
	//Input the data inside "Username" Field
	Username.sendKeys("hari");
	
	//Input the data inside "password" Field
	Password.sendKeys("123123");
			
	//click on Login button
	Login.click();
 }


}
