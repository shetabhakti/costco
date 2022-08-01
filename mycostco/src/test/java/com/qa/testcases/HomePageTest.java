/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.qa.testcases;

import com.qa.base.MyBase;
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
public class HomePageTest extends MyBase {

    HomePage hp;

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

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }

    @Test
    public void validateHomePageTitle() {
        String Title = hp.validateHomePageTitle();
        Assert.assertEquals(Title, "Welcome to Costco Wholesale");

    }

    @Test
    public void validateLogo() {
        boolean logo = hp.validateLogo();
        Assert.assertFalse(logo);
    }
}
