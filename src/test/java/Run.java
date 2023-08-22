import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Run {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "D:\\MicrosoftWebDriver.exe");

        EdgeOptions options = new EdgeOptions();
        RemoteWebDriver driver = new EdgeDriver(options);


        driver.get("https://appdev.bions.id/");
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
        ExtentTest BookingByTrailingStop = extent.createTest("Test Booking By Trailing Stop","Desription Auto Booking By Trailing Stop");
        ExtentTest BookingByBottomRebound = extent.createTest("Test Booking By Bottom Rebound","Desription Auto Booking By Bottom Rebound");
        try {
            // Wait for 1 seconds
            Thread.sleep(4000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement versi = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[4]/div[4]/div/div"));
        String version = versi.getText();
        String edgeVersion = driver.getCapabilities().getCapability(CapabilityType.BROWSER_VERSION).toString();
        System.out.println("BIONS WEB "+version+" And Edge Version "+edgeVersion);
        Login.testScenariologin(driver, loginTest, "DEV", "AUTOREG", "d", "d12345");

        System.out.println("---------------");
        System.out.println("SEKENARIO BUY");
        StockBuy.Buy(driver, stockBuyTest, "RG", "abba", "85", "1");
        StockBuy.Buy(driver, stockBuyTest, "RG", "abba", "10000", "1");

        System.out.println("---------------");
        System.out.println("SEKENARIO SELL");
        StockSell.Sell(driver, stockSellTest, "abba", "85", "1");
        StockSell.Sell(driver, stockSellTest, "aspi", "85", "1");

        System.out.println("---------------");
        System.out.println("SEKENARIO WITHDRAW");
        StockWithdrawl.wd(driver, stockWDTest, "ABBA", "85", "1");
        StockWithdrawl.wd(driver, stockWDTest, "aspi", "85", "1");

        System.out.println("---------------");
        System.out.println("SEKENARIO AMEND");
        StockAmend.am(driver, stockAmend, "ABBA", "85", "1", "86", "1");
        StockAmend.am(driver, stockAmend, "aspi", "85", "1", "86", "1");

        System.out.println("---------------");
        System.out.println("SEKENARIO BUY ORDERBOOKING");
        StockBuyOB.BuyOb(driver, stockBuyObTest, "ABBA", "76", "1");

        System.out.println("---------------");
        System.out.println("SEKENARIO SELL ORDERBOOKING");
        StockSellOB.SellOb(driver, stockSellObTest, "ABBA", "76", "1");

        System.out.println("---------------");
        System.out.println("SEKENARIO AUTO BOOKING BY PRICE");
        AutoBookingByPrice.testbyprice(driver, BookingByPriceTest, "ABBA", "LAST", "LS", "70", "BUY", "76", "1");
        AutoBookingByPrice.testbyprice(driver, BookingByPriceTest, "AVIA", "LAST", "LS", "70", "SELL", "76", "1");

        System.out.println("---------------");
        System.out.println("SEKENARIO AUTO BOOKING BY GAIN/LOSS");
        AutoBookingByGainLoss.testgl(driver, BookingByGainLoss, "ABBA", "GAIN", "KS", "1", "SELL", "76", "2");
        AutoBookingByGainLoss.testgl(driver, BookingByGainLoss, "FISK", "GAIN", "KS", "1", "SELL", "76", "2");

        System.out.println("---------------");
        System.out.println("SEKENARIO AUTO BOOKING BY TIME");
        AutoBookingByTime.testbt(driver, BookingByTime, "ABBA", "CUSTOM", "12", "ENTRY", "BUY", "1", "10");
        AutoBookingByTime.testbt(driver, BookingByTime, "AVIA", "CUSTOM", "12", "ENTRY", "SELL", "1", "10");

        System.out.println("---------------");
        System.out.println("SEKENARIO AUTO BOOKING BY TRAILING STOP");
        AutoBookingByTrailingStop.testts(driver, BookingByTrailingStop, "ABBA", "100", "TICK", "1", "OFFER", "1");
        AutoBookingByTrailingStop.testts(driver, BookingByTrailingStop, "ABBA", "1", "TICK", "1", "OFFER", "1000000");

        System.out.println("SEKENARIO AUTO BOOKING BY BOTTOM REBOUND");
        System.out.println("---------------");
        AutoBookingByBottomRebound.testbr(driver, BookingByBottomRebound, "ABBA", "1", "TICK", "1", "OFFER", "1");
        AutoBookingByBottomRebound.testbr(driver, BookingByBottomRebound, "ABBA", "99", "TICK", "1", "OFFER", "1000000");
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String time = currentDateTime.format(formatter);
        time = time.replace(":", "_");

        String filename = "D://result//" + time + "//result.html";
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(filename);
        extent.attachReporter(sparkReporter);

        extent.flush();
        driver.quit();
    }
}

