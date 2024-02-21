import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AutoBookingByTime {
    public static void testbt(WebDriver driver, ExtentTest extentTest, String Stock, String condition, String iftime, String bestorentry,String bos, String price, String lot) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div/div/div[4]")));
        menu.click();
        try {
            // Wait for 1 seconds
            Thread.sleep(3000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement menuautomaticorder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Automatic Order']")));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuautomaticorder).click().perform();
        try {
            // Wait for 1 seconds
            Thread.sleep(3000);
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
        WebElement codition = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Condition']/following-sibling::*/div")));
        codition.click();
        WebElement aotime = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Booking By Time']")));
        Actions actionsaotime = new Actions(driver);
        actionsaotime.moveToElement(aotime).click().perform();
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
        switch (condition) {
            case "CUSTOM" -> {
                WebElement timecustom = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[4]/div[2]/div/div/div/input")));
                timecustom.sendKeys(Keys.CONTROL + "a");
                try {
                    // Wait for 0.5 seconds
                    Thread.sleep(500);
                } catch (InterruptedException f) {
                    f.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                timecustom.sendKeys(Keys.BACK_SPACE);
                timecustom.sendKeys(iftime + "0000");
                timecustom.sendKeys(Keys.ENTER);
                List<WebElement> errorElements = driver.findElements(By.xpath("//*[text()='Error']"));
                if (!errorElements.isEmpty()) {
                    WebElement error = errorElements.get(0);
                    String txterror = error.getText();
                    WebElement failElements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Error'][1]/following-sibling::*[1]")));
                    String txtfail = failElements.getText();
                    extentTest.log(Status.FAIL,txterror +" "+txtfail+" With Stock : "+Stock);
                    System.out.println(txterror +" " +txtfail+" With Stock : "+Stock );
                    WebElement okElements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Error'][1]/following-sibling::*[2]/div")));
                    okElements.click();
                    return;
                }
                if (bestorentry.equals("BEST")) {
                    WebElement bestorentry2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[4]/div[3]/div")));
                    bestorentry2.click();
                    WebElement bestorentry3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Use Best Price']")));
                    Actions actionsbestorentry3 = new Actions(driver);
                    actionsbestorentry3.moveToElement(bestorentry3).click().perform();
                }
            }
            case "POPENING" -> {
                WebElement time1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[4]/div[1]/div")));
                Actions actionstime1= new Actions(driver);
                actionstime1.moveToElement(time1).click().perform();
                try {
                    WebElement po = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Pre-Opening']")));
                    String txtpo = po.getText();

                    if (txtpo.contains("Pre-Opening")) {
                        Actions actionspo = new Actions(driver);
                        actionspo.moveToElement(po).click().perform();
                    } else {
                        System.out.println(Stock + " tidak ada di PreOpening");
                        extentTest.log(Status.FAIL, "Stock: " + Stock + " tidak ada di PreOpening");
                        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
                        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", po);

                        po.click();
                        return;
                    }
                } catch (TimeoutException e) {
                    System.out.println("Element not found for Pre-Opening. Skipping to the next step.");
                    return; // or throw an exception or perform any other necessary action
                }

                if (bestorentry.equals("BEST")) {
                    WebElement bestorentry2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[4]/div[2]/div")));
                    bestorentry2.click();
                    WebElement bestorentrypo2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Use Best Price']")));
                    Actions actionsbestorentrypo2= new Actions(driver);
                    actionsbestorentrypo2.moveToElement(bestorentrypo2).click().perform();
                }
            }
            case "SESION1" -> {
                WebElement time1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[4]/div[1]/div")));
                Actions actionstime1= new Actions(driver);
                actionstime1.moveToElement(time1).click().perform();
                try {
                    WebElement us1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Session 1']")));
                    String txtus1 = us1.getText();
                    if (txtus1.contains("Session 1")) {
                        Actions actionsus1= new Actions(driver);
                        actionsus1.moveToElement(us1).click().perform();}
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                if (bestorentry.equals("BEST")) {
                    WebElement bestorentry2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[4]/div[2]/div")));
                    bestorentry2.click();
                    WebElement bestorentry3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Use Best Price']")));
                    Actions abestorentry3= new Actions(driver);
                    abestorentry3.moveToElement(bestorentry3).click().perform();
                    try {
                        // Wait for 1 seconds
                        Thread.sleep(1000);
                    } catch (InterruptedException f) {
                        f.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                }
            }
            case "SESION2" -> {
                WebElement time1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[4]/div[1]/div")));
                Actions actionstime1= new Actions(driver);
                actionstime1.moveToElement(time1).click().perform();
                try {
                    WebElement sesi2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Session 2']")));
                    String txtsesi2 = sesi2.getText();
                    if (txtsesi2.contains("Session 2")) {
                        Actions actionss2= new Actions(driver);
                        actionss2.moveToElement(sesi2).click().perform();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                if (bestorentry.equals("BEST")) {
                    WebElement bestorentry2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[4]/div[2]/div")));
                    bestorentry2.click();
                    WebElement bestorentry3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Use Best Price']")));
                    Actions bestorentry3a= new Actions(driver);
                    bestorentry3a.moveToElement(bestorentry3).click().perform();
                }
            }
        }
        if (bos.equals("SELL")) {
            WebElement sell1 = driver.findElement(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[5]/div[2]"));
            Actions sell1a= new Actions(driver);
            sell1a.moveToElement(sell1).click().perform();
            WebElement sell2 = driver.findElement(By.xpath("//div[@role= 'menuitem']/div/div/div[text()='Sell']"));
            Actions actionssell2= new Actions(driver);
            actionssell2.moveToElement(sell2).click().perform();
        } else if (bos.equals("BUY")) {
            WebElement buy1 = driver.findElement(By.xpath("//*[text()='If the following conditions match:']/following-sibling::*[5]/div[2]"));
            Actions buy1a= new Actions(driver);
            buy1a.moveToElement(buy1).click().perform();
            WebElement buy2 = driver.findElement(By.xpath("//div[@role= 'menuitem']/div/div/div[text()='Buy']"));
            Actions buy2a= new Actions(driver);
            buy2a.moveToElement(buy2).click().perform();
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
        List<WebElement> errorElements = driver.findElements(By.xpath("//*[text()='Error']"));
        if (!errorElements.isEmpty()) {
            WebElement error = errorElements.get(0);
            String txterror = error.getText();
            WebElement failElements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Error'][1]/following-sibling::*[1]")));
            String txtfail = failElements.getText();
            extentTest.log(Status.FAIL,txterror +" "+txtfail+" With Stock : "+Stock);
            System.out.println(txterror +" " +txtfail+" With Stock : "+Stock );
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