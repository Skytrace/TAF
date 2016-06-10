package core;

import core.browser.BrowserFactory;
import core.browser.WebBrowser;
import org.openqa.selenium.WebDriver;

public class Sut {
    private WebDriver webDriver;

    public void driverInitialization() {
        webDriver = new BrowserFactory()
            .getBrowser(WebBrowser.REMOTE_FIREFOX)
            .detectBrowserType();
    }

    public WebDriver getWebDriver() {
        if (webDriver == null) {
            driverInitialization();
        }
        return webDriver;
    }

    public void stop() {
        getWebDriver().quit();
    }
}
