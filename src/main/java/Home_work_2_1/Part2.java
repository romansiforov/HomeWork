package Home_work_2_1;

import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User1 on 21.11.2017.
 */
public class Part2 extends Part1 {
    public void start (WebDriver ChromeDriver)throws InterruptedException{
        GlobalOperations.GetSite(ChromeDriver);
        System.out.println("The site [http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/] was opened");
        GlobalOperations.Authorization(ChromeDriver);
        System.out.println("User was successfully logged in the system");
        Thread.sleep(3000);
        this.Sections(ChromeDriver);
        System.out.println("The Browser will be closed in several seconds");
        GlobalOperations.LogOut(ChromeDriver);
    }

    public void Sections (WebDriver ChromeDriver) throws InterruptedException {

        List<WebElement> list = ChromeDriver.findElements(By.className("maintab"));
        List<String> menusById = new ArrayList<String>();
        for (WebElement current_item : list) {

            menusById.add(current_item.getText());
        }

        for (String current_item : menusById) {
            WebElement element = ChromeDriver.findElement(By.linkText(current_item));
            element.click();
            Thread.sleep(3000);
            String title = ChromeDriver.getTitle();
            System.out.println("Current page is: " + title);
            ChromeDriver.navigate().refresh();
            String titleAfterRefresh = ChromeDriver.getTitle();
            boolean currentPageTitleWasChangedAfterRefresh = title.equals(titleAfterRefresh);
            if (!currentPageTitleWasChangedAfterRefresh) {
                System.out.println("Current page was changed. Previously WebDriver was on page '" + title +
                        "', but now current page is " + titleAfterRefresh);
                break;
            }

        }
    }
}
