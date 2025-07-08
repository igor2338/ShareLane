import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class DiscountTest {

    @Test
    public void test1() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=111111&first_name=Test&last_name=Test&email=test%40test.com&password1=Test&password2=Test");
        String email = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=2");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("20");
        driver.findElement(By.cssSelector("[value=Update")).click();
        String discount1 = driver.findElement(By.xpath
                ("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        softAssert.assertEquals(discount1, "2");
        String discount2 = driver.findElement(By.xpath
                ("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        softAssert.assertEquals(discount2, "4.0");
        String total = driver.findElement(By.xpath
                ("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        softAssert.assertEquals(total, "196.00");
        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void test2() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=111111&first_name=Test&last_name=Test&email=test%40test.com&password1=Test&password2=Test");
        String email = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=2");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("50");
        driver.findElement(By.cssSelector("[value=Update")).click();
        String discount1 = driver.findElement(By.xpath
                ("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        softAssert.assertEquals(discount1, "3");
        String discount2 = driver.findElement(By.xpath
                ("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        softAssert.assertEquals(discount2, "15.0");
        String total = driver.findElement(By.xpath
                ("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        softAssert.assertEquals(total, "485.00");
        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void test3() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=111111&first_name=Test&last_name=Test&email=test%40test.com&password1=Test&password2=Test");
        String email = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=2");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("100");
        driver.findElement(By.cssSelector("[value=Update")).click();
        String discount1 = driver.findElement(By.xpath
                ("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        softAssert.assertEquals(discount1, "4");
        String discount2 = driver.findElement(By.xpath
                ("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        softAssert.assertEquals(discount2, "40.0");
        String total = driver.findElement(By.xpath
                ("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        softAssert.assertEquals(total, "960.00");
        driver.quit();
        softAssert.assertAll();
    }
}
