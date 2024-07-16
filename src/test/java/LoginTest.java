import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D:\\sspto\\Downloads1\\Softwares\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulnxttrendz.ccbp.tech/login");

        WebElement usernameEl=driver.findElement(By.id("username"));
        usernameEl.sendKeys("rahul");

        WebElement passwordEl=driver.findElement(By.id("password"));
        passwordEl.sendKeys("rahul@2021");

        WebElement loginEl=driver.findElement(By.className("login-button"));
        loginEl.submit();

        String expectedUrl="https://rahulnxttrendz.ccbp.tech/";

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));

        String currentUrl=driver.getCurrentUrl();

        if (expectedUrl.equals(currentUrl)){
            System.out.println("Login Success");
        }else{
            System.out.println("Login Failed");
        }

        driver.quit();
    }
}
