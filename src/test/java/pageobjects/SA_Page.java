package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Locale;

public class SA_Page {

    public String get_LandingTypeValue (){

        return type_Value;
    }

    public String get_LandingPriceValue (){

        return price_Value;
    }

    public String get_LandingCurrencyValue (){

        return currency_Value;
    }

    public String get_SummaryTypeValue (){

        return summary_TypeValue;
    }

    public String get_SummaryPriceValue (){

        return summary_PriceValue;
    }

    public String get_SummaryCurrencyValue (){

        return summary_CurrencyValue;
    }
    WebDriver driver;
    public static String type_Value;
    public static String price_Value;
    public static String currency_Value;
    public static String summary_TypeValue;
    public static String summary_PriceValue;
    public static String summary_CurrencyValue;

    public SA_Page(WebDriver driver) {

        this.driver= driver;
    }

    public void getLite_landingSA () {

        WebElement country_Btn = driver.findElement(By.xpath("//div[@class='country-current']"));
        country_Btn.click();

        WebElement saudi_Btn = driver.findElement(By.xpath("//a[@id='sa']"));
        saudi_Btn.click();

        WebElement subscription_Type  = driver.findElement(By.xpath("//strong[@id='name-lite']"));
        this.type_Value = subscription_Type.getText();
        System.out.println("The subscription type for Saudi Arabia in the landing page is: " + type_Value);

        WebElement subscription_Price  = driver.findElement(By.xpath("//div[@id='currency-lite']"));
        this.price_Value = subscription_Price.getText().replace("SAR/month","");
        System.out.println("The subscription price for Saudi Arabia in the landing page is: " + price_Value);

        WebElement subscription_Currency   = driver.findElement(By.xpath("//div[@id='currency-lite']"));
        this.currency_Value =  subscription_Currency.getText().replace("/month","").replaceAll("\\d+","").trim();
        System.out.println("The subscription currency for Saudi Arabia in the landing page is: " + currency_Value);

        WebElement trial_Btn = driver.findElement(By.xpath("//a[@id='lite-selection']"));
        trial_Btn.click();
    }

    public void getLite_SummarySA () {

        WebElement summary_SubscriptionType  = driver.findElement(By.xpath("//span[@id='order-tier-name']"));
        this.summary_TypeValue = summary_SubscriptionType.getText().replace("Plan: ","").toUpperCase(Locale.ROOT);
        System.out.println("The subscription type for Saudi Arabia in the summary page is: " + summary_TypeValue);

        WebElement summary_SubscriptionPrice  = driver.findElement(By.xpath("//span[@id='order-tier-price']"));
        this.summary_PriceValue = summary_SubscriptionPrice.getText().replace("SAR/month","").replace(".00","");
        System.out.println("The subscription price for Saudi Arabia in the summary page is: " + summary_PriceValue);

        WebElement summary_SubscriptionCurrency   = driver.findElement(By.xpath("//span[@id='order-tier-price']"));
        this.summary_CurrencyValue = summary_SubscriptionCurrency.getText().replace("/month","").replaceAll("\\d+","").trim().replace(". ","");
        System.out.println("The subscription currency for Saudi Arabia in the summary page is: " + summary_CurrencyValue);
    }


    public void getClassic_landingSA () {

        WebElement country_Btn = driver.findElement(By.xpath("//div[@class='country-current']"));
        country_Btn.click();

        WebElement saudi_Btn = driver.findElement(By.xpath("//a[@id='sa']"));
        saudi_Btn.click();

        WebElement subscription_Type  = driver.findElement(By.xpath("//strong[@id='name-classic']"));
        this.type_Value = subscription_Type.getText();
        System.out.println("The subscription type for Saudi Arabia in the landing page is: " + type_Value);

        WebElement subscription_Price  = driver.findElement(By.xpath("//div[@id='currency-classic']"));
        this.price_Value = subscription_Price.getText().replace("SAR/month","");
        System.out.println("The subscription price for Saudi Arabia in the landing page is: " + price_Value);

        WebElement subscription_Currency   = driver.findElement(By.xpath("//div[@id='currency-classic']"));
        this.currency_Value =  subscription_Currency.getText().replace("/month","").replaceAll("\\d+","").trim();
        System.out.println("The subscription currency for Saudi Arabia in the landing page is: " + currency_Value);

        WebElement trial_Btn = driver.findElement(By.xpath("//a[@id='classic-selection']"));
        trial_Btn.click();
    }

