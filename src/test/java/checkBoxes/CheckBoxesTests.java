package checkBoxes;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

public class CheckBoxesTests extends BaseTest {

    @Test
    public void checkBox() {
        CheckBoxPage checkBoxPage = homePage.checkBoxClick();
        checkBoxPage.setCheckBoxClick();

    }


}
