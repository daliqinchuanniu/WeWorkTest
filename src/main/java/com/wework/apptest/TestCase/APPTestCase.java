package com.wework.apptest.TestCase;

import com.wework.apptest.Driver.Driver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class APPTestCase {
    @BeforeAll
    public static void beforAllAppTestCase(){
        Driver.getInstance().start();
    }

    @AfterAll
    public static void afterAllAppTestCase(){
        Driver.getInstance().androidDriver.quit();
    }
}
