package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.Baharin_Page;
import pageobjects.Kuwait_Page;
import pageobjects.SA_Page;
import java.io.IOException;


public class Stepdefs {

    SA_Page saudi_Landing;
    Kuwait_Page kuwait_Landing;
    Baharin_Page baharin_Landing;
    public static WebDriver driver;

    public Stepdefs() throws IOException {
    }

    @Given("I have opened the correct subscribe website")
    public void i_have_opened_the_correct_subscribe_website() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://subscribe.stctv.com/sa-en");
        driver.manage().window().maximize();
        System.out.println("The title of the page is :" + driver.getTitle());
    }

    @When("Select the KSA country and Validate the Type, Price and Currency")
    public void selectTheKSACountryAndValidateTheTypePriceAndCurrency() {

        saudi_Landing = new SA_Page(driver);
        saudi_Landing.getLite_landingSA();
        saudi_Landing.getLite_SummarySA();
        Assert.assertEquals(saudi_Landing.get_LandingTypeValue(), saudi_Landing.get_SummaryTypeValue());
        Assert.assertEquals(saudi_Landing.get_LandingPriceValue(), saudi_Landing.get_SummaryPriceValue());
        Assert.assertEquals(saudi_Landing.get_LandingCurrencyValue(), saudi_Landing.get_SummaryCurrencyValue());
        driver.get("https://subscribe.stctv.com/sa-en");
        saudi_Landing.getClassic_landingSA();
        saudi_Landing.getClassic_SummarySA();
        Assert.assertEquals(saudi_Landing.get_LandingTypeValue(), saudi_Landing.get_SummaryTypeValue());
        Assert.assertEquals(saudi_Landing.get_LandingPriceValue(), saudi_Landing.get_SummaryPriceValue());
        Assert.assertEquals(saudi_Landing.get_LandingCurrencyValue(), saudi_Landing.get_SummaryCurrencyValue());
        driver.get("https://subscribe.stctv.com/sa-en");
        saudi_Landing.getPremium_landingSA();
        saudi_Landing.getPremium_SummarySA();
        Assert.assertEquals(saudi_Landing.get_LandingTypeValue(), saudi_Landing.get_SummaryTypeValue());
        Assert.assertEquals(saudi_Landing.get_LandingPriceValue(), saudi_Landing.get_SummaryPriceValue());
        Assert.assertEquals(saudi_Landing.get_LandingCurrencyValue(), saudi_Landing.get_SummaryCurrencyValue());
        driver.get("https://subscribe.stctv.com/sa-en");
    }

    @And("Select the Bahrain country and Validate the Type, Price and Currency")
    public void selectTheBahrainCountryAndValidateTheTypePriceAndCurrency() {

        baharin_Landing = new Baharin_Page(driver);
        baharin_Landing.getLite_landingSBaharin();
        baharin_Landing.getLite_SummaryBaharin();
        Assert.assertEquals(baharin_Landing.get_LandingTypeValue(), baharin_Landing.get_SummaryTypeValue());
        Assert.assertEquals(baharin_Landing.get_LandingPriceValue(), baharin_Landing.get_SummaryPriceValue());
        Assert.assertEquals(baharin_Landing.get_LandingCurrencyValue(), baharin_Landing.get_SummaryCurrencyValue());
        driver.get("https://subscribe.stctv.com/sa-en");
        baharin_Landing.getClassic_landingSBaharin();
        baharin_Landing.getClassic_SummaryBaharin();
        Assert.assertEquals(baharin_Landing.get_LandingTypeValue(), baharin_Landing.get_SummaryTypeValue());
        Assert.assertEquals(baharin_Landing.get_LandingPriceValue(), baharin_Landing.get_SummaryPriceValue());
        Assert.assertEquals(baharin_Landing.get_LandingCurrencyValue(), baharin_Landing.get_SummaryCurrencyValue());
        driver.get("https://subscribe.stctv.com/sa-en");
        baharin_Landing.getPremium_landingBaharin();
        baharin_Landing.getPremium_SummaryBaharin();
        Assert.assertEquals(baharin_Landing.get_LandingTypeValue(), baharin_Landing.get_SummaryTypeValue());
        Assert.assertEquals(baharin_Landing.get_LandingPriceValue(), baharin_Landing.get_SummaryPriceValue());
        Assert.assertEquals(baharin_Landing.get_LandingCurrencyValue(), baharin_Landing.get_SummaryCurrencyValue());
        driver.get("https://subscribe.stctv.com/sa-en");
    }

    @And("Select the Kuwait country and Validate the Type, Price and Currency")
    public void selectTheKuwaitCountryAndValidateTheTypePriceAndCurrency() {

        kuwait_Landing = new Kuwait_Page(driver);
        kuwait_Landing.getLite_landingKuwait();
        kuwait_Landing.getLite_SummaryKuwait();
        Assert.assertEquals(kuwait_Landing.get_LandingTypeValue(), kuwait_Landing.get_SummaryTypeValue());
        Assert.assertEquals(kuwait_Landing.get_LandingPriceValue(), kuwait_Landing.get_SummaryPriceValue());
        Assert.assertEquals(kuwait_Landing.get_LandingCurrencyValue(), kuwait_Landing.get_SummaryCurrencyValue());
        driver.get("https://subscribe.stctv.com/sa-en");
        kuwait_Landing.getClassic_landingKuwait();
        kuwait_Landing.getClassic_SummaryKuwait();
        Assert.assertEquals(kuwait_Landing.get_LandingTypeValue(), kuwait_Landing.get_SummaryTypeValue());
        Assert.assertEquals(kuwait_Landing.get_LandingPriceValue(), kuwait_Landing.get_SummaryPriceValue());
        Assert.assertEquals(kuwait_Landing.get_LandingCurrencyValue(), kuwait_Landing.get_SummaryCurrencyValue());
        driver.get("https://subscribe.stctv.com/sa-en");
        kuwait_Landing.getPremium_landingKuwait();
        kuwait_Landing.getPremium_SummaryKuwait();
        Assert.assertEquals(kuwait_Landing.get_LandingTypeValue(), kuwait_Landing.get_SummaryTypeValue());
        Assert.assertEquals(kuwait_Landing.get_LandingPriceValue(), kuwait_Landing.get_SummaryPriceValue());
        Assert.assertEquals(kuwait_Landing.get_LandingCurrencyValue(), kuwait_Landing.get_SummaryCurrencyValue());
    }

    @Then("they should be matched")
    public void theyShouldBeMatched() {

        System.out.println("All Test Cases are Passed Successfully");
        driver.close();
    }
}
