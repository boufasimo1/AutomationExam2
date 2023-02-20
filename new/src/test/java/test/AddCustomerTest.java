package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver ;
	
	@Test
	public void AddingCustomerInformation () throws Exception {
	driver = BrowserFactory.init();
	
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	loginPage.loginTest("demo@techfios.com","abc123");
	
	
	DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	dashboardPage.verifyingDashboardPage("Dashboard");
	dashboardPage.clickOnCustomers();
	dashboardPage.clickOnAddCustomer();
	
	AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
	addCustomerPage.verifyingAddCustomerPage("Contacts");
	addCustomerPage.insertFullName("hayet");
	addCustomerPage.SelectCompanyName("Gold");
	

	}
}
