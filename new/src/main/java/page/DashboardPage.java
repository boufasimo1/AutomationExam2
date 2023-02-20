package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {

WebDriver driver;

 public DashboardPage (WebDriver driver) {
	 this.driver= driver;
 }
 	//WebElement List
 @FindBy (how= How.XPATH ,using ="//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement DashBoard_Header_Element ;
 @FindBy (how= How.XPATH ,using ="//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement Customers_Menu_Element ;
 @FindBy (how= How.XPATH ,using ="//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement Add_Customer_Menu_Element ;
 
 	public void verifyingDashboardPage (String dashboardText) {
 		
 		Assert.assertEquals(DashBoard_Header_Element.getText(), dashboardText, "good");
 	}
 	
 	public void clickOnCustomers () {
 		Customers_Menu_Element.click();
 	}
 	public void clickOnAddCustomer () {
 		Add_Customer_Menu_Element.click();
 	}
}
