/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qa.pages;

import com.qa.base.MyBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 *
 * @author virad
 */
public class ProductPage extends MyBase{
    
    @FindBy (xpath = "//img[@alt='Dell Inspiron 15 Touchscreen Laptop - 11th Gen Intel Core i5-1135G7 - 1080p - Windows 11, Black']")
    WebElement product;
    
    @FindBy (xpath ="//span[contains(text(),'Search Results')]")
    WebElement serachresult;
    
    

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }
    
    
    public String  validateProductPageTitle(){
       return driver.getTitle();
        
    }
    public boolean addProduct(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        return product.isDisplayed();
        
                }    
    
   public boolean checkSearchResult(){
       return serachresult.isDisplayed();
   }
   
   
        
        
    
}
