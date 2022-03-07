package pages;

import base.Base;
import org.openqa.selenium.*;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ChromeAddOns extends Base {
    public ChromeAddOns(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(this.webDriver,this);

    }

    public void AddToChrome() throws InterruptedException, AWTException {
        super.switchHandle();
        Thread.sleep(5000);
        WebElement addToChrome = webDriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[2]/div/div/div/div"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(addToChrome));
        addToChrome.click();
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(25000);
    }

}
