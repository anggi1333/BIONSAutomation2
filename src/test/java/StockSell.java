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
        WebElement sell = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div/div/div[22]/div/div/div/div[2]")));
        Actions actions = new Actions(driver);
        actions.moveToElement(sell).click().perform();
        WebElement stocksell= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[2]/div[2]/div/div/div[2]/div[1]/input")));
        stocksell.sendKeys(Keys.CONTROL + "a");
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
        WebElement pricesell= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[3]/div[2]/div[2]/div[1]/input")));
        pricesell.sendKeys(Keys.CONTROL + "a");
        pricesell.sendKeys(Keys.BACK_SPACE);
        pricesell.sendKeys(stockpricesell);
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement lotsell= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[4]/div[2]/div[2]/div[1]/input")));
        lotsell.clear();
        lotsell.sendKeys(stocklotsell);
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement sellbtn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[7]/div/div/div")));
        sellbtn.click();
        WebElement sendthisorderyessell= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
        sendthisorderyessell.click();
        WebElement ordersendyessell= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
        ordersendyessell.click();
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement statusElement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[1]/div")));
        String text = statusElement.getText();
        WebElement stocklot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[3]")));
        String stocklottxt = stocklot.getText();
        if (text.contains("REJECTED")) {
            try {
                // Wait for 2 seconds
                Thread.sleep(2000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            WebElement rejects= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[2]")));
            String rejectstatus = rejects.getText();
            extentTest.log(Status.FAIL, "Sell : " + stocknamesell + " | Price : " + stockpricesell + " | Lot : " + stocklottxt + " ---------- " + text + " " + rejectstatus);
            System.out.println("STOCK SELL FAIL "+ stocknamesell + " | Price : " + stockpricesell + " | Lot : " + stocklottxt + " ---------- " + text + " " + rejectstatus);
        } else {
            try {
                // Wait for 2 seconds
                Thread.sleep(2000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            extentTest.log(Status.PASS, "Sell : " + stocknamesell + " | Price : " + stockpricesell + " | Lot : " + stocklottxt + " --------- PASS | Status : " + text);
            System.out.println("STOCK SELL PASS "+ stocknamesell + " | Price : " + stockpricesell + " | Lot : " + stocklottxt + " --------- PASS | Status : " + text);
        }

    }
}