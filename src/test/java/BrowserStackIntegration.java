import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackIntegration {
        String userName = "YOUR_BROWSERSTACK_USERNAME";
        String accessKey = "YOUR_BROWSERSTACK_ACCESS_KEY";
        String url = "https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";

    public WebDriver browserSetup() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("browserVersion", "latest");
        caps.setCapability("os", "Windows");
        caps.setCapability("osVersion", "10");
        caps.setCapability("name", "Bstack-[Java] Sample Test");

        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL(url), caps);
            driver.get("https://devdealer.fur4.com/");
            System.out.println("Title is: " + driver.getTitle());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
    }


