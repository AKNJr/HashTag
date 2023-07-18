package testScripts;

import org.testng.annotations.Test;
import pages.BaseClass;
import pages.CareerApply;

public class HT_TC_05 extends BaseTest {
    @Test
    public void HT_TC_05(){
        CareerApply ca = new CareerApply(driver);
        ca.apply();
        BaseClass.waitUntil(driver,ca.mainErrorMsg);
        ca.validate("something went wrong! please try again later");
    }
}
