package core.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements Browser {

    public WebDriver detectBrowserType() {
        return new FirefoxDriver();
    }

}
