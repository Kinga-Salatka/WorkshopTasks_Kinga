package PagesTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickAddresses3 {
    private WebDriver driver;

    public ClickAddresses3(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddresses() {
        WebElement addresses = driver.findElement(By.xpath("//*[@id=\"footer_account_list\"]/li[4]/a"));
        addresses.click();
    }
}
