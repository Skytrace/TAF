package tests;

import core.Starter;
import org.testng.annotations.Test;

public class VerifyYahooPage extends Starter {

    @Test
    public void openYahooPage() {
        yahooPageSteps.checkYahooMainPage();
    }
}