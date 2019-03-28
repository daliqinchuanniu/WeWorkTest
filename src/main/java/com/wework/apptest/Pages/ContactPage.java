package com.wework.apptest.Pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ContactPage extends BasePage{

    By manager = By.id("com.tencent.wework:id/e9h");


    public ContactManagerPage gotoCMPage(){
        click(manager);
        return new ContactManagerPage();
    }

    public String get(String name){
        By departmentname = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)" +
                ".instance(0)).scrollIntoView(new UiSelector().text(\""+ name +"\").instance(0));");
        return attribute(departmentname,"text");
    }
}
