/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qa.util;

import com.qa.base.MyBase;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author virad
 */
public class TestUtil extends MyBase {

    public static long PLT = 40;
    public static long IMP_wait = 60;
    

    public TestUtil() {
        super();
    }

    public void swithToFrame() {
        driver.switchTo().frame("Criteo DIS iframe");
    }

   

}
