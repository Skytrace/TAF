package steps;

import pages.YandexPage;

public class YandexPageSteps {
    private YandexPage yandexPage;

    public void openYandexMainPage() {
        yandexPage = new YandexPage();
        yandexPage.openYandexMainPage();
    }
}
