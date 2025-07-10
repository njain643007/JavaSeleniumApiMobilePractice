//package mobiletesting;
//
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class Mobile1 {
//    AndroidDriver driver;
//    @BeforeTest
//    public void setup() throws MalformedURLException {
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setApp("/home/user/IdeaProjects/Practice/src/test/resources/ApiDemos-debug.apk")
//                .setAutomationName("UiAutomator2")
//                .setAutoGrantPermissions(true)
//                .setDeviceName("emulator-5554")
//                .setNoReset(true)
//                .setPlatformName("Android");
//
//        driver = new AndroidDriver(new URL("http://localhost:4723"), options);
//
//    }
//    @Test
//    public void m1() throws InterruptedException {
//        driver.findElement(AppiumBy.accessibilityId("Media")).click();
//        Thread.sleep(10000);
//    }
//}
