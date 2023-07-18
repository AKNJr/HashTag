package testScripts;

import org.testng.annotations.Test;
import pages.BaseClass;
import pages.CareerApply;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class HT_TC_03 extends BaseTest{
    @Test
    public void HT_TC_03() {
        CareerApply ca = new CareerApply(driver);
        ca.enterName(BaseClass.fakerName());
        ca.enterEmail(BaseClass.fakerEmail());
        ca.enterPhone(BaseClass.fakerPhoneNumber(10));
        ca.addResume(ca.cvPath);
        ca.enterDescription(BaseClass.fakerDescription());
        ca.apply();
        BaseClass.waitUntil(driver,ca.mainErrorMsg);
        ca.validate("something went wrong! please try again later");
    }


}
