package com.vidhu.TestAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class App 
{
    public static void main( String[] args )
    
    {
    	

    	WebDriver driver =new EdgeDriver(); //to open in edge 
    	
//    	WebDriver driver =new ChromeDriver(); //to open in chrome
    	//driver.get("http://www.google.com"); //to open corresponding page to be loaded
    	
    	driver.get("localhost:3001");
//    	driver.navigate().
//    	driver.findElement(By.name("q")).sendKeys("selenium");
//    	System.out.println(driver.getCurrentUrl()); // to locate current url we're working with
//    	System.out.println(driver.getTitle());
//    	
//    	driver.switchTo().alert().accept() ;
    	
//    	driver.navigate().to("https://iniapro.relevantz.com");
    	//by.name is ID of search box ; sendkeys is to pass words
    
//    	
//    	//driver.findElement(null)
//    	driver.findElement(By.name("btnK")).submit();    	
//    	driver.manage().window().maximize();

    	
//    	driver.navigate().to("https://iniapro.relevantz.com");
//    	driver.findElement(By.name("username")).sendKeys("vidhusha.virumandi");
//    	driver.findElement(By.name("password")).sendKeys("Vidhupriya@182627");
//    	driver.findElement(By.name("login")).submit();  
    	
    	}
}
