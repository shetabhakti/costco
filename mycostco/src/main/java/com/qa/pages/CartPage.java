/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qa.pages;

//import com.qa.base.MyBase;

import com.qa.base.MyBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



/**
 *
 * @author virad
 */
public class CartPage extends MyBase{
    
    HomePage hp;
    
    
    @FindBy (xpath = "//div[contains(text(),'My Warehouse')]")
    WebElement cartText;
    
    
    
    public CartPage(){
        PageFactory.initElements(driver, this);
    }
    
    public String validateHomePageTitle(){
        return driver.getTitle();
        
    }
    public boolean checkCartText(){
        return cartText.isDisplayed();
    }
    
    
    
}
