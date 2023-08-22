import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AutoBookingByBottomRebound {
    public static void testbr(WebDriver driver,ExtentTest extentTest,String stock, String triggerprice, String parameter, String value, String pricetype, String lot) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div/div/div[4]")));
        menu.click();
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement menuautomaticorder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Automatic Order']")));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuautomaticorder).click().perform();
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        String xpath = "//*[text()='Yes. Do not show for this login session']";
        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        if (!elements.isEmpty()) {
            WebElement jgnmuncul = elements.get(0);
            if (jgnmuncul.isDisplayed()) {
                jgnmuncul.click();
            }
        }
        WebElement stockinp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@value='BBNI']")));
        stockinp.sendKeys(Keys.CONTROL + "a");
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        stockinp.sendKeys(Keys.BACK_SPACE);
        stockinp.sendKeys(stock);
        stockinp.sendKeys(Keys.ENTER);

        WebElement codition = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Condition']/following-sibling::*/div")));
        codition.click();
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement ts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Booking By Bottom Rebound']")));
        Actions tsa = new Actions(driver);
        tsa.moveToElement(ts).click().perform();
        WebElement tgrprice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Trigger Price']/following-sibling::*[1]/div/div/input")));
        tgrprice.sendKeys(triggerprice);
        if (parameter.equals("PERSEN")){
            WebElement prm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Parameter']/following-sibling::*[1]/div")));
            prm.click();
            WebElement persen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role= 'menuitem']/div/div/div[text()='%']")));
            Actions persena = new Actions(driver);
            persena.moveToElement(persen).click().perform();

        } else if (parameter.equals("TICK")) {
            WebElement prm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Parameter']/following-sibling::*[1]/div")));
            prm.click();
            WebElement persen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role= 'menuitem']/div/div/div[text()='tick']")));
            Actions persena = new Actions(driver);
            persena.moveToElement(persen).click().perform();
        }
        WebElement values = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Value']/following-sibling::*/div/div/input")));
        values.sendKeys(Keys.CONTROL + "a");
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        values.sendKeys(Keys.BACK_SPACE);
        values.sendKeys(value);
        values.sendKeys(Keys.ENTER);
        switch (pricetype) {
            case "BID" -> {
                WebElement pricetypee = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Price Type']/following-sibling::*/div/div/div/div")));
                Actions pricetypeea = new Actions(driver);
                pricetypeea.moveToElement(pricetypee).click().perform();
                try {
                    // Wait for 5 seconds
                    Thread.sleep(1000);
                } catch (InterruptedException f) {
                    f.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                WebElement bid = driver.findElement(By.xpath("//*[text()='Bid Price']"));
                Actions actionsbid = new Actions(driver);
                actionsbid.moveToElement(bid).click().perform();
            }
            case "LAST" -> {
                WebElement pricetypee = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Price Type']/following-sibling::*/div/div/div/div")));
                Actions pricetypeea = new Actions(driver);
                pricetypeea.moveToElement(pricetypee).click().perform();
                try {
                    // Wait for 5 seconds
                    Thread.sleep(1000);
                } catch (InterruptedException f) {
                    f.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                WebElement bid = driver.findElement(By.xpath("//*[text()='Last Price']"));
                Actions actionsbid = new Actions(driver);
                actionsbid.moveToElement(bid).click().perform();
            }
            case "OFFER" -> {
                WebElement pricetypee = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Price Type']/following-sibling::*/div/div/div/div")));
                Actions pricetypeea = new Actions(driver);
                pricetypeea.moveToElement(pricetypee).click().perform();
                try {
                    // Wait for 5 seconds
                    Thread.sleep(1000);
                } catch (InterruptedException f) {
                    f.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                WebElement bid = driver.findElement(By.xpath("//*[text()='Offer Price']"));
                Actions actionsbid = new Actions(driver);
                actionsbid.moveToElement(bid).click().perform();
            }
        }

        WebElement llot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Lot']/following-sibling::*/div/div/input")));
        llot.sendKeys(Keys.CONTROL + "a");
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        llot.sendKeys(Keys.BACK_SPACE);
        llot.sendKeys(lot);
        llot.sendKeys(Keys.ENTER);
        WebElement sendasorder= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Send As Order']")));
        sendasorder.click();
        List<WebElement> errorElements = driver.findElements(By.xpath("//*[text()='Error']"));
        if (!errorElements.isEmpty()) {
            WebElement error = errorElements.get(0);
            String txterror = error.getText();
            WebElement failElements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Error'][1]/following-sibling::*[1]")));
            String txtfail = failElements.getText();
            extentTest.log(Status.FAIL,txterror +" "+txtfail+" With Stock : "+stock);
            System.out.println(txterror +" " +txtfail +" With Stock : "+stock);
            try {
                // Wait for 1 seconds
                Thread.sleep(1000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            WebElement okElements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Error'][1]/following-sibling::*[2]/div")));
            okElements.click();
            return;
        }

        WebElement sendthisorderyes= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style, 'font-weight: normal;') and text()='OK']")));
        sendthisorderyes.click();
        WebElement ordersendyes= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style, 'font-weight: normal;') and text()='OK']")));
        ordersendyes.click();
        try {
            // Wait for 1 seconds
            Thread.sleep(5000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement elementao = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='algostatus-0']")));
        boolean isElementDisplayed = elementao.isDisplayed();
        if (!isElementDisplayed) {
            WebElement panah = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div[3]/div"));
            panah.click();
        }
        try {
            // Wait for 1 seconds
            Thread.sleep(5000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement statusord = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='algostatus-0']")));
        String textstatusord = statusord.getText();
        WebElement statusord2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='algonotes-0']")));
        String textoder = statusord2.getText();

        extentTest.log(Status.PASS,  "STATUS ORDER LIST : "+textstatusord+ " || "+textoder);
        System.out.println("Auto Booking By TIME " +textstatusord+ " || "+textoder);

    }
}