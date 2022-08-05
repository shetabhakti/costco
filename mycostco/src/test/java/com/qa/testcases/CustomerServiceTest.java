/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.qa.testcases;

import com.qa.base.MyBase;
import com.qa.pages.CustomerService;
import com.qa.pages.HomePage;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author virad
 */
public class CustomerServiceTest extends MyBase {

    HomePage hp;
    CustomerService cs;

    public CustomerServiceTest() {
        super();
    }

    @BeforeClass
    public void setUpClass() throws Exception {
        initialization();
        hp = new HomePage();
        cs = new CustomerService();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        driver.quit();
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(priority=0)
    public void clickonCustomerServiceTest() throws InterruptedException {
        cs.clickonCustomerService();
    }
  
    @Test(priority=1)
    public void clickonInhomeDelivery() throws InterruptedException {
        cs.clickoninHomeDelivery();
    }

    @Test(priority=2)
    public void clickonChatUsTest() throws InterruptedException {
        Assert.assertTrue(cs.clickonChatUs());
        Thread.sleep(3000);
    }
  
//    @Test (priority=3)
//    public void clickonReplaceItem(){
//        cs.clickonReplaceItem();
//    }
    @Test(priority=4)
    public void clickOnMyorderTest() throws InterruptedException {
        cs.clickOnMyOrder();
    }
}
