package PagesTask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmAddress4 {
    private WebDriver driver;

    public ConfirmAddress4(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmAddress() {
        WebElement confirmA = driver.findElement(By.name("confirm-addresses"));
        confirmA.click();
    }
}