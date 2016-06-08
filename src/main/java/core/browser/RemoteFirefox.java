package core.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class RemoteFirefox implements Browser {

    public WebDriver detectBrowserType() {
        WebDriver webDriver = null;
        DesiredCapabilities dc = new DesiredCapabilities();
        FirefoxProfile fp = new FirefoxProfile();
        dc.setCapability(FirefoxDriver.PROFILE, fp);
        dc.setBrowserName(DesiredCapabilities.firefox().getBrowserName());
        try {
            webDriver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), dc);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return webDriver;
    }

}
