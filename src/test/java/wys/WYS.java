package wys;

import base.BaseTest;
import pages.WYSIWYGEditorPage;

public class WYS extends BaseTest {

    public void testFrame()

    {
        String text = "hello";

        WYSIWYGEditorPage wysiwygEditorPage = homePage.WYSIWYGEditorPageClickOn();
        wysiwygEditorPage.clearText();
        wysiwygEditorPage.insertText(text);







}}
