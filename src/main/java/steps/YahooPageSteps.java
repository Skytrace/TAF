package steps;

import pages.YahooPage;

public class YahooPageSteps {
    private YahooPage yahooPage;

    public void checkYahooMainPage() {
        yahooPage = new YahooPage();
        yahooPage.openYahooMainPage();
        yahooPage.clickBySpecificElement();
    }
}
