import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class RegisterTest {

    public void validRegisterTest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");

    }

    public void registerCreditendials() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Roman");
        driver.findElement(By.id("middlename")).sendKeys("O");
        driver.findElement(By.id("lastname")).sendKeys("Vlad");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("vladhodisan@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span"));
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();



    }


}