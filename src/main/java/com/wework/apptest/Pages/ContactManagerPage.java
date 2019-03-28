package com.wework.apptest.Pages;

import org.openqa.selenium.By;

public class ContactManagerPage extends BasePage{

    By 添加子部门 = byText("添加子部门");
    By 添加成员 = byText("添加成员");
    By b_back = By.id("com.tencent.wework:id/e9k");


    public ContactManagerPage add(String name){
        click(添加子部门);
        sendkeys(By.id("com.tencent.wework:id/bb7"),name);
        click(byText("确定"));
        return this;
    }

    public ContactPage back(){
        click(b_back);
        return new ContactPage();
    }
}
