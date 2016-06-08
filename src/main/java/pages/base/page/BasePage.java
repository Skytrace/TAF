package pages.base.page;

import core.Utils;
import org.openqa.selenium.WebDriver;

public class BasePage {
    private static ThreadLocal<WebDriver> web = new ThreadLocal<WebDriver>();
    public static Utils utils = new Utils();

    public WebDriver web() {
        return web.get();
    }

    public BasePage() {}

    public BasePage(WebDriver web) {
        this.web.set(web);
    }

    public void waiter(int seconds) {
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
