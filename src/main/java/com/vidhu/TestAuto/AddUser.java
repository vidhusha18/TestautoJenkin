package com.vidhu.TestAuto;

import static org.junit.Assert.assertSame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddUser {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("http://localhost:3000/adduser");
		driver.findElement(By.name("userName")).sendKeys("Vidhusha");
		driver.findElement(By.name("userGender")).sendKeys("female");
		driver.findElement(By.name("aadharF")).sendKeys("995274171221");
		Select dropdown = new Select(driver.findElement(By.name("licenseId")));  
		dropdown.selectByVisibleText(" Select One");  
		driver.findElement(By.name("submit")).submit();
		assertSame("success", "Data added Successfully", "Data added Successfully");

	}

}
