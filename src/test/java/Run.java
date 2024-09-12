import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Run {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.silentOutput", "true");

        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\chrome-win\\chrome.exe");
        options.addArguments("--force-device-scale-factor=1");
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://appdev.bions.id/");
        driver.manage().window().maximize();
        ExtentReports extent = new ExtentReports();

        try {
            // Wait for 1 seconds
            Thread.sleep(4000);
        } catch (InterruptedException f) {
            f.printStackTrace();
        }
            Thread.currentThread().interrupt();
            Capabilities capabilities = driver.getCapabilities();
            String chromeVersion = capabilities.getVersion();
            WebElement vers = driver.findElement(By.xpath("//*[text()='14016']/parent::*/following-sibling::*"));
            String versibions = vers.getText();
            System.out.println("BIONS WEB "+ versibions + " Chrome Version: " + chromeVersion);

            ExtentTest loginTest = extent.createTest("Test Login", "Description of Test Scenario Login");
            Login.testScenariologin(driver, loginTest, "DEV", "raybca01", "q", "p12345");
        for (int i = 0; i < 100; i++) {
            System.out.println("---------------");
            System.out.println("SEKENARIO BUY");
            ExtentTest stockBuyTest = extent.createTest("Test Buy Stock", "Description of Test Buy Stock");
            StockBuy.Buy(driver, stockBuyTest,  "bbni", "low", "1");
            StockBuy.Buy(driver, stockBuyTest, "bbni", "low", "2");

            System.out.println("---------------");
            ExtentTest stockSellTest = extent.createTest("Test Sell Stock", "Description of Test Sell Stock");
            System.out.println("SEKENARIO SELL");
            StockSell.Sell(driver, stockSellTest, "bbni", "low", "1");
            StockSell.Sell(driver, stockSellTest, "bbni", "low", "2");
        }
//
//            System.out.println("---------------");
//            ExtentTest stockWDTest = extent.createTest("Test Withdrawl Stock", "Description of Test Withdrawl Stock");
//            System.out.println("SEKENARIO WITHDRAW");
//            StockWithdrawl.wd(driver, stockWDTest, "buka", "low", "1");
//            StockWithdrawl.wd(driver, stockWDTest, "abba", "low", "1");
//            StockWithdrawl.wd(driver, stockWDTest, "abba", "low", "1");
//            StockWithdrawl.wd(driver, stockWDTest, "bbca", "low", "1");
//
//            System.out.println("---------------");
//            ExtentTest stockAmend = extent.createTest("Test Amend", "Desription of Test Amend Stock");
//            System.out.println("SEKENARIO AMEND");
//            StockAmend.am(driver, stockAmend, "bbca", "low", "2", "low", "1");
//            StockAmend.am(driver, stockAmend, "bbri", "low", "2", "low", "1");
//            StockAmend.am(driver, stockAmend, "bbca", "low", "2", "low", "1");
//            StockAmend.am(driver, stockAmend, "buka", "low", "2", "low", "1");
//            StockAmend.am(driver, stockAmend, "abba", "low", "2", "low", "1");
//            StockAmend.am(driver, stockAmend, "bbca", "low", "2", "low", "1");
//            StockAmend.am(driver, stockAmend, "bbca", "low", "2", "low", "1");
//            StockAmend.am(driver, stockAmend, "bbri", "low", "2", "low", "1");
//            StockAmend.am(driver, stockAmend, "bbca", "low", "2", "low", "1");
//            StockAmend.am(driver, stockAmend, "buka", "low", "2", "low", "1");
//            StockAmend.am(driver, stockAmend, "abba", "low", "2", "low", "1");
//            StockAmend.am(driver, stockAmend, "bbca", "low", "2", "low", "1");
//
//
//            System.out.println("---------------");
//            ExtentTest stockBuyObTest = extent.createTest("Test Buy Stock OrderBooking", "Description of Test Buy Stock OrderBooking");
//            System.out.println("SEKENARIO BUY ORDERBOOKING");
//            StockBuyOB.BuyOb(driver, stockBuyObTest, "abba", "low", "1");
//            StockBuyOB.BuyOb(driver, stockBuyObTest, "abba", "high", "1");
//
//            System.out.println("---------------");
//            ExtentTest stockSellObTest = extent.createTest("Test Sell Stock OrderBooking", "Description of Test Sell Stock OrderBooking");
//            System.out.println("SEKENARIO SELL ORDERBOOKING");
//            StockSellOB.SellOb(driver, stockSellObTest, "abba", "low", "1");
//            StockSellOB.SellOb(driver, stockSellObTest, "abba", "high", "1");
//
//
//            System.out.println("--------------ALGO--------------");
//            System.out.println("---------------");
//            ExtentTest BookingByPriceTest = extent.createTest("Test Booking By PriceTest", "Desription Auto Booking By Price");
//            System.out.println("SEKENARIO AUTO BOOKING BY PRICE");
//            AutoBookingByPrice.testbyprice(driver, BookingByPriceTest, "bbni", "LAST", "LS", "86", "BUY", "low", "1");
//            AutoBookingByPrice.testbyprice(driver, BookingByPriceTest, "bbni", "LAST", "LS", "86", "BUY", "high", "1");
//
//            System.out.println("---------------");
//            ExtentTest BookingByGainLoss = extent.createTest("Test Booking By GainLoss", "Desription Auto Booking By Gain Loss");
//            System.out.println("SEKENARIO AUTO BOOKING BY GAIN/LOSS");
//            AutoBookingByGainLoss.testgl(driver, BookingByGainLoss, "bbni", "GAIN", "KS", "1", "SELL", "low", "2");
//            AutoBookingByGainLoss.testgl(driver, BookingByGainLoss, "bbni", "GAIN", "KS", "1", "SELL", "high", "2");
//
//            System.out.println("---------------");
//            ExtentTest BookingByTime = extent.createTest("Test Booking By Time", "Desription Auto Booking By Time");
//            System.out.println("SEKENARIO AUTO BOOKING BY TIME");
//            AutoBookingByTime.testbt(driver, BookingByTime, "bbni", "CUSTOM", "12", "ENTRY", "BUY", "low", "10");
//            AutoBookingByTime.testbt(driver, BookingByTime, "bbni", "CUSTOM", "12", "ENTRY", "BUY", "high", "10");
//
//            System.out.println("---------------");
//            ExtentTest BookingByTrailingStop = extent.createTest("Test Booking By Trailing Stop", "Desription Auto Booking By Trailing Stop");
//            System.out.println("SEKENARIO AUTO BOOKING BY TRAILING STOP");
//            AutoBookingByTrailingStop.testts(driver, BookingByTrailingStop, "bbca", "86", "TICK", "1", "OFFER", "1");
//
//            System.out.println("SEKENARIO AUTO BOOKING BY BOTTOM REBOUND");
//            ExtentTest BookingByBottomRebound = extent.createTest("Test Booking By Bottom Rebound", "Desription Auto Booking By Bottom Rebound");
//            System.out.println("---------------");
//            AutoBookingByBottomRebound.testbr(driver, BookingByBottomRebound, "bbca", "1", "TICK", "1", "OFFER", "1");

            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            String time = currentDateTime.format(formatter);
            time = time.replace(":", "_");

            String filename = "D://result//Result Automation " + time + ".html";

            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(filename);
            extent.attachReporter(sparkReporter);

            extent.flush();
            driver.quit();
        }

}

