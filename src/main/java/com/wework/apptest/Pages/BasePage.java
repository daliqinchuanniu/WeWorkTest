package com.wework.apptest.Pages;

import com.wework.apptest.Driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    WebElement find(By by){
        // TODO:弹出框处理
        return Driver.getInstance().find(by);
    }

    public void click(By by){
        find(by).click();
    }
    public void click(String text){
        find(byText(text)).click();
    }

    public void sendkeys(String content){
        Driver.getInstance().androidDriver.getKeyboard().sendKeys(content);
    }

    public void sendkeys(By by,String content){
        find(by).sendKeys(content);
    }

    public By byText(String text){
        // todo:如果TEXT有特殊字符需要处理
        return By.xpath("//*[@text='"+ text +"']");
    }

    public String attribute(By by,String name){
       // return find(by).getAttribute(name);
        return find(by).getAttribute(name);
    }
}
