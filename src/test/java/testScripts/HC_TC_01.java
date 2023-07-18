package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseClass;
import pages.CareerApply;

import java.util.ArrayList;
import java.util.List;

public class HC_TC_01 extends BaseTest {

    @Test
    public void HC_TC_01(){
        CareerApply ca = new CareerApply(driver);
        List<Boolean> textBoxEnabled = new ArrayList<Boolean>();
        textBoxEnabled.add(ca.nameTextField.isEnabled());
        textBoxEnabled.add(ca.emailTextField.isEnabled());
        textBoxEnabled.add(ca.phoneTextField.isEnabled());
        textBoxEnabled.add(ca.resumeTextField.isEnabled());
        textBoxEnabled.add(ca.descriptionTextField.isEnabled());
        for (Boolean bool : textBoxEnabled){
            BaseClass.verifyTrue(bool);
        }
    }

}
