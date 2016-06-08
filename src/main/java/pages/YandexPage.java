package pages;

import pages.base.page.BasePage;

public class YandexPage extends BasePage {

    public void openYandexMainPage() {
        web().get("http://yandex.ru");
    }

}
