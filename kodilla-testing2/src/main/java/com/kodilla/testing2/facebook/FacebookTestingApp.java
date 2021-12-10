package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String ACCEPT_COOKIES_BUTTON_X_PATH = "//*[@data-testid='cookie-policy-dialog-accept-button']";
    public static final String CREAT_NEW_ACCOUNT = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a";
    public static final String SELECT_NAME = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input";
    public static final String SELECT_SURNAME = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input";
    public static final String SELECT_PHONE_NUMBERS = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input";
    public static final String SELECT_PASSWORD = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input";
    public static final String SELECT_BIRTHDAY_DAY = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]";
    public static final String SELECT_BIRTHDAY_MONTH = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]";
    public static final String SELECT_BIRTHDAY_YEAR = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        assert driver != null;
        driver.get("https://www.facebook.com/");

        Thread.sleep(3000L);

        driver.manage().window().maximize();

        Thread.sleep(2000L);

        WebElement acceptCookies = driver.findElement(By.xpath(ACCEPT_COOKIES_BUTTON_X_PATH));
        acceptCookies.click();

        Thread.sleep(2000L);

        WebElement createNewAccount = driver.findElement(By.xpath(CREAT_NEW_ACCOUNT));
        createNewAccount.click();

        Thread.sleep(2000L);

        WebElement nameTextField = driver.findElement(By.xpath(SELECT_NAME));
        nameTextField.click();
        nameTextField.sendKeys("Dawid");

        Thread.sleep(2000L);

        WebElement surnameTextField = driver.findElement(By.xpath(SELECT_SURNAME));
        surnameTextField.sendKeys("Kocik");

        Thread.sleep(2000L);

        WebElement phoneNumberField = driver.findElement(By.xpath(SELECT_PHONE_NUMBERS));
        phoneNumberField.sendKeys("909090901");

        Thread.sleep(2000L);

        WebElement passTextField = driver.findElement(By.xpath(SELECT_PASSWORD));
        passTextField.sendKeys("MyPassword");

        Thread.sleep(2000L);

        WebElement selectComboDay = driver.findElement(By.xpath(SELECT_BIRTHDAY_DAY));
        Select selectBoardDay = new Select(selectComboDay);
        selectBoardDay.selectByIndex(17);

        Thread.sleep(1000L);

        WebElement selectComboMonth = driver.findElement(By.xpath(SELECT_BIRTHDAY_MONTH));
        Select selectBoardMonth = new Select(selectComboMonth);
        selectBoardMonth.selectByIndex(5);

        Thread.sleep(1000L);

        WebElement selectComboYear = driver.findElement(By.xpath(SELECT_BIRTHDAY_YEAR));
        Select selectBoardYear = new Select(selectComboYear);
        selectBoardYear.selectByIndex(2000);
    }
}
