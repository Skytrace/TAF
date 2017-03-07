package steps;

import pages.YahooPage;

public class YahooPageSteps {
    private YahooPage yahooPage = new YahooPage();

    public void checkYahooMainPage() {
        yahooPage.openYahooMainPage();
        yahooPage.clickBySpecificElement();
    }
}
