package PagesTask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchForSweatshirt1 {
    private WebDriver driver;

    public SearchForSweatshirt1(WebDriver driver) {
        this.driver = driver;
    }
    public void searchSweatshirt() {
        WebElement search = driver.findElement(By.name("s"));
        search.sendKeys("Hummingbird Printed Sweater");

        WebElement clickMG = driver.findElement(By.xpath("//*[@id=\"search_widget\"]/form/button/i"));
        clickMG.click();

       WebElement chooseSweater = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/a/img"));
       chooseSweater.click();
    }
}
