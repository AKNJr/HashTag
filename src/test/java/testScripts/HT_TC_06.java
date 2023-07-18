package testScripts;

import org.testng.annotations.Test;
import pages.BaseClass;
import pages.CareerApply;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class HT_TC_06 extends BaseTest {
    @Test
    public void HT_TC_06(){
        CareerApply ca = new CareerApply(driver);
        int emptyTextBoxNo = BaseClass.randomNumber(0,5);
        if(emptyTextBoxNo==0){
            ca.enterEmail(BaseClass.fakerEmail());
            ca.enterPhone(BaseClass.fakerPhoneNumber(10));
            ca.addResume(ca.cvPath);
            ca.enterDescription(BaseClass.fakerDescription());
            ca.apply();
            BaseClass.waitUntil(driver,ca.mainErrorMsg);
            ca.validate("something went wrong! please try again later");

        }
       else if (emptyTextBoxNo==1){
            ca.enterName(BaseClass.fakerName());
            ca.enterPhone(BaseClass.fakerPhoneNumber(10));
            ca.addResume(ca.cvPath);
            ca.enterDescription(BaseClass.fakerDescription());
            ca.apply();
            BaseClass.waitUntil(driver,ca.mainErrorMsg);
            ca.validate("something went wrong! please try again later");

        }
       else if(emptyTextBoxNo==2) {
            ca.enterName(BaseClass.fakerName());
            ca.enterEmail(BaseClass.fakerEmail());
            ca.addResume(ca.cvPath);
            ca.enterDescription(BaseClass.fakerDescription());
            ca.apply();
            BaseClass.waitUntil(driver,ca.mainErrorMsg);
            ca.validate("something went wrong! please try again later");
        }
       else if(emptyTextBoxNo==3){
            ca.enterName(BaseClass.fakerName());
            ca.enterEmail(BaseClass.fakerEmail());
            ca.enterPhone(BaseClass.fakerPhoneNumber(10));
            ca.enterDescription(BaseClass.fakerDescription());
            ca.apply();
            BaseClass.waitUntil(driver,ca.mainErrorMsg);
            ca.validate("something went wrong! please try again later");

        }
        else if (emptyTextBoxNo==4){
            ca.enterName(BaseClass.fakerName());
            ca.enterEmail(BaseClass.fakerEmail());
            ca.enterPhone(BaseClass.fakerPhoneNumber(10));
            ca.addResume(ca.cvPath);
            ca.apply();
            BaseClass.waitUntil(driver,ca.mainErrorMsg);
            ca.validate("something went wrong! please try again later");

        }

    }
}
