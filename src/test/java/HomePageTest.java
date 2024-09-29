import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class HomePageTest  {

    WebDriver driver;
    WebDriverWait wait;


    @Test(priority = 1)
    public void chromeDriverSetup() {
        driver = new ChromeDriver();
        driver.get("https://devdealer.fur4.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    public boolean isHomepageVisible() {
        WebElement homeElement = driver.findElement(By.xpath("//a[text()=' FUR4 HOME']"));
        wait.until(ExpectedConditions.elementToBeClickable(homeElement));
        return homeElement.isDisplayed();
    }

    public boolean isRegisterPageOpen(){
        WebElement homePageBtn = driver.findElement(By.xpath("//button[contains(@class, 'group') and contains(@class, 'fixed') and contains(@class, 'right-4')]"));

        WebElement  singUpBtn = driver.findElement(By.xpath("//a[contains(@class, 'block') and contains(@class, 'bg-sky-700') and contains(@class, 'text-sky-200') and @href='/register']"));
        homePageBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(singUpBtn));
        return singUpBtn.isDisplayed();
    }

    @Test(priority = 2)
    public void homepageDisplayTest() {
        boolean isVisible = isHomepageVisible();
        assert isVisible : "Homepage is not visible";
    }

    @Test(priority = 3)
    public void signUpPageTest(){
        boolean isSignUpVisible = isRegisterPageOpen();
        assert  isSignUpVisible : "Register Page isn't visible";
    }


}



