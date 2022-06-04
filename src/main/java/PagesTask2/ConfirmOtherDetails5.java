package PagesTask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmOtherDetails5 {
    private WebDriver driver;

    public ConfirmOtherDetails5(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmDetails() {
        WebElement chooseDelivery = driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/div/div[1]/div[1]/div/span/span"));
        chooseDelivery.click();

        WebElement confirmDelivery = driver.findElement(By.name("confirmDeliveryOption"));
        confirmDelivery.click();

        WebElement choosePayment = driver.findElement(By.name("payment-option"));
        choosePayment.click();

        WebElement approveConditions = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        approveConditions.click();

        WebElement confirmOrder = driver.findElement(By.id("payment-confirmation"));
        confirmOrder.click();
    }
}
