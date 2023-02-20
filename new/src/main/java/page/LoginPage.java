package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage (WebDriver driver) {
		this.driver= driver ;
	}
	
	// WebElement List
	
	@FindBy (how = How.XPATH , using= "//*[@id=\"username\"]") WebElement User_Name_Element ;
	@FindBy (how = How.XPATH , using= "//*[@id=\"password\"]" )WebElement Password_Element ;
	@FindBy (how = How.XPATH , using= "/html/body/div/div/div/form/div[3]/button" )WebElement Singin_Button_Element ;
	@FindBy (how = How.XPATH , using= "/html/body/div/div/div/form/div[4]/div/a" )WebElement Forgot_Password_Element ;
	
	// Correspondent Methods 
	
	public void InsertUsername (String username ) {
		
	 
		User_Name_Element.sendKeys(username);
	 
	}
	
	public void insertPassword (String password) {
		
		Password_Element .sendKeys(password);
	}
	public void clickonSinginButton() {
		Singin_Button_Element.click();
	}
	
	public void loginTest (String username , String password ) throws Exception {
		User_Name_Element.sendKeys(username);
		Password_Element .sendKeys(password);
		Thread.sleep(3000);
		Singin_Button_Element.click();
	}
	
}	
