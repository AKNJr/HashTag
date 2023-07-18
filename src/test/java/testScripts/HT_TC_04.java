package testScripts;

import org.testng.annotations.Test;
import pages.BaseClass;
import pages.CareerApply;

public class HT_TC_04 extends  BaseTest {
    @Test
    public void HT_TC_04(){
        CareerApply ca = new CareerApply(driver);
        ca.enterName(BaseClass.fakerPhoneNumber(10));
        ca.enterEmail(BaseClass.fakerName());
        ca.enterPhone(BaseClass.fakerEmail());
        ca.addResume(ca.invalidFormatData);
        ca.enterDescription("");
        ca.apply();
        BaseClass.waitUntil(driver,ca.mainErrorMsg);
        ca.validate("something went wrong! please try again later");
    }

}
