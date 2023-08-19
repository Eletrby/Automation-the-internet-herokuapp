package login ;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ScureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    String validUserName = "tomsmith";
    String inValidUserName = "tomsmith1";
    String validPassword = "SuperSecretPassword!";
    String inValidPassword = "SuperSecretPassword!!";


    @Test (priority = 1)
    public void testSuccessfullLogin () {

        LoginPage loginpage = homePage.formAuthanticationClick();
        loginpage.insertUserName(validUserName);
        loginpage.insertPassword(validPassword);
        ScureAreaPage scureAreaPage =  loginpage.LoginButtonClick();
        String actualResult = scureAreaPage.getValidationMessageToLogin();
        String expectedResult ="You logged into a secure area!";
        assertTrue(actualResult.contains(expectedResult));


    }

    //testCase2
    @Test (priority = 2)
    public void invalidUserName(){

        LoginPage loginpage = homePage.formAuthanticationClick();
        loginpage.insertUserName(inValidUserName);
        loginpage.insertPassword(validPassword);
        ScureAreaPage scureAreaPage =  loginpage.LoginButtonClick();
        String actualResult = scureAreaPage.getValidationMessageToLogin();
        String expectedResult ="Your username is invalid!";
        assertTrue(actualResult.contains(expectedResult));

    }
    //testCase3
    @Test (priority = 3)
    public void password(){

        LoginPage loginpage = homePage.formAuthanticationClick();
        loginpage.insertUserName(validUserName);
        loginpage.insertPassword(inValidPassword);
        ScureAreaPage scureAreaPage =  loginpage.LoginButtonClick();
        String actualResult = scureAreaPage.getValidationMessageToLogin();
        String expectedResult ="Your password is invalid!";
        assertTrue(actualResult.contains(expectedResult));
    }


}

