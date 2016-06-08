package core;

import core.browser.BrowserFactory;
import core.browser.WebBrowser;
import org.openqa.selenium.WebDriver;

public class Sut {
    private WebDriver webDriver;

    public void driverInitialization() {
        webDriver = new BrowserFactory()
            .getBrowser(WebBrowser.FIREFOX)
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

    public synchronized void callSynhronizedMethod() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000L);
                System.out.println("Now i'm in synhronized method " + i + " from thread " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
