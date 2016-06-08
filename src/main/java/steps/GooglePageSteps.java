package steps;

import pages.GooglePage;

public class GooglePageSteps {
    private GooglePage googlePage;

    public void checkGoogleMainPage() {
        googlePage = new GooglePage();
        googlePage.openGoogleMainPage();
    }
}