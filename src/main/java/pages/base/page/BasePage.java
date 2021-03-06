package pages.base.page;

import org.openqa.selenium.WebDriver;

public class BasePage {
    private static ThreadLocal<WebDriver> web = new ThreadLocal<WebDriver>();

    public BasePage() {}

    public BasePage(WebDriver web) {
        this.web.set(web);
    }

    public WebDriver web() {
        return web.get();
    }
}
