/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qa.pages;

import com.qa.base.MyBase;
import static com.qa.base.MyBase.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author virad
 */
public class LoginPage extends MyBase{
    
    @FindBy (id = "//img[@class ='costco-logo']")
    WebElement signinText;
    
    
    
    
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    
    public void checkingTestVisiblity(){
       signinText.isDisplayed();
    }
    
    
    
    
    
    
    
}
