package PagesTask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseDetails2 {
    private WebDriver driver;

    public ChooseDetails2(WebDriver driver) {
        this.driver = driver;
    }
    public void chooseDetails() throws InterruptedException {
        WebElement chooseSize = driver.findElement(By.name("group[1]"));
        chooseSize.sendKeys("M");

        WebElement chooseQuantity = driver.findElement(By.id("quantity_wanted"));
        Thread.sleep(500);
        chooseQuantity.clear();
        chooseQuantity.sendKeys("5");

        Thread.sleep(500);
        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
        addToCart.click();
        Thread.sleep(500);

    }
}
