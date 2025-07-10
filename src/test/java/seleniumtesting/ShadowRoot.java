import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowRoot {

    @Test
    public void m1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://watir.com/examples/shadow_dom.html");
        Thread.sleep(5000);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        WebElement text = (WebElement) javascriptExecutor.executeScript("return document.querySelector(\"#shadow_host\").shadowRoot.querySelector(\"input[type=text]:nth-child(4)\")");
        text.sendKeys("ABC");
    }
}
