/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.qa.testcases;

import com.qa.base.MyBase;
import com.qa.pages.CartPage;
import com.qa.pages.CustomerService;
import com.qa.pages.HomePage;
import com.qa.util.TestUtil;
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
public class HomePageTest extends MyBase {

    HomePage hp;
    CartPage cp;
    CustomerService cs;
    TestUtil tu;

    public HomePageTest() {
        super();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        initialization();
        hp = new HomePage();
        cp = new CartPage();
        cs = new CustomerService();
        tu = new TestUtil();

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }

    @Test(priority =1)
    public void validateHomePageTitle() {
        String Title = hp.validateHomePageTitle();
        Assert.assertEquals(Title, "Welcome to Costco Wholesale");

    }

    @Test(priority = 2)
    public void validateLogo() {
        boolean logo = hp.validateLogo();
        Assert.assertFalse(logo);
    }

    @Test (priority = 3)

    public void clickOnCartLinkTest() {
       cp = hp.clickOnCartLink();
      

    }

    @Test

    public void clickOnCustomerServiceTest() {
       cs = hp.clickOnCustomerService();

    }
    
        
    @Test
    
    public void  validateFeedbackTest(){
        Assert.assertTrue(hp.validateFeedBack());
       
     
    }

}