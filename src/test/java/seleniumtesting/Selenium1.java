package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selenium1 {
    @Test
    public void m1(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        Select select = new Select(driver.findElement(By.xpath("")));
        FirefoxOptions options = new FirefoxOptions();
        options.setAcceptInsecureCerts(true);

    }
}
