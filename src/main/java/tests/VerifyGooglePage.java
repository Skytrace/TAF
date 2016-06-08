package tests;

import core.Starter;
import org.testng.annotations.Test;

public class VerifyGooglePage extends Starter {

    @Test
    public void openGooglePage() {
        googlePageSteps.checkGoogleMainPage();
    }

    @Test
    public void openGooglePageAgain() {
        googlePageSteps.checkGoogleMainPage();
    }
}
