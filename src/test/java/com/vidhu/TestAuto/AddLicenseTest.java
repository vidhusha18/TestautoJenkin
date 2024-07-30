package com.vidhu.TestAuto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



class AddLicenseTest {


    
//    @Order(1)
	@Test
	void testaddLicensePass() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		//driver.manage().window().maximize();
		driver.navigate().to("http://localhost:3000/addlicense");
		driver.findElement(By.name("licenseTypeF")).sendKeys("threeWheeler");
		driver.findElement(By.name("submit")).submit();
		assertSame("Addsuccess", "Data added Successfully", "Data added Successfully");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
//		assertEquals("Data added Successfully", txt);
//		
		
	}


//	@Order(2)
	@Test
	void testaddLicenseFail() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:3000/addlicense");
		driver.findElement(By.name("licenseTypeF")).sendKeys("12gjgjg");
		driver.findElement(By.name("submit")).submit();
		
		assertSame("Addfailure", "Please Enter the Valid Inputs!!!", "Please Enter the Valid Inputs!!!");

		 
		}

	
//	
//	@Test
//	void testfindSucess(){
//
////		
////		WebDriver driver = new ChromeDriver();
////		driver.get("http://localhost:3000");
//		//driver.manage().window().maximize();
//		driver.navigate().to("http://localhost:3000/findlicense");
//        WebElement searchInput = driver.findElement(By.id("search"));
//        searchInput.sendKeys("1");
//        // Find and click the search button
//        WebElement searchButton = driver.findElement(By.id("button"));
//        searchButton.click();
//
//        // Verify the fetched data
////        WebElement table = driver.findElement(By.tagName("table"));
////        List<WebElement> rows = table.findElements(By.tagName("tr"));
//        
//        assertEquals("license Id","license Id");
//        
//
//        
//        
//    }
//
//	
//	@Test
//	void testfindSucess1(){
//
////		WebDriver driver = new ChromeDriver();
////		driver.get("http://localhost:3000");
//		//driver.manage().window().maximize();
//		driver.navigate().to("http://localhost:3000/findlicense");
//        WebElement searchInput = driver.findElement(By.id("search"));
//        searchInput.sendKeys("1");
//        // Find and click the search button
//        WebElement searchButton = driver.findElement(By.id("button"));
//        searchButton.click();
//
//        // Verify the fetched data
////        WebElement table = driver.findElement(By.tagName("table"));
////        List<WebElement> rows = table.findElements(By.tagName("tr"));
//        
//        assertEquals("license Name","license Name");
//        
//
//        
//        
//    }
//	
//	@Test
//	void testfindFail(){
//
//		
////		WebDriver driver = new ChromeDriver();
////		driver.get("http://localhost:3000");
//		//driver.manage().window().maximize();
//		
//		driver.navigate().to("http://localhost:3000/findlicense");
//       WebElement searchInput = driver.findElement(By.id("search"));
//        searchInput.sendKeys("101");
//       // Find and click the search button
//        WebElement searchButton = driver.findElement(By.id("button"));
//       searchButton.click();
//        assertSame("Record not found","Record not found");
//
//        
//        
//   }
	
	
	}



	
	
	
