package status;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.StatusCode200;
import pages.StatusCodePage;

import static org.testng.Assert.assertTrue;

public class StatusCode extends BaseTest {
@Test
    public void statusCodeTest(){
    StatusCodePage statusCodePage = homePage.statusCodeClick();
    StatusCode200 statusCode200 = statusCodePage.statusclickButton();
    String actualResult = statusCode200.getValditionMessageToStatusCode();
    String expectedResult = "This page returned a 200 status code.";
    assertTrue(actualResult.contains(expectedResult));


}
}
