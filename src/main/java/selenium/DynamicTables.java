package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTables {
    public static void main(String ... args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/dynamic-table");
        driver.manage().window().maximize();
        List<WebElement> tableHeaderList = driver.findElements(By.xpath("//table//th"));
        String tdValue = "//table//tr[%s]/td";
        tableHeaderList.stream().map(WebElement::getText).map(a->a+"  ").forEach(System.out::print);
        System.out.println();

        for(int i=1;i<tableHeaderList.size();i++){
            List<WebElement> ele = driver.findElements(By.xpath(String.format(tdValue, i)));
            if(ele.get(0).getText().equals("Chrome")) {
                ele.stream().map(WebElement::getText).map(a -> a + "  ").forEach(System.out::print);
            }
            System.out.println();

        }
        driver.quit();
    }
}
