import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;
//import com.example.package.Login


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


        Login.testScenariologin(driver, loginTest,"DEV","anggi666","d","d12345");  //input username , password, pin untuk login

        //input order buy (stock name, stock price, stock lot buy)
        StockBuy.Buy(driver,stockBuyTest,"BBNI","14025","1");
        StockBuy.Buy(driver,stockBuyTest,"BBNI","11701","1"); //input order buy (stock name, stock price, stock lot buy)
        StockBuy.Buy(driver,stockBuyTest,"BBNI","1","1"); //input order buy (stock name, stock price, stock lot buy)
        StockBuy.Buy(driver,stockBuyTest,"BBNI","20000","1"); //input order buy (stock name, stock price, stock lot buy)
        StockBuy.Buy(driver,stockBuyTest,"BBNI","14025","50001"); //input order buy (stock name, stock price, stock lot buy)


        StockSell.Sell(driver, stockSellTest, "BBRI", "6925", "1"); //input order Sell (stock name, stock price, stock lot buy)
        StockSell.Sell(driver, stockSellTest, "BBRI", "6927", "1"); //input order Sell (stock name, stock price, stock lot buy)
        StockSell.Sell(driver, stockSellTest, "BBRI", "1", "1"); //input order Sell (stock name, stock price, stock lot buy)
        StockSell.Sell(driver, stockSellTest, "BBRI", "15000", "1"); //input order Sell (stock name, stock price, stock lot buy)
        StockSell.Sell(driver, stockSellTest, "BBRI", "6925", "50001"); //input order Sell (stock name, stock price, stock lot buy)
//
//        StockBuyOB.BuyOb(driver,stockBuyObTest,"BBCA","14450","3");//input order Buy Orderbooking (stock name, stock price, stock lot buy)
//
//        StockSellOB.SellOb(driver,stockSellObTest,"BBNI","9800","3");  //input order Sell Orderbooking (stock name, stock price, stock lot buy)

        StockWithdrawl.wd(driver,stockWDTest,"BBNI","14025","20000"); //input order Sell Orderbooking (stock name, stock price, stock lot buy)
        StockWithdrawl.wd(driver,stockWDTest,"BBRI","6950","1"); //input order Sell Orderbooking (stock name, stock price, stock lot buy)

        StockAmend.am(driver,stockAmend,"BBNI","14025","2000","11700","1");
        StockAmend.am(driver,stockAmend,"BBRI","1","1","90","10");
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("D://result//dd//Report Test Automate222.html");

        extent.attachReporter(sparkReporter);
        extent.flush();
        driver.quit();
    }
}