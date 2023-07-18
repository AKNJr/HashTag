package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.io.File;
import java.util.List;

public class CareerApply extends BaseClass {

    public CareerApply(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "name")
    public WebElement nameTextField;
    @FindBy(name = "email")
    public WebElement emailTextField;
    @FindBy(name = "phone")
    public WebElement phoneTextField;
    @FindBy(xpath = "//textarea[@class='form-control hash-input']")
    public WebElement descriptionTextField;
    @FindBy(name = "resume")
    public WebElement resumeTextField;

    @FindBy(xpath = "(//div[@class='col-lg-10 col-md-12 col-sm-12 pt-5']/p)[2]")
    public WebElement mainErrorMsg;
    @FindBy(xpath = "(//div[@class='col-lg-10 col-md-12 col-sm-12 pt-5 pb-5 d-flex justify-content-center']/div/button)[1]")
    public WebElement applyNowButton;
    @FindBy(xpath = "//a")
    public List<WebElement> hyperlinks;

    public String cvPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
            + File.separator + "java" + File.separator + "utilities" + File.separator + "cv.pdf";
    public String invalidFormatData = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
            + File.separator + "java" + File.separator + "utilities" + File.separator + "packagename.apk";

    public void enterName(String value) {
        nameTextField.sendKeys(value);
    }

    public void enterEmail(String value) {
        emailTextField.sendKeys(value);
    }

    public void enterPhone(String value) {
        phoneTextField.sendKeys(value);
    }

    public void enterDescription(String value) {
        descriptionTextField.sendKeys(value);
    }

    public void addResume(String value) {

        resumeTextField.sendKeys(value);
    }

    public void apply() {
        BaseClass.click(driver, applyNowButton);

    }

    public void validate(String expected) {
        BaseClass.verify(mainErrorMsg, expected);
    }
}
