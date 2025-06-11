import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignUpTest {
    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("11111");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("Valerii");
        driver.findElement(By.name("last_name")).sendKeys("Ivanovich");
        driver.findElement(By.name("email")).sendKeys("olga133@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("12334");
        driver.findElement(By.name("password2")).sendKeys("12334");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String mess = driver.findElement(By.cssSelector("[class=confirmation_message]")).getText();
        Assert.assertEquals(mess, "Account is created!");
        driver.quit();
    }
}
