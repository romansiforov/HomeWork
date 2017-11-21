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

        WebDriver ChromeDriver = new ChromeDriver();
        ChromeDriver.manage().window().maximize();

        //The first part of home work
        System.out.println("--------------------------------------------------------------");
        System.out.println("The first task of home work");

        Part1 test = new Part1();
        test.start(ChromeDriver);

        System.out.println("--------------------------------------------------------------");
        System.out.println("The second task of home work");

        //The second part of home work
        test = new Part2();
        test.start(ChromeDriver);

        Thread.sleep(5000);
        ChromeDriver.quit();

    }

}
