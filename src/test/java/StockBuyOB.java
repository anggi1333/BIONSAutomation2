import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StockBuyOB {
    public static void BuyOb(WebDriver driver, ExtentTest extentTest, String stocknamebuyob, String stockpricebuyob, String stocklotbuyob) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement menu  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div/div/div[4]")));
        menu.click();
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement buy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Buy']")));
        Actions actions = new Actions(driver);
        actions.moveToElement(buy).click().perform();
        WebElement stockbuy= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Stock']/following-sibling::*/div/div/div/div/input")));
        stockbuy.sendKeys(Keys.CONTROL + "a");
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        stockbuy.sendKeys(Keys.BACK_SPACE);
        stockbuy.sendKeys(stocknamebuyob);
        stockbuy.sendKeys(Keys.ENTER);
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement pricebuy  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Price']/following-sibling::*/div[2]/div/input")));
        Actions pricebuya = new Actions(driver);
        pricebuya.moveToElement(pricebuy).sendKeys(Keys.CONTROL+"a").perform();
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        pricebuya.moveToElement(pricebuy).sendKeys(Keys.BACK_SPACE).perform();
        pricebuya.moveToElement(pricebuy).sendKeys(stockpricebuyob).perform();
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement lotbuy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Lot']/following-sibling::*/div[2]/div/input")));
        Actions lotbuya = new Actions(driver);
        lotbuya.moveToElement(lotbuy).sendKeys(Keys.CONTROL+"a").perform();
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        lotbuya.moveToElement(lotbuy).sendKeys(Keys.BACK_SPACE).perform();
        lotbuya.moveToElement(lotbuy).sendKeys(stocklotbuyob).perform();
        WebElement checkob  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@role='checkbox']")));
        checkob.click();
        WebElement buybtn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'BUY') and contains(@style, 'text-align: center')]")));
        buybtn.click();
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
        WebElement statusElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderstatus-0']")));
        String text = statusElement.getText();

        WebElement stocklot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderstatus-0']")));
        String stocklottxt = stocklot.getText();
        if (text.contains("REJECTED")) {
            try {
                // Wait for 2 seconds
                Thread.sleep(5000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            WebElement rejects  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderstatus-0']")));
            String rejectstatus = rejects.getText();
            extentTest.log(Status.FAIL, "OrderBooking"+" | Buy : " +stocknamebuyob+" | Price : "+stockpricebuyob+" | Lot : "+stocklottxt+" ---------- "+text+" "+rejectstatus);
            System.out.println("STOCK BUY ORDERBOOKING FAIL "+stocknamebuyob+" | Price : "+stockpricebuyob+" | Lot : "+stocklottxt+" ---------- "+text+" "+rejectstatus);
        } else {
            try {
                // Wait for 2 seconds
                Thread.sleep(5000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            extentTest.log(Status.PASS, "OrderBooking"+" | Buy | " +stocknamebuyob+" | Price : "+stockpricebuyob+" | Lot "+stocklottxt+" --------- PASS | Status : "+text);
            System.out.println("STOCK BUY ORDERBOOKING PASS "+stocknamebuyob+" | Price : "+stockpricebuyob+" | Lot "+stocklottxt+" --------- PASS | Status : "+text);
        }

    }

}