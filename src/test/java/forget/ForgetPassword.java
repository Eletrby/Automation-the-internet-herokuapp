package forget;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgetPage;
import pages.ForgetPage2;

import static org.testng.Assert.assertTrue;

public class ForgetPassword extends BaseTest {

    @Test
    public void forgetPsswordTest () {
        ForgetPage forgetPage = homePage.forgetClick();
        forgetPage.emailName("mahmoud@gmail.com");
        ForgetPage2 forgetPage2 =  forgetPage.clickButton();
        String actualResult = forgetPage2.getValditionMessageToForget();
        String expectedResult = "Internal Server Error";
        assertTrue(actualResult.contains(expectedResult));

    }
}
