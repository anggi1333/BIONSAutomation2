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
        stockbuy.sendKeys(stocknameam);
        stockbuy.sendKeys(Keys.ENTER);
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        By priceXpath = By.xpath("//*[text()='High']/following-sibling::*");
        By arrowButtonAXpath = By.xpath("//*[text()='Main Board']/parent::*/following-sibling::*");
        By arrowButtonBXpath = By.xpath("//*[text()='Watch List Board']/parent::*/following-sibling::*");
        By arrowButtonCXpath = By.xpath("//*[text()='Development Board']/parent::*/following-sibling::*");
        By arrowButtonDXpath = By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div[2]");
        WebElement priceElement = null;
        try {
            priceElement = driver.findElement(priceXpath);
        } catch (org.openqa.selenium.NoSuchElementException e) {}

        if (priceElement != null && priceElement.isDisplayed()) {

        } else {
            WebElement arrowButtonA = null;
            try {
                arrowButtonA = driver.findElement(arrowButtonAXpath);
            } catch (org.openqa.selenium.NoSuchElementException e) {}

            WebElement arrowButtonB = null;
            try {
                arrowButtonB = driver.findElement(arrowButtonBXpath);
            } catch (org.openqa.selenium.NoSuchElementException e) {}

            WebElement arrowButtonC = null;
            try {
                arrowButtonC = driver.findElement(arrowButtonCXpath);
            } catch (org.openqa.selenium.NoSuchElementException e) {}
            WebElement arrowButtonD = null;
            try {
                arrowButtonD = driver.findElement(arrowButtonDXpath);
            } catch (org.openqa.selenium.NoSuchElementException e) {}

            boolean clicked = false;

            if (arrowButtonA != null && arrowButtonA.isDisplayed()) {
                try {
                    actions.moveToElement(arrowButtonA).click().perform();
                    clicked = true;
                } catch (Exception e) {}
            } else if (arrowButtonB != null && arrowButtonB.isDisplayed()) {
                try {
                    actions.moveToElement(arrowButtonB).click().perform();
                    clicked = true;
                } catch (Exception e) {}
            } else if (arrowButtonC != null && arrowButtonC.isDisplayed()) {
                try {
                    actions.moveToElement(arrowButtonC).click().perform();
                    clicked = true;
                } catch (Exception e) {}
            } else if (arrowButtonD != null && arrowButtonD.isDisplayed()) {
                try {
                    actions.moveToElement(arrowButtonD).click().perform();
                    clicked = true;
                } catch (Exception e) {}
            }
            if (!clicked) {
            }
        }
        WebElement high=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='High']/following-sibling::*")));
        String hightxt = high.getText();
        WebElement low = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Low']/following-sibling::*")));
        String lowtxt = low.getText();
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
        if (stockpriceam.equals("high")) {
            if (hightxt.equals("0")) {
                pricebuy.sendKeys("99999");
            } else {
            pricebuy.sendKeys(hightxt);}
        } else if (stockpriceam.equals("low")) {
            if (lowtxt.equals("0")) {
                pricebuy.sendKeys("99999");
            } else {
            pricebuy.sendKeys(lowtxt);}
        } else pricebuy.sendKeys(stockpriceam);
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
        lotbuy.sendKeys(stocklotam);
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
        WebElement statusElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderstatus-0']")));
        String text = statusElement.getText();
        WebElement orderprice1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderprice-0']")));
        String orderpricetxt = orderprice1.getText();

        if (text.contains("OPEN") || text.contains("PARTIAL")) {
            statusElement.click();

            WebElement amend1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Amend']")));
            amend1.click();
          WebElement pricebuyam = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Price']/following-sibling::*/div[2]/div/input")));
            pricebuyam.sendKeys(Keys.CONTROL + "a");
            pricebuyam.sendKeys(Keys.BACK_SPACE);
            try {
                // Wait for 0.5 seconds
                Thread.sleep(500);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            if (stockpriceamto.equals("high")) {
                pricebuyam.sendKeys(hightxt);
            } else if (stockpriceamto.equals("low")) {
                pricebuyam.sendKeys(lowtxt);
            } else pricebuyam.sendKeys(stockpriceamto);
            try {
                // Wait for 0.5 seconds
                Thread.sleep(500);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            WebElement lotbuyam = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Lot']/following-sibling::*/div[2]/div/input")));
            lotbuyam.sendKeys(Keys.CONTROL + "a");
            try {
                // Wait for 0.5 seconds
                Thread.sleep(500);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            lotbuyam.sendKeys(Keys.BACK_SPACE);
            lotbuyam.sendKeys(stocklotamto);
            try {
                // Wait for 0.5 seconds
                Thread.sleep(500);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            WebElement btnam = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='AMEND']")));
            btnam.click();
            WebElement sendthisorderyesam = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style, 'font-weight: normal;') and text()='OK']")));
            sendthisorderyesam.click();
            WebElement ordersendyesam = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style, 'font-weight: normal;') and text()='OK']")));
            ordersendyesam.click();
            try {
                // Wait for 1 seconds
                Thread.sleep(5000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            WebElement statusamended = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderstatus-1']")));
            String statusamendedtxt = statusamended.getText();
            WebElement lotamended = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderlot-0']")));
            String lotamendedtxt = lotamended.getText();
            WebElement priceamended = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderprice-0']")));
            String priceamendedtxt = priceamended.getText();
            WebElement stocklot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderlot-1']")));
            String stocklottxt = stocklot.getText();
            try {
                // Wait for 1 seconds
                Thread.sleep(5000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            extentTest.log(Status.PASS, statusamendedtxt +" "+ stocknameam + " ---------PASS from | Price : Rp "+orderpricetxt+ " & Lot : " + stocklottxt + " -----to----- " + priceamendedtxt + " & Lot : " + lotamendedtxt + " | With New Status " + text);
            System.out.println("STOCK AMEND PASS " + statusamendedtxt+" " + stocknameam + " ---------PASS from | Price : Rp "+orderpricetxt+ " & Lot : " + stocklottxt + " -----to----- " + priceamendedtxt + " & Lot : " + lotamendedtxt + " | With New Status " + text);
        } else {
            try {
                // Wait for 2 seconds
                Thread.sleep(5000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            extentTest.log(Status.FAIL, " Amend Fail | Status : " + text+"---------- CANNOT AMEND");
            System.out.println("STOCK AMEND FAIL| Status : " + text+"---------- CANNOT AMEND");
        }
    }


}