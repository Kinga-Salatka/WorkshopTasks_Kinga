package PagesTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickCreateNewAddress4 {
    private WebDriver driver;

    public ClickCreateNewAddress4(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCreate() {
        WebElement createNew = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/a/span"));
        createNew.click();
    }
}
