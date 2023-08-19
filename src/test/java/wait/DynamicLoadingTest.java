package wait;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.OnePage;

import static org.testng.Assert.assertTrue;

public class DynamicLoadingTest extends BaseTest {
    @Test
    public void testDynamicLoading() {

        DynamicLoadingPage dynamicLoadingPage = homePage.dynamicLoadingClick();

      OnePage onePage = dynamicLoadingPage.clickOnElement1();

       onePage.startButtonClick();
       String actualResult = onePage.getText();
       String expectedResult = "Hello World!";
       assertTrue(actualResult.contains(expectedResult));

    }
}
