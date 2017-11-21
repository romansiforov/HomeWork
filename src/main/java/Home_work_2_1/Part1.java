package Home_work_2_1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by User1 on 21.11.2017.
 */
public class Part1{

    public void start(WebDriver ChromeDriver) throws InterruptedException{
        this.GetSite(ChromeDriver);
        System.out.println("The site [http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/] was opened");
        this.Authorization(ChromeDriver);
        System.out.println("User was successfully logged in the system");
        Thread.sleep(3000);
        this.LogOut(ChromeDriver);
        System.out.println("User was successfully logged out the system");
        Thread.sleep(3000);
    }

    public void GetSite (WebDriver ChromeDriver)
    {
        ChromeDriver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
    }

    public void Authorization(WebDriver ChromeDriver){
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

    public void LogOut (WebDriver ChromeDriver){
        //find and click the profile picture
        WebElement logout = ChromeDriver.findElement(By.className("employee_avatar_small"));
        logout.click();

        //click the "Exit" button
        logout = ChromeDriver.findElement(By.id("header_logout"));
        logout.click();
    }
}
