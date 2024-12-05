package com.eliasnogueira.page.v2ex;

import com.eliasnogueira.driver.DriverManager;
import com.eliasnogueira.page.AbstractPageObject;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @ClassName HomePage
 * @Author tao.he
 * @email study.hetao@foxmail.com
 * @Since 2024/12/5 15:09
 */
public class HomePage extends AbstractPageObject {
    @FindBy(css = "#Tabs > a:nth-child(1)")
    private WebElement tech;

    @FindBy(css = "#Tabs > a:nth-child(2)")
    private WebElement tab;

    @FindBy(css = "#Tabs > a:nth-child(3)")
    private WebElement play;

    @Step
    public void clickHome() {
        DriverManager.getDriver().findElement(By.cssSelector("#Tabs > a:nth-child(10)")).click();
    }

    @Step
    public void clickTech() {
        tech.click();
    }

    @Step
    public void clickTab() {
        tab.click();
    }

    @Step
    public void clickPlay() {
        play.click();
    }
}
