import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class StockBuy {
    public static void Buy(WebDriver driver, ExtentTest extentTest, String TNorRG, String stocknamebuy, String stockpricebuy, String stocklotbuy) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement menu= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div/div/div[4]")));
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
        stockbuy.sendKeys(stocknamebuy);
        stockbuy.sendKeys(Keys.ENTER);
              if (TNorRG.equals("TN")) {
                  WebElement settn= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Stock']/following-sibling::*/div/div/div/div/div[2]")));
                  JavascriptExecutor executor = (JavascriptExecutor) driver;
                  executor.executeScript("arguments[0].click();", settn);
                WebElement tn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='TN']")));
                  JavascriptExecutor executor2 = (JavascriptExecutor) driver;
                  executor2.executeScript("arguments[0].click();", tn);

        }

        WebElement pricebuy= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Price']/following-sibling::*/div[2]/div/input")));
        pricebuy.sendKeys(Keys.CONTROL + "a");
        pricebuy.sendKeys(Keys.BACK_SPACE);
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        pricebuy.sendKeys(Keys.CONTROL + "a");
        pricebuy.sendKeys(Keys.BACK_SPACE);
        pricebuy.sendKeys(stockpricebuy);

        WebElement lotbuy= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Lot']/following-sibling::*/div[2]/div/input")));
        lotbuy.sendKeys(Keys.CONTROL + "a");
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        lotbuy.sendKeys(Keys.BACK_SPACE);
        lotbuy.sendKeys(stocklotbuy);

        WebElement buybtn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'BUY') and contains(@style, 'text-align: center')]")));
        buybtn.click();
        List<WebElement> errorElements = driver.findElements(By.xpath("//h1[contains(@style, 'text-align: center;') and text()='Error']"));
        if (!errorElements.isEmpty()) {
            WebElement error = errorElements.get(0);
            String txterror = error.getText();
            WebElement failElements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style, 'text-align: center;') and text()='Trading limit exceeded max value per transaction for this user']")));
            String txtfail = failElements.getText();

            extentTest.log(Status.FAIL, txterror + " " + stocknamebuy + " Error ---------" + txtfail +" with Lot "+stocklotbuy);
            System.out.println(txterror + " " + stocknamebuy + " Error ---------" + txtfail+" with Lot "+stocklotbuy);

            WebElement okElements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style, 'font-weight: normal;') and text()='Ok']")));
            okElements.click();
            return;
        }
//
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

        WebElement statusElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderstatus-0']")));
        String text = statusElement.getText();
        WebElement stocklot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderlot-0']")));
        String stocklottxt = stocklot.getText();
        if (text.contains("REJECTED")) {

            WebElement rejects=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderreject-0']")));
            String rejectstatus = rejects.getText();
            try {
                // Wait for 2 seconds
                Thread.sleep(5000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            if (TNorRG.equals("TN")) {
                extentTest.log(Status.FAIL, "Buy : " + stocknamebuy +".TN"+" | Price : " + stockpricebuy + " | Lot : " + stocklottxt + " ---------- " + text + " " + rejectstatus);
            }else{
                extentTest.log(Status.FAIL, "Buy : " + stocknamebuy +".RG"+" | Price : " + stockpricebuy + " | Lot : " + stocklottxt + " ---------- " + text + " " + rejectstatus);
            }
            System.out.println("STOCK BUY FAIL "+ stocknamebuy +".RG"+" | Price : " + stockpricebuy + " | Lot : " + stocklottxt + " ---------- " + text + " " + rejectstatus);

        } else {
            try {
                // Wait for 2 seconds
                Thread.sleep(5000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            if (TNorRG.equals("TN")) {
                extentTest.log(Status.PASS, "Buy : " + stocknamebuy +".TN"+" | Price : " + stockpricebuy + " | Lot : " + stocklottxt + " --------- PASS | Status : " + text);
                System.out.println("STOCK BUY PASS "+ stocknamebuy +".TN"+ " | Price : " + stockpricebuy + " | Lot : " + stocklottxt + " --------- PASS | Status : " + text);
            }else {
                extentTest.log(Status.PASS, "Buy : " + stocknamebuy +".RG"+ " | Price : " + stockpricebuy + " | Lot : " + stocklottxt + " --------- PASS | Status : " + text);
                System.out.println("STOCK BUY PASS "+ stocknamebuy +".RG"+ " | Price : " + stockpricebuy + " | Lot : " + stocklottxt + " --------- PASS | Status : " + text);
            }

        }
    }

}