/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qa.pages;

import com.qa.base.MyBase;
import static com.qa.base.MyBase.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author virad
 */
public class CustomerService extends MyBase{
    
//    @FindBy(xpath = "//div[@id='leftNavItem']")
//    WebElement myorder;
    
    
    @FindBy(xpath = "//a[@id='customer-service-link']")
    WebElement customerservice;

    @FindBy(xpath = "//p[contains(text(),'My Orders')]")
    WebElement myorder;

    @FindBy(xpath = "//*[@id=\"chatInlay\"]/div[1]/div[3]/div[3]/oj-button/button")
    WebElement chatus;

//    @FindBy(xpath = "//*[@id=\"leftNavWrapper\"]/a[3]/div/")
//    WebElement replaceitem;

    @FindBy(xpath = "//p[contains(text(),'In-Home Delivery FAQ')]")
    WebElement inhomedelivery;
    
    
    
    
    
     public CustomerService(){
        PageFactory.initElements(driver, this);
    }
     
//     public void clickOnMyOrder(){
//         myorder.click();
//         
//     }
     public void clickonCustomerService() throws InterruptedException {
        customerservice.click();
        Thread.sleep(5000);
    }

    public void clickOnMyOrder() throws InterruptedException {
        myorder.click();
       Thread.sleep(5000);

    }
    public void clickonChatUs() throws InterruptedException {
        chatus.click();
       Thread.sleep(5000);
    }

    public void clickoninHomeDelivery() throws InterruptedException {
        inhomedelivery.click();
      Thread.sleep(5000);
    }
    
    
    public boolean checkSearchConsole(){
        WebElement search = driver.findElement(By.id("//div[@class='searchContainer']"));
       return  search.isDisplayed();
    }
//    public void clickonReplaceItem() {
//        replaceitem.click();
//    }
}
    

