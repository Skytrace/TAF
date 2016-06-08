package core;

import steps.FacebookPageSteps;
import steps.GooglePageSteps;
import steps.YahooPageSteps;
import steps.YandexPageSteps;

public class Initializer {
    protected FacebookPageSteps facebookPageSteps;
    protected GooglePageSteps googlePageSteps;
    protected YahooPageSteps yahooPageSteps;
    protected YandexPageSteps yandexPageSteps;

    public void storyStepsFactory() {
        facebookPageSteps = new FacebookPageSteps();
        googlePageSteps = new GooglePageSteps();
        yahooPageSteps = new YahooPageSteps();
        yandexPageSteps = new YandexPageSteps();
    }

}
