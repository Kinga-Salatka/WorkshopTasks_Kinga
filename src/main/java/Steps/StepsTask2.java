package Steps;

import PagesTask1.HomePage1;
import PagesTask1.LogIn2;
import PagesTask2.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

public class StepsTask2 {

    WebDriver driver;

    @Given("The user is on MyStore")
    public void theUserIsLoggedInMyStore() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }

    @And("The user logs in")
    public void theUserLogsIn() {
        HomePage1 onHomePage1 = new HomePage1(driver);
        onHomePage1.signInClick();

        LogIn2 onLogin2 = new LogIn2(driver);
        onLogin2.logIntoAccount();
    }

    @And("Picks the sweater")
    public void picksTheSweatshirt() {
        SearchForSweatshirt1 onSearchForSweatshirt1 = new SearchForSweatshirt1(driver);
        onSearchForSweatshirt1.searchSweatshirt();

    }

    @And("Chooses size, amount, and adds it to the shopping cart")
    public void choosesSizeAmountAndAddsItToTheShoppingCart() throws InterruptedException {
        ChooseDetails2 onChooseDetails2 = new ChooseDetails2(driver);
        onChooseDetails2.chooseDetails();
    }

    @And("Proceeds to checkout")
    public void checkoutProceed() throws InterruptedException {
        ProceedToCheckout3 onProceedsToCheckout = new ProceedToCheckout3(driver);
        onProceedsToCheckout.checkoutProceed();
    }

    @And("Confirms the address")
    public void confirmsTheAddress() {
        ConfirmAddress4 onConfirmAddress4 = new ConfirmAddress4(driver);
        onConfirmAddress4.confirmAddress();
    }

    @And("Chooses the shipping, payment, and clicks Order with an obligation to pay")
    public void choosesTheShippingPaymentAndClicksOrderWithAnObligationToPay() {
        ConfirmOtherDetails5 onConfirmOtherDetails5 = new ConfirmOtherDetails5(driver);
        onConfirmOtherDetails5.confirmDetails();

    }

    @Then("Makes the screenshot of the order")
    public void screenshot() throws IOException, InterruptedException {
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String imageFileDir = "\\C:\\CodersLab_Kinga\\WorkshopTasks";
        FileHandler.copy(scrFile, new File(imageFileDir, "screenshot_task2" + ".jpeg"));
        Thread.sleep(3000);
        driver.quit();

    }
}
