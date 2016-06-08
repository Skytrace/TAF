package tests;

import core.Starter;
import org.testng.annotations.Test;

public class VerifyYandexPage extends Starter {

    @Test
    public void openGooglePage() {
        yandexPageSteps.openYandexMainPage();
    }
}