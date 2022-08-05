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
public class CustomerService extends MyBase {

    @FindBy(xpath = "//a[@id='customer-service-link']")
    WebElement customerservice;

    @FindBy(xpath = "//p[contains(text(),'My Orders')]")
    WebElement myorder;

    @FindBy(xpath = "//iframe[@id='chatInlay']")
    WebElement chatus;

//    @FindBy(xpath = "//*[@id=\"leftNavWrapper\"]/a[3]/div/")
//    WebElement replaceitem;

    @FindBy(xpath = "//p[contains(text(),'In-Home Delivery FAQ')]")
    WebElement inhomedelivery;

    public CustomerService() {

        PageFactory.initElements(driver, this);
    }

    public void clickonCustomerService() throws InterruptedException {
          customerservice.click();
        
    }

    public void clickOnMyOrder() throws InterruptedException {
        myorder.click();
       

    }
    public boolean clickonChatUs() throws InterruptedException {
        return chatus.isEnabled();
       
    }

    public void clickoninHomeDelivery() throws InterruptedException {
        inhomedelivery.click();
      
    }
//    public void clickonReplaceItem() {
//        replaceitem.click();
//    }
}