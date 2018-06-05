package Home_work_2_1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by User1 on 21.11.2017.
 */
public class Home_work_2_1 {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = GlobalOperations.initChromDriver();
        driver.manage().window().maximize();

        //The first part of home work
      /*  System.out.println("--------------------------------------------------------------");
        System.out.println("The first task of home work");

        Part1 test = new Part1();
        test.start(driver);

        System.out.println("--------------------------------------------------------------");*/
        System.out.println("The second task of home work");

        //The second part of home work
        Part2  test = new Part2();
        test.start(driver);

        Thread.sleep(5000);
        driver.quit();

    }

}
