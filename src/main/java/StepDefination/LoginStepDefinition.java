package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
			 WebDriver driver;
			 @Given("^user is already on Login Page$")
			 public void user_already_on_login_page(){
			 System.setProperty("webdriver.chrome.driver","D:\\Karishma\\StoredCode\\CRM-BDD\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.freecrm.com/index.html");
			 }
			 
			 @When("^title of login page is Free CRM$")
			 public void titleOfLoginIsFreeCRM() {
				
			 }
			

}
