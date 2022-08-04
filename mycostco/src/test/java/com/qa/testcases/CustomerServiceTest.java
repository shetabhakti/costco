/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.qa.testcases;

import com.qa.base.MyBase;
import com.qa.pages.CustomerService;
import com.qa.pages.HomePage;
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
public class CustomerServiceTest extends MyBase{
    CustomerService cs;
    
    
    public CustomerServiceTest() {
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
         //hp = new HomePage();
         cs = new CustomerService();
         
         
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    
    public void clickOnMyOrderTest(){
        cs.clickOnMyOrder();
    }
}
