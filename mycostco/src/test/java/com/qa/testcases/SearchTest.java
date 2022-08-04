/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.qa.testcases;

import com.qa.base.MyBase;
import com.qa.pages.ProductPage;
import com.qa.pages.SearchPage;
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
public class SearchTest extends MyBase {
     
     SearchPage sp;
    
    public SearchTest() {
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
        sp = new SearchPage();
        
        
                
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void validateSearchTest(){
        sp.validateSearch();
        
    }
  
    
    
    
    
}
