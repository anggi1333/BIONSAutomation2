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


        Login.testScenariologin(driver, loginTest,"reni666","d","d12345");  //input username , password, pin untuk login

       //input order buy (stock name, stock price, stock lot buy)
        StockBuy.Buy(driver,stockBuyTest,"BBNI","9750","1");
        StockBuy.Buy(driver,stockBuyTest,"BBNI","9751","1"); //input order buy (stock name, stock price, stock lot buy)
        StockBuy.Buy(driver,stockBuyTest,"BBNI","1","1"); //input order buy (stock name, stock price, stock lot buy)
        StockBuy.Buy(driver,stockBuyTest,"BBNI","15000","1"); //input order buy (stock name, stock price, stock lot buy)
        StockBuy.Buy(driver,stockBuyTest,"BBNI","9750","50001"); //input order buy (stock name, stock price, stock lot buy)


        StockSell.Sell(driver, stockSellTest, "BBNI", "9750", "1"); //input order Sell (stock name, stock price, stock lot buy)
        StockSell.Sell(driver, stockSellTest, "BBNI", "9751", "1"); //input order Sell (stock name, stock price, stock lot buy)
        StockSell.Sell(driver, stockSellTest, "BBNI", "1", "1"); //input order Sell (stock name, stock price, stock lot buy)
        StockSell.Sell(driver, stockSellTest, "BBNI", "15000", "1"); //input order Sell (stock name, stock price, stock lot buy)
        StockSell.Sell(driver, stockSellTest, "BBNI", "9750", "50001"); //input order Sell (stock name, stock price, stock lot buy)

        StockBuyOB.BuyOb(driver,stockBuyObTest,"BBCA","14450","3");//input order Buy Orderbooking (stock name, stock price, stock lot buy)

        StockSellOB.SellOb(driver,stockSellObTest,"BBNI","9800","3");  //input order Sell Orderbooking (stock name, stock price, stock lot buy)

        StockWithdrawl.wd(driver,stockWDTest,"ABBA","99","20000"); //input order Sell Orderbooking (stock name, stock price, stock lot buy)
        StockWithdrawl.wd(driver,stockWDTest,"BBNI","15000","1"); //input order Sell Orderbooking (stock name, stock price, stock lot buy)

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("D://result//dd//Report Test Automate.html");

        extent.attachReporter(sparkReporter);
        extent.flush();
        driver.quit();
    }
}
