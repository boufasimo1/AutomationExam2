package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	@Test
	public void ValidUserShouldBeAbleToLogin() {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.InsertUsername("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickonSinginButton();
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyingDashboardPage("Dashboard");
		dashboardPage.clickOnCustomers();
		dashboardPage.clickOnAddCustomer();
//		BrowserFactory.teardown();
	}

}
