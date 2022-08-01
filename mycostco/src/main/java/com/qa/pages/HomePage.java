/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qa.pages;

import com.qa.base.MyBase;
import jdk.jfr.Name;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author virad
 */
public class HomePage extends MyBase{
 //Page Factory = obeject Repository 
    @FindBy(id ="header_sign_in")
    WebElement signIn;
    
    @FindBy(xpath= "//img[@class='bc-logo logo-us']")
    WebElement logo;
    
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
}
