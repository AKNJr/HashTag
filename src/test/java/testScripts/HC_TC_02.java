package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseClass;
import pages.CareerApply;

public class HC_TC_02 extends BaseTest {
    @Test
    public void HC_TC_02(){
        CareerApply ca = new CareerApply(driver);
        BaseClass.verifyTrue(ca.applyNowButton.isEnabled());
    }
}
