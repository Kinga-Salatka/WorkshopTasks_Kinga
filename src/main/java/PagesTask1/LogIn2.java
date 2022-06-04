package PagesTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn2 {
    WebDriver driver;
    public LogIn2(WebDriver driver) {
        this.driver = driver; }
    public void logIntoAccount() {
        WebElement writeAddress = driver.findElement(By.name("email"));
        writeAddress.sendKeys("kara@lap.com");

        WebElement writePasswd = driver.findElement(By.name("password"));
        writePasswd.sendKeys("Lapa123");

        WebElement clickSignIn = driver.findElement(By.id("submit-login"));
        clickSignIn.click();

    }
}
