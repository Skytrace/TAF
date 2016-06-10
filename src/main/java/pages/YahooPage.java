package pages;

import org.openqa.selenium.By;
import pages.base.page.BasePage;

public class YahooPage extends BasePage {

    public void openYahooMainPage() {
        web().get("http://yahoo.com");
    }

    public void clickBySpecificElement() {
        web().findElement(By.id("test")).click();
    }
}
