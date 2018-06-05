package Home_work_2_1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by User1 on 21.11.2017.
 */
public class Part1{

    public void start(WebDriver ChromeDriver) throws InterruptedException{
        GlobalOperations.GetSite(ChromeDriver);
        System.out.println("The site [http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/] was opened");
        GlobalOperations.Authorization(ChromeDriver);
        System.out.println("User was successfully logged in the system");
        Thread.sleep(3000);
        GlobalOperations.LogOut(ChromeDriver);
        System.out.println("User was successfully logged out the system");
        Thread.sleep(3000);
    }
}
