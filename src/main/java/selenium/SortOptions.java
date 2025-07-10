package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;

public class SortOptions {

    public static void main(String[] str){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
       Select select = new Select(driver.findElement(By.id("colors")));
       List<String> list1 = select.getOptions().stream().map(WebElement::getText).toList();
        List<String> list2 = list1;
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println(list2);
    }
}
