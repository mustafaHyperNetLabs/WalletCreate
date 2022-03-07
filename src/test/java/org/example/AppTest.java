package org.example;


import base.Base;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ChromeAddOns;
import pages.HyperNetIDPage;
import pages.MetaMaskDownloadPage;
import pages.MetaMaskPage;

import java.awt.*;

public class AppTest extends Base {
    HyperNetIDPage hyperNetID = new HyperNetIDPage(webDriver,webDriverWait);
    MetaMaskDownloadPage metaMask = new MetaMaskDownloadPage(webDriver,webDriverWait);
    ChromeAddOns chromeAddOns = new ChromeAddOns(webDriver,webDriverWait);
    MetaMaskPage metaMaskPage = new MetaMaskPage(webDriver,webDriverWait);
    @BeforeTest
    public void beforeMethod() {
        super.setUp();
    }

    @Test(priority = 1)
    public void ClickStart() throws InterruptedException {
        hyperNetID.clickStart();
    }

    @Test(priority = 2)
    public void clickMetaMaskAndConnect() throws InterruptedException {
        hyperNetID.clickMetaMaskAndConnect();
    }

    @Test(priority = 3)
    public void installMetaMaskExtension() throws InterruptedException {
        hyperNetID.installMetaMaskExtension();
    }
    @Test(priority = 4)
    public void clickInstall() throws InterruptedException {
        metaMask.clickInstall();
    }

    @Test(priority = 5)
    public void clickAddChrome() throws InterruptedException, AWTException {
        chromeAddOns.AddToChrome();
    }

    @Test(priority = 6)
    public void clickStartMetaWallet() throws InterruptedException {
        metaMaskPage.clickStart();

    }

    @Test(priority = 7)
    public void clickCreateWallet() throws InterruptedException {
        metaMaskPage.clickCreateWallet();

    }

    @Test(priority = 8)
    public void clickNo() throws InterruptedException {
        metaMaskPage.clickNo();

    }

    @Test(priority = 9)
    public void createPassword() throws InterruptedException {
        metaMaskPage.createPassword();

    }

    @Test(priority = 10)
    public void clickNext() throws InterruptedException {
        metaMaskPage.clickNext();

    }

    @Test(priority = 11)
    public void clickLock() throws InterruptedException {
        metaMaskPage.clickLock();

    }

    /*@Test(priority = 12)
    public void installedMetaMask() throws InterruptedException, AWTException {
        hyperNetID.installedMetaMask();

    }*/

    @AfterTest
    public void afterMethod(){
        super.tearDown();
    }

}
