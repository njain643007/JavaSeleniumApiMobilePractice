package seleniumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShadowRoot {

    @Test
    public void m1() throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://watir.com/examples/shadow_dom.html");
        Thread.sleep(5000);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        WebElement text = (WebElement) javascriptExecutor.executeScript("return document.querySelector(\"#shadow_host\").shadowRoot.querySelector(\"input[type=text]:nth-child(4)\")");
        text.sendKeys("ABC");


        File file = text.getScreenshotAs(OutputType.FILE);
       File copyfile = new File("screenshot.png");
        FileHandler.copy(file, copyfile);


    }
}
