package config;

public class WebDriverConfig {

    public String getBaseURL(){
        return "https://github.com";
    }

    public Browser getBrowser(){
        return Browser.CHROME;
    }

}
