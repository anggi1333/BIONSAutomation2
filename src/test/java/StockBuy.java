import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        WebElement buy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div/div/div[21]/div/div/div/div[1]")));
        Actions actions = new Actions(driver);
        actions.moveToElement(buy).click().perform();
        WebElement stockbuy= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[2]/div[2]/div/div/div[2]/div[1]/input")));
        stockbuy.sendKeys(Keys.CONTROL + "a");
        stockbuy.sendKeys(Keys.BACK_SPACE);
        stockbuy.sendKeys(stocknamebuy);
        stockbuy.sendKeys(Keys.ENTER);
              if (TNorRG.equals("TN")) {
            WebElement settn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[2]/div[3]/div/div")));
            settn.click();
            WebElement tn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div")));
            tn.click();
        }
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement pricebuy= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[3]/div[2]/div[2]/div[1]/input")));
        pricebuy.sendKeys(Keys.CONTROL + "a");
        pricebuy.sendKeys(Keys.BACK_SPACE);
        pricebuy.sendKeys(stockpricebuy);
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement lotbuy= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[4]/div[2]/div[2]/div[1]/input")));
        lotbuy.sendKeys(Keys.CONTROL + "a");
        lotbuy.sendKeys(Keys.BACK_SPACE);
        lotbuy.sendKeys(stocklotbuy);
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement buybtn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[7]/div/div/div")));
        buybtn.click();
        try {
            WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/h1")));
            String txterror = error.getText();
            WebElement fail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div/div")));
            String txtfail = fail.getText();

            if (txterror.contains("Error")) {
                extentTest.log(Status.FAIL,txterror + " " + stocknamebuy +" Error ---------"+ txtfail);
                System.out.println(txterror + " " + stocknamebuy +" Error ---------"+ txtfail);
                WebElement ok = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div/div/div/div")));
                ok.click();
                return;
            }

        }
        catch (TimeoutException ignored) {
        }
        WebElement sendthisorderyes= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
        sendthisorderyes.click();
        WebElement ordersendyes= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
        ordersendyes.click();
        try {
            // Wait for 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }

        WebElement statusElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[1]/div")));
        String text = statusElement.getText();
        WebElement stocklot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[3]")));
        String stocklottxt = stocklot.getText();
        if (text.contains("REJECTED")) {

            WebElement rejects=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[2]")));
            String rejectstatus = rejects.getText();
            try {
                // Wait for 2 seconds
                Thread.sleep(2000);
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
                Thread.sleep(2000);
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