package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HyperNetIDPage extends Base {

    public HyperNetIDPage(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(this.webDriver,this);
    }

    public void clickStart() throws InterruptedException {
        Thread.sleep(5000);
        WebElement startButton = webDriver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase')]"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(startButton));
        startButton.click();
    }

    public void clickMetaMaskAndConnect() throws InterruptedException {
        Thread.sleep(2000);
        WebElement metaMaskButton = webDriver.findElement(By.xpath("//div[@title='MetaMask']"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(metaMaskButton));
        metaMaskButton.click();
        WebElement connectButton = webDriver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase')]"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(connectButton));
        connectButton.click();
    }

    public void installMetaMaskExtension() throws InterruptedException {
        Thread.sleep(2000);
        WebElement metaMaskExtensionButton = webDriver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase')]/span[text()='Install MetaMask Extension']"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(metaMaskExtensionButton));
        metaMaskExtensionButton.click();
    }

    /*public void installedMetaMask() throws InterruptedException {
        Actions builder = new Actions(webDriver);
        builder.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
        super.switchHandle();
        Thread.sleep(10000);
        WebElement doneInstalling = webDriver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase')]/span[text()='I’m Done Installing']"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'MuiButtonBase')]/span[text()='I’m Done Installing']")));
        doneInstalling.click();
        Thread.sleep(10000);
    }*/
}
