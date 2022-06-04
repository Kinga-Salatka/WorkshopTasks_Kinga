package PagesTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FillInTheForm5 {
    private WebDriver driver;

    public FillInTheForm5(WebDriver driver) {
        this.driver = driver;
    }

    public void form(String alias, String address, String zip, String city, String country, String phone) {
        WebElement aliasForm = driver.findElement(By.name("alias"));
        aliasForm.sendKeys(alias);

        WebElement addressForm = driver.findElement(By.name("address1"));
        addressForm.sendKeys(address);

        WebElement zipForm = driver.findElement(By.name("postcode"));
        zipForm.sendKeys(zip);

        WebElement cityForm = driver.findElement(By.name("city"));
        cityForm.sendKeys(city);

        WebElement countryForm = driver.findElement(By.name("id_country"));
        countryForm.sendKeys(country);

        WebElement phoneForm = driver.findElement(By.name("phone"));
        phoneForm.sendKeys(phone);
    }
}
