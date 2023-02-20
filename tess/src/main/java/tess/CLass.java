package tess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CLass {
	static WebDriver driver;
	
	@BeforeClass
	public static void beforedlass() throws Exception {

		System.out.println("Write the browser");
		Scanner ui = new Scanner(System.in);
		String f = ui.nextLine();
		String path = "Data\\Test.properties";
		File ff = new File(path);
		FileWriter rd = new FileWriter(ff);
		BufferedWriter bf = new BufferedWriter(rd);
		bf.write(f);
		bf.close();
		
		
//		String f= line;
//		switch (f) {
//		case "Edge" : 
//			System.setProperty("webdriver.edge.driver",
//					"C:\\Users\\simou\\eclipse-workspace\\tess\\driver\\msedgedriver.exe");
//			driver = new EdgeDriver(); break;
//			
//			
//		case "chrome" :
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\simou\\eclipse-workspace\\tess\\driver\\chromedriver.exe");
//			driver = new ChromeDriver(); break;
//			
//			default :
//				
//				System.setProperty("webdriver.chrome.driver",
//						"C:\\Users\\simou\\eclipse-workspace\\tess\\driver\\chromedriver.exe");
//				driver = new ChromeDriver();}
//		
//		driver.get("https://techfios.com/billing/?ng=admin");
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(f);
//		String k = driver.findElement(By.xpath("//input[@name='username']")).getText();

//		driver.close();	
	}
	
	
	@Before

	public void bef() throws Exception {
		
		String path = "Data\\Test.properties";
		File ff = new File(path);
		FileReader rd = new FileReader(ff);
		BufferedReader bf = new BufferedReader(rd);
		String line = bf.readLine();
		
//		System.out.println("Write the browser");
//		Scanner ui = new Scanner(System.in);
//		String f = ui.nextLine();
//		String f="";
//		f = driver.findElement(By.xpath("//input[@name='username']")).getText();
//		
//		if(f.equalsIgnoreCase("chrome")|| f.equalsIgnoreCase("edge") ){
//		String g = f;
		String f= line;
		switch (f) {
			case "edge" : 
				System.setProperty("webdriver.edge.driver",
						"C:\\Users\\simou\\eclipse-workspace\\tess\\driver\\msedgedriver.exe");
				driver = new EdgeDriver(); break;
			case "chrome" :
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\simou\\eclipse-workspace\\tess\\driver\\chromedriver.exe");
				driver = new ChromeDriver(); break;
				
				default :
					
					System.setProperty("webdriver.chrome.driver",
							"C:\\Users\\simou\\eclipse-workspace\\tess\\driver\\chromedriver.exe");
					driver = new ChromeDriver();
				
		}
				
		
//		if ("Chrome".equalsIgnoreCase(f)) {
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\simou\\eclipse-workspace\\tess\\driver\\chromedriver.exe");
//			driver = new ChromeDriver();
//		}
//		if ("Edge".equalsIgnoreCase(f)) {
//			System.setProperty("webdriver.edge.driver",
//					"C:\\Users\\simou\\eclipse-workspace\\tess\\driver\\msedgedriver.exe");
//			driver = new EdgeDriver();
//		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/billing/?ng=admin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

	@Test
	public void lsadsa() throws InterruptedException {

		String title = driver.getTitle();

		Assert.assertEquals("wrong page", "Login - iBilling", title);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demo@techfios.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")).click();
		Select sad = new Select(driver.findElement(By.xpath("//*[@id=\"cid\"]")));
		driver.findElement(By.xpath("//*[@id=\"cid\"]"));
		driver.close();
	}
	
	@Test
	public void lsadsas() throws InterruptedException {

		String title = driver.getTitle();

		Assert.assertEquals("wrong page", "Login - iBilling", title);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demo@techfios.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")).click();
		Select sad = new Select(driver.findElement(By.xpath("//*[@id=\"cid\"]")));
		driver.findElement(By.xpath("//*[@id=\"cid\"]"));
		driver.close();
	}
		
		
}
