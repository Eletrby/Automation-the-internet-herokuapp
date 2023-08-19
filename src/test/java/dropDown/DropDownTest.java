package dropDown;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropDownTest extends BaseTest {

    @Test
    public void testDropList() throws InterruptedException {
        DropDownPage dropDownPage = homePage.dropDownClick();
        dropDownPage.setSelectOption("Option 2");


    }


}
