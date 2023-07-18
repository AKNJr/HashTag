package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public BaseClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected WebDriver driver;

    public static void waitUntil(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static String fakerName() {
        Faker faker = new Faker();
        return faker.name().fullName();
    }

    public static String fakerEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public static String fakerPhoneNumber(int num) {
        Faker faker = new Faker();
        return faker.number().digits(num);
    }

    public static String fakerDescription() {
        Faker faker = new Faker();
        return (faker.funnyName() + faker.phoneNumber().cellPhone() + "!@##$%$^%");
    }

    public static void sleep(long milliseconds) throws InterruptedException {
        try {
            Thread.sleep(milliseconds);
        } catch(Exception e){
            e.printStackTrace();
        }

        }
    public static void verify(WebElement element,String msg){
       try{
        String actualMsg = element.getText();
        Assert.assertFalse(actualMsg.equalsIgnoreCase(msg));

    }catch(Exception e){
       e.printStackTrace();
       }
    }
    public static void scrollToElementAndClick(WebDriver driver, WebElement element){
        Actions action = new Actions(driver);
        action.scrollToElement(element).click().build().perform();
    }
    public static void scrollToElementJS(WebDriver driver,WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }
    public static void click(WebDriver driver,WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",element);
    }
    public static void verifyTrue(Boolean bool){
        Assert.assertTrue(bool);
    }
    public static int randomNumber(int begin,int end){
        return ThreadLocalRandom.current().nextInt(begin, end);
    }


}