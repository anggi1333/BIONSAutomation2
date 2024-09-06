import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StockWithdrawl {
    public static void wd(WebDriver driver, ExtentTest extentTest, String stocknamewd, String stockpricewd, String stocklotwd) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='main.menu.label']/parent::*/parent::*/parent::*")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", menu);
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement buy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Dashboard')]/ancestor::*[4]/following-sibling::*[1]")));
        Actions actions = new Actions(driver);
        actions.moveToElement(buy).click().perform();
        try {
            // Wait for 2  seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }

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
        stockbuy.sendKeys(stocknamewd);
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
        By arrowButtonDXpath = By.xpath("//*[text()='New Economy Board']/parent::*/following-sibling::*");
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
                arrowButtonC = driver.findElement(arrowButtonDXpath);
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
                    actions.moveToElement(arrowButtonC).click().perform();
                    clicked = true;
                } catch (Exception e) {}
            }
            if (!clicked) {
            }
        }
        WebElement pricebuy= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Price']/following-sibling::*/div/div/input")));
        pricebuy.sendKeys(Keys.CONTROL + "a");
        pricebuy.sendKeys(Keys.BACK_SPACE);
        WebElement high=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='High']/following-sibling::*")));
        String hightxt = high.getText();
        WebElement low = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Low']/following-sibling::*")));
        String lowtxt = low.getText();
        if (stockpricewd.equals("high")) {
            if (hightxt.equals("0")) {
                pricebuy.sendKeys("99999");
            } else {
                pricebuy.sendKeys(hightxt);
            }
        } else if (stockpricewd.equals("low")) {
            if (lowtxt.equals("0")) {
                pricebuy.sendKeys("99999");
            } else {
            pricebuy.sendKeys(lowtxt);}
        }
        else pricebuy.sendKeys(stockpricewd);

        WebElement lotbuy= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Lot']/following-sibling::*/div/div/input")));
        lotbuy.sendKeys(Keys.CONTROL + "a");
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        lotbuy.sendKeys(Keys.BACK_SPACE);
        lotbuy.sendKeys(stocklotwd);
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

        if (text.contains("OPEN") || text.contains("PARTIAL")) {
            try {
                // Wait for 1 seconds
                Thread.sleep(3000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            statusElement.click();
            WebElement wd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Withdraw']")));
            wd.click();
            WebElement wd2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Withdraw']")));
            wd2.click();
            WebElement okwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style, 'font-weight: normal;') and text()='OK']")));
            okwd.click();
            WebElement okwd2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style, 'font-weight: normal;') and text()='OK']")));
            okwd2.click();
            WebElement snamewd= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderstatus-0']")));
            String stocknamewdtxt = snamewd.getText();
            WebElement slotwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderlot-0']")));
            String slotwdtxt = slotwd.getText();

            try {
                // Wait for 2 seconds
                Thread.sleep(5000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            extentTest.log(Status.PASS, "Withdraw : "+stocknamewdtxt+  " | Total Lot : "+slotwdtxt+" ---------PASS ");
            System.out.println("STOCK WD PASS"+stocknamewdtxt+  " | Total Lot : "+slotwdtxt);
        } else {
            try {
                // Wait for 2 seconds
                Thread.sleep(5000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            extentTest.log(Status.FAIL, "Fail Withdraw | Status : " +text+" ---------- CANNOT WITHDRAW");
            System.out.println("STOCK WD FAIL | Status : " +text+" ---------- CANNOT WITHDRAW");
        }



    }

}