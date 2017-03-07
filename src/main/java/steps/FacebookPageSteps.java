package steps;

import pages.FacebookPage;

public class FacebookPageSteps {
    private FacebookPage facebookPage;

    public void openFacebookMainPage() {
        facebookPage = new FacebookPage();
        facebookPage.openFacebookMainPage();
    }
}
