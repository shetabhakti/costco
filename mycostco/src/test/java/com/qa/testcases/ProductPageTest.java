/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.qa.testcases;

import com.qa.base.MyBase;
import static com.qa.base.MyBase.initialization;
import com.qa.pages.CartPage;
import com.qa.pages.CustomerService;
import com.qa.pages.HomePage;
import com.qa.pages.ProductPage;
import com.qa.pages.SearchPage;
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
public class ProductPageTest extends MyBase{
    HomePage hp;
    SearchPage sp;
    
    TestUtil tu;
    ProductPage pp;
    
    public ProductPageTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

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
        sp = new SearchPage();
        sp.validateSearch();
        
        pp = new ProductPage();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }
    
    @Test(priority = 0)
    public void validateProductPageTitleTest(){
       String Title = pp.validateProductPageTitle();
        Assert.assertEquals(Title, "Welcome to Costco Wholesale");        
    }
    
   // @Test(priority = 1)
    public void addProductTest(){
        pp.addProduct();
      // Assert.assertTrue(pp.addProduct()); 
    }
    
   // @Test
    public void checkSearchResultTest(){
      pp.checkSearchResult();
    }
    
}
