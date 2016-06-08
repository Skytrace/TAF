package core;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.base.page.BasePage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Starter extends Initializer {
    private static final Logger LOGGER = Logger.getLogger(Starter.class.getName());
    protected ThreadLocal<Sut> sut = new ThreadLocal<Sut>();
    protected BasePage basePage;

    @BeforeClass
    public Sut getSut() {
        if (sut.get() == null) {
            Sut newSut = new Sut();
            sut.set(newSut);
            newSut.driverInitialization();
            basePageInitialization();
            storyStepsFactory();
            LOGGER.log(Level.INFO, "Sut was initialized");
        }
        return sut.get();
    }

    private void basePageInitialization() {
        basePage = new BasePage(sut.get().getWebDriver());
    }

    @AfterClass
    public void stopSut() {
        sut.get().stop();
        LOGGER.log(Level.INFO, "Sut was stopped");
    }
}
