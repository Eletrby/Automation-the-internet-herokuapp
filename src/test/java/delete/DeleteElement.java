package delete;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DeletePage;

public class DeleteElement extends BaseTest {
    @Test
    public void deleteElementTest () {
        DeletePage deletePage = homePage.deleteClick();
        deletePage.setDleteButtonClick();
        deletePage.setDeleteDisplay();
    }

}
