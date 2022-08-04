/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qa.base;

import static com.qa.util.TestUtil.wait;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MyBase {
public  static WebDriver driver;
public  static Properties prop;
public static WebDriverWait wait;
    public MyBase() {
        try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\virad\\Documents\\NetBeansProjects\\mycostco\\src\\main\\java\\com\\qa\\config\\config.properties");
		//FileInputStream ip1 = new FileInputStream( "C:\\Users\\virad\\git\\PizzaHFinal\\1\\PizzaHTest\\src\\main\\java\\com\\pizzahut\\qa\\configuration\\config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
    }
    

   public static void initialization(){
       String browserName = prop.getProperty("browser");
       if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		
	}
	else if(browserName.equals("FF")){
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\drivers\\geckodriver.exe");	
		driver = new FirefoxDriver(); 
	}
	
//	e_driver = new EventFiringWebDriver(driver);
//	// Now create object of EventListerHandler to register it with EventFiringWebDriver
//	eventListener = new WebEventListener();
//	e_driver.register(eventListener);
//	driver = e_driver;
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(prop.getProperty("url"));
	
       

        
   } 
    public static void setExplicitWait(int seconds) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    
    
    
}
