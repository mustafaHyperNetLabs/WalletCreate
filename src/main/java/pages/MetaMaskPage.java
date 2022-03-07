package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MetaMaskPage extends Base {

    String password = "Ankara12.";
    public MetaMaskPage(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(this.webDriver,this);
    }

    public void clickStart() throws InterruptedException {
        super.switchHandle();
        WebElement startButton = webDriver.findElement(By.xpath("//button[text()='Başlarken']"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Başlarken']")));
        startButton.click();
        Thread.sleep(5000);
    }

    public void clickCreateWallet() throws InterruptedException {
        WebElement createWallet = webDriver.findElement(By.xpath("//button[text()='Bir Cüzdan Oluştur']"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Bir Cüzdan Oluştur']")));
        createWallet.click();
        Thread.sleep(5000);
    }

    public void clickNo() throws InterruptedException {
        WebElement noButton = webDriver.findElement(By.xpath("//button[text()='Hayıt, istemiyorum']"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Hayıt, istemiyorum']")));
        noButton.click();
        Thread.sleep(5000);
    }

    public void createPassword() throws InterruptedException {
        WebElement createPassword = webDriver.findElement(By.id("create-password"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("create-password")));
        createPassword.click();
        createPassword.sendKeys(password);
        WebElement confirmPassword = webDriver.findElement(By.id("confirm-password"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirm-password")));
        confirmPassword.click();
        confirmPassword.sendKeys(password);
        WebElement firstTime = webDriver.findElement(By.xpath("//div[@class='first-time-flow__checkbox']"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='first-time-flow__checkbox']")));
        firstTime.click();
        WebElement createButton = webDriver.findElement(By.xpath("//button[@class='button btn--rounded btn-primary first-time-flow__button']"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button btn--rounded btn-primary first-time-flow__button']")));
        createButton.click();
        Thread.sleep(5000);
    }

    public void clickNext() throws InterruptedException {
        WebElement btnNext = webDriver.findElement(By.xpath("//button[@class='button btn--rounded btn-primary']"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button btn--rounded btn-primary']")));
        btnNext.click();
        Thread.sleep(5000);

    }

    public static void selectPhrase(String [] phraseArray) throws InterruptedException {
        int lenPhrase = phraseArray.length;
        for(int i = 0; i<lenPhrase; i++){
            WebElement nextPhrase = webDriver.findElement(By.xpath("//div[text()='"+phraseArray[i]+"']"));
            Thread.sleep(1000);
            nextPhrase.click();
        }
    }

    public void clickLock() throws InterruptedException {
        WebElement lockSign = webDriver.findElement(By.xpath("//div[@class='reveal-seed-phrase__reveal-button']"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='reveal-seed-phrase__reveal-button']")));
        lockSign.click();
        Thread.sleep(500);
        WebElement secretPhrase = webDriver.findElement(By.xpath("//div[@class='reveal-seed-phrase__secret-words notranslate']"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='reveal-seed-phrase__secret-words notranslate']")));
        String secretPhraseText = secretPhrase.getText();
        String [] splited = secretPhraseText.split("\\s+");
        WebElement clickNext = webDriver.findElement(By.xpath("//button[text()='Sonraki']"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Sonraki']")));
        clickNext.click();
        selectPhrase(splited);
        WebElement clickApprove = webDriver.findElement(By.xpath("//button[text()='Onayla']"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Onayla']")));
        clickApprove.click();
        WebElement clickFinished = webDriver.findElement(By.xpath("//button[text()='Tümü Bitti']"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Tümü Bitti']")));
        clickFinished.click();
        WebElement clickClose = webDriver.findElement(By.xpath("//button[@title='Kapat']"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Kapat']")));
        clickClose.click();
        Thread.sleep(10000);
    }
}
