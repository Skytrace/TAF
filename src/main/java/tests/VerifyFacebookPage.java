package tests;

import core.Starter;
import org.testng.annotations.Test;

public class VerifyFacebookPage extends Starter {

    @Test
    public void openFacebookPage() {
        facebookPageSteps.openFacebookMainPage();
        getSut().callSynhronizedMethod();
    }

}
