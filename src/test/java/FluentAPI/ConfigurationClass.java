package FluentAPI;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;

public class ConfigurationClass {
    public ConfigurationClass(){
        Configuration.assertionMode = AssertionMode.SOFT;
        Configuration.savePageSource = false;
        Configuration.screenshots = false;
        Configuration.startMaximized = true;
        Configuration.browser = "edge";
    }

    public WebDriver GetDriver(){
        return Selenide.webdriver().object();
    }
}
