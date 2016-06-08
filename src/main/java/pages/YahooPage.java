package pages;

import pages.base.page.BasePage;

public class YahooPage extends BasePage {

    public void openYahooMainPage() {
        web().get("http://yahoo.com");
    }
}
