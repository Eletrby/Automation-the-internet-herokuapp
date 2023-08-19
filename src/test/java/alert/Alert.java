package alert;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AlertPage;

import static org.testng.Assert.assertTrue;

public class Alert extends BaseTest {

@Test
    public void testJSAlert(){
    AlertPage alertPage = homePage.alertLink();
    alertPage.clickJavaAlertButton();
    alertPage.AccptAlert();
    String actualResult = alertPage.getValditionMessage();
    String expectedResult = "You successfully clicked an alert";
    assertTrue(actualResult.contains(expectedResult));

}
    @Test
    public void testJSConfirmation(){
        AlertPage alertPage = homePage.alertLink();
        alertPage.clickOnjSConfirmation();
        alertPage.dissmissAlert();
        String actualResult = alertPage.getValditionMessage();
        String expectedResult = "You clicked: Cancel";
        assertTrue(actualResult.contains(expectedResult));




}
//    @Test
//    public void testJSPromp(){
//        AlertPage alertPage = homePage.alertLink();
//        alertPage.clickOnjSConfirmation();
//        String text = "Hello";
//        alertPage.insertOnAlert(text);
//        alertPage.AccptAlert();
//        String actualResult = alertPage.getValditionMessage(text);
//        String expectedResult = text;
//        assertTrue(actualResult.contains(text));









}
