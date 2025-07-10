package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Iframes {
    public static void main(String ... args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
//        driver.switchTo().frame(0);
//        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("ABC");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("ABC");
    }
}
