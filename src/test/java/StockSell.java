import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
public class StockSell {
    public static void Sell(WebDriver driver, ExtentTest extentTest, String stocknamesell, String stockpricesell, String stocklotsell) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div/div/div[4]")));
        menu.click();
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }

        WebElement sell = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Sell']")));
        Actions actions = new Actions(driver);
        actions.moveToElement(sell).click().perform();

        WebElement stocksell= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Stock']/following-sibling::*/div/div/div/div/input")));
        stocksell.sendKeys(Keys.CONTROL + "a");
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        stocksell.sendKeys(Keys.BACK_SPACE);
        stocksell.sendKeys(stocknamesell);
        stocksell.sendKeys(Keys.ENTER);
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement pricesell= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Price']/following-sibling::*/div[2]/div/input")));
        pricesell.sendKeys(Keys.CONTROL + "a");
        pricesell.sendKeys(Keys.BACK_SPACE);
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        pricesell.sendKeys(Keys.CONTROL + "a");
        pricesell.sendKeys(Keys.BACK_SPACE);
        pricesell.sendKeys(stockpricesell);

        WebElement lotsell= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Lot']/following-sibling::*/div[2]/div/input")));
        lotsell.clear();
        lotsell.sendKeys(stocklotsell);
        WebElement sellbtn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'SELL') and contains(@style, 'text-align: center')]")));
        sellbtn.click();
        WebElement sendthisorderyes= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style, 'font-weight: normal;') and text()='OK']")));
        sendthisorderyes.click();
        WebElement ordersendyes= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style, 'font-weight: normal;') and text()='OK']")));
        ordersendyes.click();
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement statusElement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderstatus-0']")));
        String text = statusElement.getText();
        WebElement stocklot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderlot-0']")));
        String stocklottxt = stocklot.getText();
        if (text.contains("REJECTED")) {
            try {
                // Wait for 2 seconds
                Thread.sleep(5000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            WebElement rejects= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderreject-0']")));
            String rejectstatus = rejects.getText();
            extentTest.log(Status.FAIL, "Sell : " + stocknamesell + " | Price : " + stockpricesell + " | Lot : " + stocklottxt + " ---------- " + text + " " + rejectstatus);
            System.out.println("STOCK SELL FAIL "+ stocknamesell + " | Price : " + stockpricesell + " | Lot : " + stocklottxt + " ---------- " + text + " " + rejectstatus);
        } else {
            try {
                // Wait for 2 seconds
                Thread.sleep(5000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            extentTest.log(Status.PASS, "Sell : " + stocknamesell + " | Price : " + stockpricesell + " | Lot : " + stocklottxt + " --------- PASS | Status : " + text);
            System.out.println("STOCK SELL PASS "+ stocknamesell + " | Price : " + stockpricesell + " | Lot : " + stocklottxt + " --------- PASS | Status : " + text);
        }

    }
}