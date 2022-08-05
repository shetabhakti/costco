/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.qa.testcases;

import com.qa.base.MyBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
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
public class LoginPageTest extends MyBase{
    LoginPage lp;
    HomePage hp;
    
    
    public LoginPageTest() {
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
        lp = new LoginPage();
        hp = new HomePage();
        hp.clickOnSignIn();
        
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }
    
    //@Test
    public void checkingTextVisiblityTest(){
        lp.checkingTestVisiblity();
        
    }
}
