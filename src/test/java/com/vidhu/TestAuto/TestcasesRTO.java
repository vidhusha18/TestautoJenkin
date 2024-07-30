package com.vidhu.TestAuto;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestcasesRTO {

	
	private WebDriver driver;
	
    @BeforeAll
    void setUp() {
        driver = new ChromeDriver();
    }

    @AfterAll
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @BeforeEach
    void goToHomePage() {
    	driver.get("http://localhost:3000/");
    }
	
	@Test
	void testfindSucess(){

		
//		WebDriver driver = new ChromeDriver();
//		driver.get("http:localhost:3000");
		driver.manage().window().maximize();
		driver.navigate().to("http:localhost:3000/findlicense");
       WebElement searchInput = driver.findElement(By.id("search"));
        searchInput.sendKeys("1");
        // Find and click the search button
        WebElement searchButton = driver.findElement(By.id("button"));
        searchButton.click();

         //Verify the fetched data
//        WebElement table = driver.findElement(By.tagName("table"));
//        List<WebElement> rows = table.findElements(By.tagName("tr"));
        
        assertEquals("license Id","license Id");
        

        
        
    }

	
	@Test
	void testfindSucess1(){

//		WebDriver driver = new ChromeDriver();
//		driver.get("http:localhost:3000");
		driver.manage().window().maximize();
		driver.navigate().to("http:localhost:3000/findlicense");
        WebElement searchInput = driver.findElement(By.id("search"));
        searchInput.sendKeys("1");
         //Find and click the search button
        WebElement searchButton = driver.findElement(By.id("button"));
        searchButton.click();

         //Verify the fetched data
//        WebElement table = driver.findElement(By.tagName("table"));
//        List<WebElement> rows = table.findElements(By.tagName("tr"));
        
        assertEquals("license Name","license Name");
        

        
        
    }
	
	@Test
	void testfindFail(){

		
//		WebDriver driver = new ChromeDriver();
//		driver.get("http:localhost:3000");
		driver.manage().window().maximize();
		
		driver.navigate().to("http:localhost:3000/findlicense");
		WebElement searchInput = driver.findElement(By.id("search"));
        searchInput.sendKeys("101");
        //Find and click the search button
        WebElement searchButton = driver.findElement(By.id("button"));
        searchButton.click();
        assertSame("Record not found","Record not found");

        
        
   }
	
	@Test
	  public void testLDelete() {
//	    driver.get("http://localhost:3000/");
	    //driver.manage().window().setSize(new Dimension(1536, 816));
	    driver.findElement(By.linkText("View license")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(3) .ms-1")).click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Do you want to delete", txt);
	  }
	
	
//	@Test
//	public void updateUser() {
//		driver.get("http://localhost:3000/updatecustomer/1");
//		//driver.manage().window().setSize(new Dimension(1051, 798));
//		driver.findElement(By.name("licenseTypeF")).clear();
//		driver.findElement(By.name("licenseTypeF")).sendKeys("");
//		driver.findElement(By.name("licenseTypeF")).sendKeys("xxxxx");
//		driver.findElement(By.name("mobileNumber")).clear();
//		driver.findElement(By.name("mobileNumber")).sendKeys("8903423239");
//		driver.findElement(By.name("emailId")).clear();
//		driver.findElement(By.name("emailId")).sendKeys("kumar@gmail.com");
//		driver.findElement(By.name("address")).clear();
//		driver.findElement(By.name("address")).sendKeys("dgl");
//		driver.findElement(By.name("buttonUpdate")).submit();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		String txt = alert.getText();
//		System.out.println(txt);
//		alert.accept();
//		assertEquals("Please enter Customer's Name !!! ", txt);
	}
	
	


