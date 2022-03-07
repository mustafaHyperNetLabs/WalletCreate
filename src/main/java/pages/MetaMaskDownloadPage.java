package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MetaMaskDownloadPage extends Base {

    public MetaMaskDownloadPage(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(this.webDriver,this);
    }


    public void clickInstall() throws InterruptedException {
        super.switchHandle();
        Thread.sleep(2000);
        WebElement installButton = webDriver.findElement(By.xpath("//a[text()='Install MetaMask for Chrome']"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(installButton));
        installButton.click();
    }
}
