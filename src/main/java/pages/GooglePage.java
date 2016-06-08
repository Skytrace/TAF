package pages;

import pages.base.page.BasePage;

public class GooglePage extends BasePage {

    public void openGoogleMainPage() {
        web().get("http://google.com");
    }
}
