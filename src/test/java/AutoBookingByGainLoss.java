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
        try {
            // Wait for 2  seconds
            Thread.sleep(2000);
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
        stockinp.sendKeys(Stock);
        stockinp.sendKeys(Keys.ENTER);
        WebElement codition = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Condition']/following-sibling::*/div")));
        codition.click();
        WebElement gainlos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Booking By GainLoss']")));
        Actions gainlosa = new Actions(driver);
        gainlosa.moveToElement(gainlos).click().perform();


        if (lossgain.equals("GAIN")) {
            WebElement gnl = driver.findElement(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[4]/div[1]/div"));
            gnl.click();
            WebElement gain = driver.findElement(By.xpath("//*[text()='%Gain (UnReal)']"));
            Actions gaina = new Actions(driver);
            gaina.moveToElement(gain).click().perform();
        } else if(lossgain.equals("LOSS")) {
            WebElement gnl = driver.findElement(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[4]/div[1]/div"));
            gnl.click();
            WebElement gain = driver.findElement(By.xpath("//*[text()='%Loss (UnReal)']"));
            Actions gaina = new Actions(driver);
            gaina.moveToElement(gain).click().perform();

        }
        List<WebElement> errorElements = driver.findElements(By.xpath("//*[text()='Error']"));
        if (!errorElements.isEmpty()) {
            WebElement error = errorElements.get(0);
            String txterror = error.getText();
            WebElement failElements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Error'][1]/following-sibling::*[1]")));
            String txtfail = failElements.getText();
            extentTest.log(Status.FAIL,txterror +"--------"+txtfail+" With Stock : "+ Stock);
            System.out.println(txterror +"--------" +txtfail +" With Stock : "+ Stock);
            WebElement okElements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Error'][1]/following-sibling::*[2]/div")));
            okElements.click();
            return;
        }

        switch (operatorpersen) {
            case "SD" -> {
                WebElement opt = driver.findElement(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[4]/div[2]"));
                opt.click();
                try {
                    // Wait for 5 seconds
                    Thread.sleep(1000);
                } catch (InterruptedException f) {
                    f.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                WebElement opt3 = driver.findElement(By.xpath("//*[text()='=']"));
                Actions actionsopt3 = new Actions(driver);
                actionsopt3.moveToElement(opt3).click().perform();
            }
            case "KS" -> {
                WebElement opt = driver.findElement(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[4]/div[2]"));
                opt.click();
                WebElement opt3 = driver.findElement(By.xpath("//*[text()='<=']"));
                Actions actionsopt3 = new Actions(driver);
                actionsopt3.moveToElement(opt3).click().perform();

            }
            case "LS" -> {
                WebElement opt = driver.findElement(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[4]/div[2]"));
                opt.click();
                WebElement opt3 = driver.findElement(By.xpath("//*[text()='>=']"));
                Actions actionsopt3 = new Actions(driver);
                actionsopt3.moveToElement(opt3).click().perform();
            }
        }
        WebElement book = driver.findElement(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[4]/div[3]/div/div[2]/div/input"));
        book.sendKeys(Keys.CONTROL + "a");
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        book.sendKeys(Keys.BACK_SPACE);
        book.sendKeys(bookprice);
        if (buyorsell.equals("BUY")) {
            WebElement buy1 = driver.findElement(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[5]/div[2]"));
            buy1.click();
            WebElement buy2 = driver.findElement(By.xpath("//div[@role= 'menuitem']/div/div/div[text()='Buy']"));
            Actions actionsbuy2 = new Actions(driver);
            actionsbuy2.moveToElement(buy2).click().perform();
        }else{
            WebElement sell1 = driver.findElement(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[5]/div[2]"));
            sell1.click();

            WebElement sell2 = driver.findElement(By.xpath("//div[@role= 'menuitem']/div/div/div[text()='Sell']"));
            Actions actionssell2 = new Actions(driver);
            actionssell2.moveToElement(sell2).click().perform();
        }
        WebElement pricebook = driver.findElement(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[6]/div[2]/div/div[2]/div/input"));
        pricebook.sendKeys(Keys.CONTROL+"A");
        pricebook.sendKeys(Keys.BACK_SPACE);
        WebElement high=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='High']/following-sibling::*")));
        String hightxt = high.getText();
        WebElement low = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Low']/following-sibling::*")));
        String lowtxt = low.getText();
        if (price.equals("high")) {
            pricebook.sendKeys(hightxt);
        } else if (price.equals("low")) {
            pricebook.sendKeys(lowtxt);
        }
        else pricebook.sendKeys(price);
        WebElement lotbook = driver.findElement(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[6]/div[3]/div/div[2]/div/input"));
        lotbook.sendKeys(Keys.CONTROL + "a");
        try {
            // Wait for 0.5 seconds
            Thread.sleep(500);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        lotbook.sendKeys(Keys.BACK_SPACE);
        lotbook.sendKeys(lot);
        WebElement sendasorder= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Send As Order']")));
        sendasorder.click();

        if (!errorElements.isEmpty()) {
            WebElement error = errorElements.get(0);
            String txterror = error.getText();
            WebElement failElements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Error'][1]/following-sibling::*[1]")));
            String txtfail = failElements.getText();
            extentTest.log(Status.FAIL,txterror +"--------"+txtfail+" With Stock : "+Stock);
            System.out.println(txterror +"--------" +txtfail +" With Stock : "+Stock);
            WebElement okElements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Error'][1]/following-sibling::*[2]/div")));
            okElements.click();
            return;

        }

        WebElement sendthisorderyes= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style, 'font-weight: normal;') and text()='OK']")));
        sendthisorderyes.click();
        WebElement ordersendyes= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style, 'font-weight: normal;') and text()='OK']")));
        ordersendyes.click();
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
        try {
            // Wait for 2 seconds
            Thread.sleep(5000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        extentTest.log(Status.PASS, "STATUS ORDER LIST : " + textstatusord + " || " + textoder);
        System.out.println("Auto Booking By Gain Loss " + textstatusord + " || " + textoder);
    }
}
