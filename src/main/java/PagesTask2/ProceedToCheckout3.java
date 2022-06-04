package PagesTask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProceedToCheckout3 {
    private WebDriver driver;

    public ProceedToCheckout3(WebDriver driver) {
        this.driver = driver;
    }
    public void checkoutProceed() throws InterruptedException {

        Thread.sleep(500);
        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a"));
        checkout.click();

        WebElement checkout2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a"));
        checkout2.click();
    }
}