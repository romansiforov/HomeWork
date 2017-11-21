package Home_work_2_1;

import org.openqa.selenium.*;
/**
 * Created by User1 on 21.11.2017.
 */
public class Part2 extends Part1 {
    public void start (WebDriver ChromeDriver)throws InterruptedException{
        this.GetSite(ChromeDriver);
        System.out.println("The site [http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/] was opened");
        this.Authorization(ChromeDriver);
        System.out.println("User was successfully logged in the system");
        Thread.sleep(3000);
        this.Sections(ChromeDriver);
        System.out.println("The Browser will be closed in several seconds");
        this.LogOut(ChromeDriver);
    }
    private void Sections (WebDriver ChromeDriver) throws InterruptedException{
        // Click the "Заказы" button
        WebElement orders = ChromeDriver.findElement(By.id("subtab-AdminParentOrders"));
        orders.click();
        System.out.println("User is placed in the "+ChromeDriver.getTitle()+" page");
        ChromeDriver.navigate().refresh();
        Thread.sleep(2000);

        // Click the "Заказы" button
        orders = ChromeDriver.findElement(By.id("subtab-AdminCatalog"));
        orders.click();
        Thread.sleep(2000);
        System.out.println("User is placed in the "+ChromeDriver.getTitle()+" page");
        ChromeDriver.navigate().refresh();
        Thread.sleep(2000);

        // Click the "Клиенты" button
        orders = ChromeDriver.findElement(By.linkText("Клиенты"));
        orders.click();
        Thread.sleep(2000);
        System.out.println("User is placed in the "+ChromeDriver.getTitle()+" page");
        ChromeDriver.navigate().refresh();
        Thread.sleep(2000);

        // Click the "Служба поддержки" button
        orders = ChromeDriver.findElement(By.id("subtab-AdminParentCustomerThreads"));
        orders.click();
        Thread.sleep(2000);
        System.out.println("User is placed in the "+ChromeDriver.getTitle()+" page");
        ChromeDriver.navigate().refresh();
        Thread.sleep(2000);

        // Click the "Статистика" button
        orders = ChromeDriver.findElement(By.linkText("Статистика"));
        orders.click();
        Thread.sleep(2000);
        System.out.println("User is placed in the "+ChromeDriver.getTitle()+" page");
        ChromeDriver.navigate().refresh();
        Thread.sleep(2000);

        // Click the "Modules" button
        orders = ChromeDriver.findElement(By.id("subtab-AdminParentModulesSf"));
        orders.click();
        Thread.sleep(2000);
        System.out.println("User is placed in the "+ChromeDriver.getTitle()+" page");
        ChromeDriver.navigate().refresh();
        Thread.sleep(2000);

        // Click the "Design" button
        orders = ChromeDriver.findElement(By.linkText("Design"));
        orders.click();
        Thread.sleep(2000);
        System.out.println("User is placed in the "+ChromeDriver.getTitle()+" page");
        ChromeDriver.navigate().refresh();
        Thread.sleep(2000);

        // Click the "Доставка" button
        orders = ChromeDriver.findElement(By.id("subtab-AdminParentShipping"));
        orders.click();
        Thread.sleep(2000);
        System.out.println("User is placed in the "+ChromeDriver.getTitle()+" page");
        ChromeDriver.navigate().refresh();
        Thread.sleep(2000);

        // Click the "Способ оплаты" button
        orders = ChromeDriver.findElement(By.id("subtab-AdminParentPayment"));
        orders.click();
        Thread.sleep(2000);
        System.out.println("User is placed in the "+ChromeDriver.getTitle()+" page");
        ChromeDriver.navigate().refresh();
        Thread.sleep(2000);

        // Click the "International" button
        orders = ChromeDriver.findElement(By.id("subtab-AdminInternational"));
        orders.click();
        Thread.sleep(2000);
        System.out.println("User is placed in the "+ChromeDriver.getTitle()+" page");
        ChromeDriver.navigate().refresh();
        Thread.sleep(2000);

        // Click the "Shop Parameters" button
        orders = ChromeDriver.findElement(By.id("subtab-ShopParameters"));
        orders.click();
        Thread.sleep(2000);
        System.out.println("User is placed in the "+ChromeDriver.getTitle()+" page");
        ChromeDriver.navigate().refresh();
        Thread.sleep(2000);

        // Click the "Конфигурация" button
        orders = ChromeDriver.findElement(By.id("subtab-AdminAdvancedParameters"));
        orders.click();
        Thread.sleep(2000);
        System.out.println("User is placed in the "+ChromeDriver.getTitle()+" page");
        ChromeDriver.navigate().refresh();
        Thread.sleep(2000);

    }
}
