import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class RegisterTest {
    private WebDriver driver;

    @Before
    public void openDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }


    @Test
    public void registerCreditendials() {

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

    @Test
    public void invalidRegisterEmail() {

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Roman");
        driver.findElement(By.id("middlename")).sendKeys("O");
        driver.findElement(By.id("lastname")).sendKeys("Vlad");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("vladhodisan@yahoo.commmmm");
        driver.findElement(By.cssSelector("#password")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span"));
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        WebElement invalidEmailText = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.account-create > ul > li > ul > li:nth-child(1) > span"));
        Assert.assertTrue(invalidEmailText.isDisplayed());

    }

    @Test
    public void MissingRegisterEmail() {

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Roman");
        driver.findElement(By.id("middlename")).sendKeys("O");
        driver.findElement(By.id("lastname")).sendKeys("Vlad");
        driver.findElement(By.cssSelector("#password")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span"));
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        WebElement missingEmailText = driver.findElement(By.id("advice-required-entry-email_address"));
        Assert.assertTrue(missingEmailText.isDisplayed());

    }

    @Test
    public void registerMissingName() {

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("middlename")).sendKeys("O");
        driver.findElement(By.id("lastname")).sendKeys("Vlad");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("vladhodisan@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span"));
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        WebElement invalidFieldText = driver.findElement(By.id("advice-required-entry-firstname"));
        Assert.assertEquals("This is a required field.", "This is a required field.");

    }


    @Test
    public void registerInvalidPassword() {

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Roman");
        driver.findElement(By.id("middlename")).sendKeys("O");
        driver.findElement(By.id("lastname")).sendKeys("Vlad");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("vladhodisan@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("123");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("123");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span"));
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        WebElement invalidFieldText = driver.findElement(By.id("advice-validate-password-password"));
        Assert.assertEquals("Please enter 6 or more characters without leading or trailing spaces.", "Please enter 6 or more characters without leading or trailing spaces.");

    }

    @Test
    public void registerPasswordMisshmatch() {

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Roman");
        driver.findElement(By.id("middlename")).sendKeys("O");
        driver.findElement(By.id("lastname")).sendKeys("Vlad");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("vladhodisan@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span"));
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        WebElement invalidFieldText = driver.findElement(By.id("advice-validate-cpassword-confirmation"));
        Assert.assertTrue(invalidFieldText.isDisplayed());

    }

    @After
   public void close(){
        driver.close();
    }

}