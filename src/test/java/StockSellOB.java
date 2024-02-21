import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StockSellOB {
    public static void SellOb(WebDriver driver, ExtentTest extentTest, String stocknamesellob, String stockpricesellob, String stocklotsellob) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement menu= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div/div/div[4]")));
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
        try {
            // Wait for 2  seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }

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
        stocksell.sendKeys(stocknamesellob);
        stocksell.sendKeys(Keys.ENTER);
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
        WebElement pricesell= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Price']/following-sibling::*/div[2]/div/input")));
        pricesell.sendKeys(Keys.CONTROL + "a");
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        pricesell.sendKeys(Keys.BACK_SPACE);
        WebElement high=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='High']/following-sibling::*")));
        String hightxt = high.getText();
        WebElement low = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Low']/following-sibling::*")));
        String lowtxt = low.getText();
        if (stockpricesellob.equals("high")) {
            if (hightxt.equals("0")) {
                pricesell.sendKeys("99999");
            } else {
                pricesell.sendKeys(hightxt);
            }
        } else if (stockpricesellob.equals("low")) {
            if (lowtxt.equals("0")) {
                pricesell.sendKeys("99999");
            } else {
            pricesell.sendKeys(lowtxt);}
        }
        else pricesell.sendKeys(stockpricesellob);
        WebElement lotsell= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Lot']/following-sibling::*/div[2]/div/input")));
        lotsell.sendKeys(Keys.CONTROL + "a");
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        lotsell.sendKeys(Keys.BACK_SPACE);
        lotsell.sendKeys(stocklotsellob);
        WebElement checkob= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@role='checkbox']")));
        checkob.click();
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
        WebElement orderprice1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderprice-0']")));
        String orderpricetxt = orderprice1.getText();
        if (text.contains("REJECTED")) {
            try {
                // Wait for 2 seconds
                Thread.sleep(5000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            WebElement rejects= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderstatus-0']")));
            String rejectstatus = rejects.getText();
            extentTest.log(Status.FAIL, "Sell : " + stocknamesellob + " | Price : " + orderpricetxt + " | Lot : " + stocklottxt + " ---------- " + text + " " + rejectstatus);
            System.out.println("STOCK SELL FAIL "+ stocknamesellob + " | Price : " + orderpricetxt + " | Lot : " + stocklottxt + " ---------- " + text + " " + rejectstatus);
        } else {
            try {
                // Wait for 2 seconds
                Thread.sleep(5000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            extentTest.log(Status.PASS, "OrderBooking" + " Sell : " + stocknamesellob + " | Price : " + orderpricetxt + " | Lot : " + stocklottxt + " --------- PASS | Status : " + text);
            System.out.println("STOCK SELL PASS "+ stocknamesellob + " | Price : " + orderpricetxt + " | Lot : " + stocklottxt + " --------- PASS | Status : " + text);
        }

    }
}