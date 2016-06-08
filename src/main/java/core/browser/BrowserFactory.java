package core.browser;

public class BrowserFactory {

    public Browser getBrowser(WebBrowser webBrowser) {
        Browser browser;
        switch (webBrowser) {
            case FIREFOX: {
                browser = new Firefox();
                break;
            }
            case REMOTE_FIREFOX: {
                browser = new RemoteFirefox();
                break;
            }
            default: {
                browser = null;
            }
        }
        return browser;
    }
}
