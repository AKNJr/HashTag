package testScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.BaseClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup(); 
        driver = new ChromeDriver();
        driver.navigate().to("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(3000);
    }
}
