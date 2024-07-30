package com.vidhu.TestAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AddLicense {

	public static void main(String[] args) {
		
		
		WebDriver driver =new EdgeDriver(); //to open in edge
		driver.get("localhost:3000");
		driver.manage().window().maximize();
		
		driver.navigate().to("http://localhost:3000/addlicense");
		driver.findElement(By.name("licenseTypeF")).sendKeys("threeWheeler");
		driver.findElement(By.name("submit")).submit();
		

	}

}