    public void getClassic_SummarySA () {

        WebElement summary_SubscriptionType  = driver.findElement(By.xpath("//span[@id='order-tier-name']"));
        this.summary_TypeValue = summary_SubscriptionType.getText().replace("Plan: ","").toUpperCase(Locale.ROOT);
        System.out.println("The subscription type for Saudi Arabia in the summary page is: " + summary_TypeValue);

        WebElement summary_SubscriptionPrice  = driver.findElement(By.xpath("//span[@id='order-tier-price']"));
        this.summary_PriceValue = summary_SubscriptionPrice.getText().replace("SAR/month","").replace(".00","");
        System.out.println("The subscription price for Saudi Arabia in the summary page is: " + summary_PriceValue);

        WebElement summary_SubscriptionCurrency   = driver.findElement(By.xpath("//span[@id='order-tier-price']"));
        this.summary_CurrencyValue = summary_SubscriptionCurrency.getText().replace("/month","").replaceAll("\\d+","").trim().replace(". ","");
        System.out.println("The subscription currency for Saudi Arabia in the summary page is: " + summary_CurrencyValue);
    }


    public void getPremium_landingSA () {

        WebElement country_Btn = driver.findElement(By.xpath("//div[@class='country-current']"));
        country_Btn.click();

        WebElement saudi_Btn = driver.findElement(By.xpath("//a[@id='sa']"));
        saudi_Btn.click();

        WebElement subscription_Type  = driver.findElement(By.xpath("//strong[@id='name-premium']"));
        this.type_Value = subscription_Type.getText();
        System.out.println("The subscription type for Saudi Arabia in the landing page is: " + type_Value);

        WebElement subscription_Price  = driver.findElement(By.xpath("//div[@id='currency-premium']"));
        this.price_Value = subscription_Price.getText().replace("SAR/month","");
        System.out.println("The subscription price for Saudi Arabia in the landing page is: " + price_Value);

        WebElement subscription_Currency   = driver.findElement(By.xpath("//div[@id='currency-lite']"));
        this.currency_Value =  subscription_Currency.getText().replace("/month","").replaceAll("\\d+","").trim();
        System.out.println("The subscription currency for Saudi Arabia in the landing page is: " + currency_Value);

        WebElement trial_Btn = driver.findElement(By.xpath("//a[@id='premium-selection']"));
        trial_Btn.click();
    }

    public void getPremium_SummarySA () {

        WebElement summary_SubscriptionType  = driver.findElement(By.xpath("//span[@id='order-tier-name']"));
        this.summary_TypeValue = summary_SubscriptionType.getText().replace("Plan: ","").toUpperCase(Locale.ROOT);
        System.out.println("The subscription type for Saudi Arabia in the summary page is: " + summary_TypeValue);

        WebElement summary_SubscriptionPrice  = driver.findElement(By.xpath("//span[@id='order-tier-price']"));
        this.summary_PriceValue = summary_SubscriptionPrice.getText().replace("SAR/month","").replace(".00","");
        System.out.println("The subscription price for Saudi Arabia in the summary page is: " + summary_PriceValue);

        WebElement summary_SubscriptionCurrency   = driver.findElement(By.xpath("//span[@id='order-tier-price']"));
        this.summary_CurrencyValue = summary_SubscriptionCurrency.getText().replace("/month","").replaceAll("\\d+","").trim().replace(". ","");
        System.out.println("The subscription currency for Saudi Arabia in the summary page is: " + summary_CurrencyValue);
    }
}

