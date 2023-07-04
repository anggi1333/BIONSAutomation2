import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AutoBookingByTime {
    public static void testbt(WebDriver driver, ExtentTest extentTest, String Stock, String condition, String iftime, String bestorentry,String bos) {
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
        WebElement menuautomaticorder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div/div/div[24]/div/div/div")));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuautomaticorder).click().perform();
        try {
            // Wait for 1 seconds
            Thread.sleep(3000);
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
        WebElement aotime = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[3]/div/div")));
        aotime.click();
        WebElement stockinp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[3]/div[2]/div[1]/div/div/div[2]/div[1]/input")));
        stockinp.sendKeys(Keys.CONTROL + "a");
        stockinp.sendKeys(Keys.BACK_SPACE);
        stockinp.sendKeys(Stock);
        switch (condition) {
            case "CUSTOM" -> {
                try {
                    // Wait for 1 seconds
                    Thread.sleep(1000);
                } catch (InterruptedException f) {
                    f.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                WebElement timecustom = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[5]/div[2]/div/div[2]/div/input")));
                timecustom.sendKeys(Keys.CONTROL + "a");
                timecustom.sendKeys(Keys.BACK_SPACE);
                timecustom.sendKeys(iftime + "0000");
                timecustom.sendKeys(Keys.ENTER);
                if (bestorentry.equals("BEST")) {
                    try {
                        // Wait for 1 seconds
                        Thread.sleep(1000);
                    } catch (InterruptedException f) {
                        f.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                    WebElement bestorentry2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[5]/div[3]/div/div")));
                    bestorentry2.click();
                    WebElement bestorentry3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div")));
                    bestorentry3.click();
                    try {
                        // Wait for 1 seconds
                        Thread.sleep(1000);
                    } catch (InterruptedException f) {
                        f.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                }
            }
            case "POPENING" -> {
                try {
                    // Wait for 1 seconds
                    Thread.sleep(1000);
                } catch (InterruptedException f) {
                    f.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                WebElement time1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[5]/div[1]/div/div")));
                time1.click();
                try {
                    WebElement po = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div")));
                    String txtpo = po.getText();

                    if (txtpo.contains("Pre-Opening")) {
                        po.click();
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
                    try {
                        // Wait for 1 seconds
                        Thread.sleep(1000);
                    } catch (InterruptedException f) {
                        f.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                    WebElement bestorentry2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[5]/div[2]/div/div")));
                    bestorentry2.click();
                    WebElement bestorentrypo2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div")));
                    bestorentrypo2.click();
                    try {
                        // Wait for 1 seconds
                        Thread.sleep(1000);
                    } catch (InterruptedException f) {
                        f.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                }
            }
            case "SESION1" -> {
                try {
                    // Wait for 1 seconds
                    Thread.sleep(1000);
                } catch (InterruptedException f) {
                    f.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                WebElement time1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[5]/div[1]/div/div")));
                time1.click();
                try {
                    WebElement us1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div")));
                    String txtus1 = us1.getText();
                    if (txtus1.contains("Session 1")) {
                        us1.click();
                    } else {
                        WebElement us2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[3]/div/div")));
                        us2.click();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                if (bestorentry.equals("BEST")) {
                    try {
                        // Wait for 1 seconds
                        Thread.sleep(1000);
                    } catch (InterruptedException f) {
                        f.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                    WebElement bestorentry2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[5]/div[2]/div/div")));
                    bestorentry2.click();
                    WebElement bestorentry3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div")));
                    bestorentry3.click();
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
                try {
                    // Wait for 1 seconds
                    Thread.sleep(1000);
                } catch (InterruptedException f) {
                    f.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                WebElement time1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[5]/div[1]/div/div")));
                time1.click();
                try {
                    WebElement sesi2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[3]/div/div")));
                    String txtsesi2 = sesi2.getText();
                    if (txtsesi2.contains("Session 2")) {
                        sesi2.click();
                    } else {
                        WebElement sesi2u2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[4]/div/div")));
                        sesi2u2.click();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                if (bestorentry.equals("BEST")) {
                    try {
                        // Wait for 1 seconds
                        Thread.sleep(1000);
                    } catch (InterruptedException f) {
                        f.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                    WebElement bestorentry2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[5]/div[2]/div/div")));
                    bestorentry2.click();
                    WebElement bestorentry3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div")));
                    bestorentry3.click();
                    try {
                        // Wait for 1 seconds
                        Thread.sleep(1000);
                    } catch (InterruptedException f) {
                        f.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (bos.equals("SELL")) {
            WebElement sell1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div[6]/div[2]/div"));
            sell1.click();
            WebElement sell2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div"));
            sell2.click();
        }
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        elements = driver.findElements(By.xpath(xpath));
        if (!elements.isEmpty()) {
            WebElement jgnmuncul = elements.get(0);
            if (jgnmuncul.isDisplayed()) {
                jgnmuncul.click();
            }
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
        WebElement sendthisorderyes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
        sendthisorderyes.click();

        WebElement sendthisorderok = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div/div/div/div")));
        sendthisorderok.click();
        WebElement rejectao = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/div[3]/div[2]/div[1]/div[3]/div/div")));
        rejectao.click();
        try {
            // Wait for 1 seconds
            Thread.sleep(1000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
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
        isElementDisplayed = elementao.isDisplayed();
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

        extentTest.log(Status.PASS,  "STATUS ORDER LIST : "+textstatusord+ " || "+textoder);
        System.out.println("Auto Booking By Gain Price " +textstatusord+ " || "+textoder);

    }

}