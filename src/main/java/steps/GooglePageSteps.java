package steps;

import pages.GooglePage;

public class GooglePageSteps {
    private GooglePage googlePage = new GooglePage();

    public void checkGoogleMainPage() {
        googlePage.openGoogleMainPage();
    }
}