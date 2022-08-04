/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qa.pages;

import com.qa.base.MyBase;
import jdk.jfr.Name;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author virad
 */
public class HomePage extends MyBase{
 //Page Factory = obeject Repository 
    
    Actions action = new Actions(driver);
    @FindBy(id ="header_sign_in")
    WebElement signIn;
    
    @FindBy(xpath= "//img[@class='bc-logo logo-us']")
    WebElement logo;
    
    @FindBy(xpath = "//*[@id=\"cart-d\"]")
    WebElement cartlink;
    
    @FindBy(xpath = "//*[@id=\"customer-service-link\"]")
    WebElement customerServiceLink;
    
    @FindBy(xpath ="//a[contains(text(),'Feedback')]")
    WebElement feedback;
    
    
   
     
     
     
    
  // Initializing the object 
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    
  //Action Method  
    public String validateHomePageTitle(){
        return driver.getTitle();
        
    }
    
    public boolean  validateLogo(){
        return logo.isDisplayed();
    }
    
    public CartPage clickOnCartLink(){
         cartlink.click();
         return new CartPage();
    }
    public CustomerService clickOnCustomerService(){
        customerServiceLink.click();
        return new CustomerService();
        
    }
      
    public boolean validateFeedBack(){
        
        return feedback.isDisplayed();
    }

}