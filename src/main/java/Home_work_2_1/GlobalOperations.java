package Home_work_2_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by User1 on 04.06.2018.
 */
public class GlobalOperations {
    /**
     * @return WebDriver
     */
    public static WebDriver initChromDriver()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
        return new ChromeDriver();
    }

    /**
     *
     * @param ChromeDriver
     */
    public static void GetSite (WebDriver ChromeDriver)
    {
        ChromeDriver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
    }

    /**
     *
     * @param ChromeDriver
     */
    public static void Authorization(WebDriver ChromeDriver){
        // fill the "email" field
        WebElement login = ChromeDriver.findElement(By.name("email"));
        login.sendKeys("webinar.test@gmail.com");

        //fill the "Password" field
        login = ChromeDriver.findElement(By.name("passwd"));
        login.sendKeys("Xcg7299bnSmMuRLp9ITw");

        //click the "Enter" button
        login = ChromeDriver.findElement(By.className("ladda-label"));
        login.click();
    }

    /**
     *
     * @param ChromeDriver
     */
    public static void LogOut (WebDriver ChromeDriver){
        //find and click the profile picture
        WebElement logout = ChromeDriver.findElement(By.className("employee_avatar_small"));
        logout.click();

        //click the "Exit" button
        logout = ChromeDriver.findElement(By.id("header_logout"));
        logout.click();
    }
}
