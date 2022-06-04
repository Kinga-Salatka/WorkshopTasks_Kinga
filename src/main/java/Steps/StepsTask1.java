package Steps;

import PagesTask1.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsTask1 {

    WebDriver driver;

    @Given("The user is on MyStore page")
    public void theUserIsOnHomePage() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }

    @When("User click SignIn")
    public void userClickSignIn() {
        HomePage1 onHomePage1 = new HomePage1(driver);
        onHomePage1.signInClick();
    }

    @And("Logs into account")
    public void logsIntoAccount() {
        LogIn2 onLogin2 = new LogIn2(driver);
        onLogin2.logIntoAccount();
        
    }

    @And("Clicks on Addresses tab")
    public void clicksOnAddressesTab() {
        ClickAddresses3 onClickAddresses3 = new ClickAddresses3(driver);
        onClickAddresses3.clickAddresses();
        
    }

    @And("Clicks on Create new address")
    public void clicksOnCreateNewAddress() {
        ClickCreateNewAddress4 onClickCreateNewAddress4 = new ClickCreateNewAddress4(driver);
        onClickCreateNewAddress4.clickCreate();
        
    }
    @And("Fills in the form using {string}, {string}, {string}, {string}, {string} and {string}")
    public void fillsInTheFormUsingAnd(String aliasForm, String addressForm, String zipForm, String cityForm, String countryForm, String phoneForm) {
        FillInTheForm5 onFillInTheForm5 = new FillInTheForm5(driver);
        onFillInTheForm5.form(aliasForm, addressForm, zipForm, cityForm, countryForm, phoneForm);
    }

    @Then("Checks the data")
    public void checksTheData() throws InterruptedException {
        CheckData6 onCheckData6 = new CheckData6(driver);
         onCheckData6.checkData("ksala");
         Thread.sleep(3000);
         driver.quit();

    }

}
