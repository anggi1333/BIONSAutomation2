import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StockAmend {
    public static void am(WebDriver driver, ExtentTest extentTest, String stocknameam, String stockpriceam, String stocklotam, String stockpriceamto, String stocklotamto) {
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
        WebElement buy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div/div/div[21]/div/div/div/div[1]")));
        Actions actions = new Actions(driver);
        actions.moveToElement(buy).click().perform();
        WebElement stockbuy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[2]/div[2]/div/div/div[2]/div[1]/input")));
        stockbuy.sendKeys(Keys.CONTROL + "a");
        stockbuy.sendKeys(Keys.BACK_SPACE);
        stockbuy.sendKeys(stocknameam);
        stockbuy.sendKeys(Keys.ENTER);
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement pricebuy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[3]/div[2]/div[2]/div[1]/input")));
        pricebuy.sendKeys(Keys.CONTROL + "a");
        pricebuy.sendKeys(Keys.BACK_SPACE);
        pricebuy.sendKeys(stockpriceam);
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement lotbuy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[4]/div[2]/div[2]/div[1]/input")));
        lotbuy.sendKeys(Keys.CONTROL + "a");
        lotbuy.sendKeys(Keys.BACK_SPACE);
        lotbuy.sendKeys(stocklotam);
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement buybtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[7]/div/div/div")));
        buybtn.click();
        WebElement sendthisorderyes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
        sendthisorderyes.click();
        WebElement ordersendyes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
        ordersendyes.click();
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement statusElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[1]/div")));
        String text = statusElement.getText();

        if (text.contains("OPEN") || text.contains("PARTIAL")) {
            statusElement.click();

            WebElement amend1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div")));
            amend1.click();
          WebElement pricebuyam = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[4]/div/div[4]/div[2]/div[2]/div[1]/input")));
            pricebuyam.sendKeys(Keys.CONTROL + "a");
            pricebuyam.sendKeys(Keys.BACK_SPACE);
            pricebuyam.sendKeys(stockpriceamto);
            try {
                // Wait for 1 seconds
                Thread.sleep(1000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            WebElement lotbuyam = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[4]/div/div[5]/div[2]/div[2]/div[1]/input")));
            lotbuyam.sendKeys(Keys.CONTROL + "a");
            lotbuyam.sendKeys(Keys.BACK_SPACE);
            lotbuyam.sendKeys(stocklotamto);
            try {
                // Wait for 1 seconds
                Thread.sleep(1000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            WebElement btnam = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[4]/div/div[7]/div/div/div")));
            btnam.click();

            WebElement sendthisorderyesam = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
            sendthisorderyesam.click();
            WebElement ordersendyesam = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
            ordersendyesam.click();
            try {
                // Wait for 1 seconds
                Thread.sleep(1000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            WebElement statusamended = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div[3]/div/div")));
            String statusamendedtxt = statusamended.getText();
            WebElement lotamended = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[3]")));
            String lotamendedtxt = lotamended.getText();
            WebElement priceamended = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]")));
            String priceamendedtxt = priceamended.getText();
            WebElement stocklot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div[5]/div/div/div/div[2]/div[3]")));
            String stocklottxt = stocklot.getText();
            try {
                // Wait for 2 seconds
                Thread.sleep(2000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            extentTest.log(Status.PASS, statusamendedtxt +" "+ stocknameam + " ---------PASS from | Price : Rp "+stockpriceam+ " & Lot : " + stocklottxt + " -----to----- " + priceamendedtxt + " & Lot : " + lotamendedtxt + " | With New Status " + text);
            System.out.println("STOCK AMEND PASS " + statusamendedtxt+" " + stocknameam + " ---------PASS from | Price : Rp "+stockpriceam+ " & Lot : " + stocklottxt + " -----to----- " + priceamendedtxt + " & Lot : " + lotamendedtxt + " | With New Status " + text);
        } else {
            try {
                // Wait for 2 seconds
                Thread.sleep(2000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            extentTest.log(Status.FAIL, " Amend Fail | Status : " + text);
            System.out.println("STOCK AMEND FAIL| Status : " + text);
        }
    }


}