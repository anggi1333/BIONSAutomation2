import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AutoBookingByGainLoss {
    public static void testgl (WebDriver driver, ExtentTest extentTest, String Stock, String lossgain, String operatorpersen, String bookprice, String buyorsell
            , String price, String lot) {
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
        WebElement menuautomaticorder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div/div/div[24]/div/div/div")));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuautomaticorder).click().perform();
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        String xpath = "/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div";
        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        if (!elements.isEmpty()) {
            WebElement jgnmuncul = elements.get(0);
            if (jgnmuncul.isDisplayed()) {
                jgnmuncul.click();
            }
        }
        WebElement codition = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[4]/div[2]/div")));
        codition.click();
        WebElement bbgl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div")));
        bbgl.click();
        WebElement stockinp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[3]/div[2]/div[1]/div/div/div[2]/div[1]/input")));
        stockinp.sendKeys(Keys.CONTROL + "a");
        stockinp.sendKeys(Keys.BACK_SPACE);
        stockinp.sendKeys(Stock);
        if (lossgain.equals("LOSS")) {
            WebElement lbowd = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[5]/div[1]/div/div"));
            lbowd.click();
            WebElement bid = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div"));
            bid.click();
        }
        if (operatorpersen.equals("SD")) {
            WebElement opt = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[5]/div[2]/div/div"));
            opt.click();
            WebElement opt2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[1]/div"));
            opt2.click();
        } else if (operatorpersen.equals("KS")) {
            WebElement opt = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[5]/div[2]/div/div"));
            opt.click();
            WebElement opt3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div"));
            opt3.click();
        }
        WebElement book = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[5]/div[3]/div/div[2]/div/input"));
        book.sendKeys(bookprice);
        if (buyorsell.equals("BUY")) {
            WebElement buy1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[6]/div[2]/div"));
            buy1.click();
            WebElement buy2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[1]/div/div"));
            buy2.click();
        }
        try {
            // Wait for 5 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement pricebook = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[7]/div[2]/div/div[2]/div[1]/input"));
        pricebook.sendKeys(Keys.CONTROL + "a");
        pricebook.sendKeys(Keys.BACK_SPACE);
        pricebook.sendKeys(price);
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement lotbook = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[7]/div[3]/div/div[2]/div/input"));
        lotbook.sendKeys(Keys.CONTROL + "a");
        lotbook.sendKeys(Keys.BACK_SPACE);
        lotbook.sendKeys(lot);
        try {
            WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/h1")));
            String txterror = error.getText();
            WebElement fail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div/div")));
            String txtfail = fail.getText();

            if (txterror.contains("Error")) {
                extentTest.log(Status.FAIL,Stock + " " +txtfail);
                System.out.println(txtfail);
                try {
                    // Wait for 5 seconds
                    Thread.sleep(2000);
                } catch (InterruptedException f) {
                    f.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                WebElement ok = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div/div/div/div")));
                ok.click();
                return;}
        } catch (TimeoutException ignored) {

        }

        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement sendthisorder = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[10]/div/div[1]/div/div"));
        sendthisorder.click();
        WebElement sendthisorderyes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
        sendthisorderyes.click();
        WebElement sendthisorderok = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div/div/div/div")));
        sendthisorderok.click();
        WebElement elementao = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/div[3]/div[1]/div")));
        boolean isElementDisplayed = elementao.isDisplayed();
        if (!isElementDisplayed) {
            WebElement panah = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div[3]/div"));
            panah.click();
        }
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement statusord = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/div[3]/div[1]/div")));
        String textstatusord = statusord.getText();
        WebElement statusord2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/div[3]/div[2]")));
        String textoder = statusord2.getText();
        try {
            // Wait for 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        extentTest.log(Status.PASS, "STATUS ORDER LIST : " + textstatusord + " || " + textoder);
        System.out.println("Auto Booking By Gain Loss " + textstatusord + " || " + textoder);
    }
}
