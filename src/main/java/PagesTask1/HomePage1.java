package PagesTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage1 {
    private WebDriver driver;

    public HomePage1(WebDriver driver) {
        this.driver = driver;
    }

    public void signInClick() {
        WebElement SignIn = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span"));
        SignIn.click();
    }
}
