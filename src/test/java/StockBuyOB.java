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
        WebElement buy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div/div/div[21]/div/div/div/div[1]")));
        Actions actions = new Actions(driver);
        actions.moveToElement(buy).click().perform();
        WebElement stockbuy  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[3]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[2]/div[2]/div/div/div[2]/div[1]/input")));
        stockbuy.sendKeys(Keys.CONTROL + "a");
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
        WebElement pricebuy  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[3]/div[2]/div[2]/div[1]/input")));
        pricebuy.sendKeys(Keys.CONTROL + "a");
        pricebuy.sendKeys(Keys.BACK_SPACE);
        pricebuy.sendKeys(stockpricebuyob);
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement lotbuy  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[4]/div[2]/div[2]/div[1]/input")));
        lotbuy.sendKeys(Keys.CONTROL + "a");
        lotbuy.sendKeys(Keys.BACK_SPACE);
        lotbuy.sendKeys(stocklotbuyob);
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement checkob  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[6]/div/div[1]/div/div[2]/div")));
        checkob.click();
        WebElement buybtn  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[7]/div/div/div")));
        buybtn.click();
        WebElement sendthisorderyes  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
        sendthisorderyes.click();
        WebElement ordersendyes  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
        ordersendyes.click();
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement statusElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[1]/div")));
        String text = statusElement.getText();
        WebElement statusob  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[4]")));
        String textsb = statusob.getText();
        WebElement stocklot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div[5]/div/div/div/div[2]/div[3]")));
        String stocklottxt = stocklot.getText();
        if (text.contains("REJECTED")) {
            try {
                // Wait for 2 seconds
                Thread.sleep(2000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            WebElement rejects  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[2]")));
            String rejectstatus = rejects.getText();
            extentTest.log(Status.FAIL, textsb+" | Buy : " +stocknamebuyob+" | Price : "+stockpricebuyob+" | Lot : "+stocklottxt+" ---------- "+text+" "+rejectstatus);
            System.out.println("STOCK BUY ORDERBOOKING FAIL "+stocknamebuyob+" | Price : "+stockpricebuyob+" | Lot : "+stocklottxt+" ---------- "+text+" "+rejectstatus);
        } else {
            try {
                // Wait for 2 seconds
                Thread.sleep(2000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            extentTest.log(Status.PASS, textsb+" | Buy | " +stocknamebuyob+" | Price : "+stockpricebuyob+" | Lot "+stocklottxt+" --------- PASS | Status : "+text);
            System.out.println("STOCK BUY ORDERBOOKING PASS "+stocknamebuyob+" | Price : "+stockpricebuyob+" | Lot "+stocklottxt+" --------- PASS | Status : "+text);
        }

    }

}