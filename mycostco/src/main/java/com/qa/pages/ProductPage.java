/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qa.pages;

import com.qa.base.MyBase;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author virad
 */
public class ProductPage extends MyBase{

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }
    
    
    public String  validateProductPageTitle(){
       return driver.getTitle();
        
    }
}
