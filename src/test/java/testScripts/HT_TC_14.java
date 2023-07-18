package testScripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.BaseClass;
import pages.CareerApply;

public class HT_TC_14 extends BaseTest {

    @Test
    public void HT_TC_14(){
        CareerApply ca = new CareerApply(driver);
        for(WebElement ele :ca.hyperlinks){
            BaseClass.verifyTrue(ele.isEnabled());
        }
    }
}
