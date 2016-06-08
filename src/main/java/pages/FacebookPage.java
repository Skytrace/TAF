package pages;

import pages.base.page.BasePage;

public class FacebookPage extends BasePage {

    public void openFacebookMainPage() {
        web().get("http://facebook.com");
    }
}
