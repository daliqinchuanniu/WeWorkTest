package com.wework.apptest.Pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage {
    By contact = byText("通讯录");

    static MainPage mainPage;
    public static MainPage getInstance(){
        if (null == mainPage){
            return new MainPage();
        }
        return mainPage;
    }

    public ContactPage gotoContactPage(){
        click(contact);
        return new ContactPage();
    }
}
