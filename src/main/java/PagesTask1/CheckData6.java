package PagesTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckData6 {
    private WebDriver driver;

    public CheckData6(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkData(String alias) {
        WebElement aliasCheck = driver.findElement(By.name("alias"));

    if (aliasCheck.getText() == alias){
            return true;
        } else {
        return false;
    }
    }
}
