package upload;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.UploadPage;

public class FileUpload extends BaseTest {
    @Test
    public void fileUploadTest ()  {
        UploadPage uploadPage = homePage.uploadClick();
        uploadPage.insertFileLink("E:\\SWE\\Automation\\Level1\\Session one\\seesionone\\session\\download.jpg");
        uploadPage.setClickUploadButtonButton();



    }
}
