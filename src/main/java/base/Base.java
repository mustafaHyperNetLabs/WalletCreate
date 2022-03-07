package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;


public class Base {

    protected static WebDriver webDriver;
    protected static WebDriverWait webDriverWait;
    String currentHandle;
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        String baseUrl = "https://app.hypernet.id/";
        webDriver.get(baseUrl);
        currentHandle = webDriver.getWindowHandle();
        webDriver.manage().window().maximize();
    }

    public void switchHandle() {
        Set<String> handles = webDriver.getWindowHandles();
        for (String actual : handles) {
            if (!actual.equalsIgnoreCase(currentHandle)) {
                webDriver.switchTo().window(actual);
            }
            System.out.println(actual);
        }
    }


    public void tearDown(){
        webDriver.close();
        webDriver.quit();
    }
}
