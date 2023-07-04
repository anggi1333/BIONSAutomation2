import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class Run {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedrivergg.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriverService service = new ChromeDriverService.Builder()
                .withLogFile(new File("D://log.txt"))
                .build();
        WebDriver driver = new ChromeDriver(service, options);
        driver.get("https://appdev.bions.id/login");
        driver.manage().window().maximize();


        ExtentReports extent = new ExtentReports();


        ExtentTest loginTest = extent.createTest("Test Login", "Description of Test Scenario Login");
        ExtentTest stockBuyTest  = extent.createTest("Test Buy Stock", "Description of Test Buy Stock");
        ExtentTest stockSellTest  = extent.createTest("Test Sell Stock", "Description of Test Sell Stock");
        ExtentTest stockBuyObTest  = extent.createTest("Test Buy Stock OrderBooking", "Description of Test Buy Stock OrderBooking");
        ExtentTest stockSellObTest  = extent.createTest("Test Sell Stock OrderBooking", "Description of Test Sell Stock OrderBooking");
        ExtentTest stockWDTest  = extent.createTest("Test Withdrawl Stock", "Description of Test Withdrawl Stock");
        ExtentTest stockAmend = extent.createTest("Test Amend","Desription of Test Amend Stock");
        ExtentTest BookingByPriceTest = extent.createTest("Test Booking By PriceTest","Desription Auto Booking By Price");
        ExtentTest BookingByGainLoss = extent.createTest("Test Booking By GainLoss","Desription Auto Booking By Gain Loss");
        ExtentTest BookingByTime = extent.createTest("Test Booking By Time","Desription Auto Booking By Time");

        Login.testScenariologin(driver, loginTest,"DEV","anggi666","d","d12345");  //input username , password, pin untuk login

        StockBuy.Buy(driver,stockBuyTest,"TN","BBRI","5650","1111111111");//input order buy (stock name, stock price, stock lot buy)
        StockBuy.Buy(driver,stockBuyTest,"RG","BBRI","5650","1");//input order buy (stock name, stock price, stock lot buy)

        StockSell.Sell(driver, stockSellTest, "BBRI", "5650", "1"); //input order Sell (stock name, stock price, stock lot buy)
        StockSell.Sell(driver, stockSellTest, "BBRI", "5651", "1"); //input order Sell (stock name, stock price, stock lot buy)

        StockWithdrawl.wd(driver,stockWDTest,"ABBA","87","1");
        StockWithdrawl.wd(driver,stockWDTest,"ABBA","87","1");

        StockAmend.am(driver,stockAmend,"ABBA","87","1","89","1");
        StockAmend.am(driver,stockAmend,"ABBA","87","1","89","1");

        AutoBookingByPrice.testbyprice(driver,BookingByPriceTest,"ASDM","LAST","SD","5800","SELL","5500","1");
        AutoBookingByPrice.testbyprice(driver,BookingByPriceTest,"ACST","BID","KS","5800","BUY","5500","2");

        AutoBookingByGainLoss.testgl(driver,BookingByGainLoss,"ASDM","LOSS","LS","1","SELL","5500","1");
        AutoBookingByGainLoss.testgl(driver,BookingByGainLoss,"BBRI","GAIN","KS","1","BUY","5500","2");

        StockBuyOB.BuyOb(driver,stockBuyObTest,"ASDM","5600","3");

        StockSellOB.SellOb(driver,stockSellObTest,"ASDM","5800","3");

        AutoBookingByTime.testbt(driver,BookingByTime,"ASDM","CUSTOM","10","ENTRY","SELL");
        AutoBookingByTime.testbt(driver,BookingByTime,"BBNI","CUSTOM","11","BEST","BUY");

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("D://result//dd//Report Test Automate222.html");

        extent.attachReporter(sparkReporter);
        extent.flush();
        driver.quit();
    }
}