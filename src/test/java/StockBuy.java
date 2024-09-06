    import com.aventstack.extentreports.ExtentTest;
    import com.aventstack.extentreports.Status;
    import org.openqa.selenium.*;
    import org.openqa.selenium.interactions.Actions;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.WebDriverWait;

    import java.util.Arrays;
    import java.util.Collections;
    import java.util.List;

    public class StockBuy {
        public static void Buy(WebDriver driver, ExtentTest extentTest, String TNorRG, String stocknamebuy, String stockpricebuy, String stocklotbuy) {
            WebDriverWait wait = new WebDriverWait(driver, 10);


            WebElement portp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='main.portfolio.label']/parent::*/parent::*/parent::*")));

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", portp);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", portp);


            WebElement asset = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Total Asset')]/following-sibling::*")));
            String asset1 = asset.getText();
            WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='main.menu.label']/parent::*/parent::*/parent::*")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", portp);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", menu);
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
            String input = "ACES,ADRO,AKRA,AMRT,ANTM,ARTO,ASII,BBCA,BBNI,BBRI,BBTN,BMRI,BRIS,BRPT,BUKA,CPIN,EMTK,ESSA,EXCL,GGRM,GOTO,HRUM,ICBP,INCO,INDF,INKP,INTP,ITMG,KLBF,MAPI,MBMA,MDKA,MEDC,MTEL,PGAS,PGEO,PTBA,PTMP,SIDO,SMGR,SRTG,TLKM,TOWR,UNTR,UNVR";
            String[] words = input.split(",");
            List<String> wordList = Arrays.asList(words);
            Collections.shuffle(wordList);
            StringBuilder selectedLetters = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                String word = wordList.get(i);
                selectedLetters.append(word, 0, Math.min(word.length(), 4));
            }
            String finalOutput = selectedLetters.substring(0, Math.min(selectedLetters.length(), 4));
            try {
                // Wait for 1 seconds
                Thread.sleep(1000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }

            WebElement stockbuy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Stock']/following-sibling::*/div/div/div/div/input")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stockbuy);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", stockbuy);
            stockbuy.sendKeys(Keys.CONTROL + "a");

            try {
                // Wait for 0.5 seconds
                Thread.sleep(500);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            stockbuy.sendKeys(Keys.BACK_SPACE);
            if (stocknamebuy.toLowerCase().contains("random")) {
                stockbuy.sendKeys(finalOutput);
            } else {
                stockbuy.sendKeys(stocknamebuy);
            }
            stockbuy.sendKeys(Keys.ENTER);

            List<WebElement> errorElements = driver.findElements(By.xpath("//*[text()='Error']"));
            if (!errorElements.isEmpty()) {
                WebElement error = errorElements.get(0);
                String txterror = error.getText();
                WebElement failElements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Error'][1]/following-sibling::*[1]")));
                String txtfail = failElements.getText();
                extentTest.log(Status.FAIL, "FAIL STOCK " + stocknamebuy + " or " + finalOutput + "-----------" + txterror + " " + txtfail);
                System.out.println("FAIL STOCK " + stocknamebuy + " or " + finalOutput + "-----------" + txterror + " " + txtfail);
                WebElement okElements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Error'][1]/following-sibling::*[2]/div")));
                okElements.click();
                return;
            }


            try {
                // Wait for 2  seconds
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
            if (TNorRG.equals("TN")) {
                WebElement settn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Stock']/following-sibling::*/div/div/div/div/div[2]")));
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", settn);
                WebElement tn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='TN']")));
                JavascriptExecutor executor2 = (JavascriptExecutor) driver;
                executor2.executeScript("arguments[0].click();", tn);

            }
            WebElement open = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Open']/following-sibling::*")));
            String opentxt = open.getText();
            WebElement average = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Average']/following-sibling::*")));
            String averagetxt = average.getText();
            WebElement high = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='High']/following-sibling::*")));
            String hightxt = high.getText();
            WebElement llow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='L.Low']/following-sibling::*")));
            String llowtxt = llow.getText();
            WebElement low = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Low']/following-sibling::*")));
            String lowtxt = low.getText();
            WebElement pricebuy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Price']/following-sibling::*/div/div/input")));
            pricebuy.sendKeys(Keys.CONTROL + "a");
            pricebuy.sendKeys(Keys.BACK_SPACE);
            try {
                // Wait for 0.5 seconds
                Thread.sleep(500);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            switch (stockpricebuy) {
                case "high" -> {
                    if (hightxt.equals("0")) {
                        pricebuy.sendKeys(llowtxt);
                    } else {
                        pricebuy.sendKeys(hightxt);
                    }
                }
                case "low" -> {
                    if (lowtxt.equals("0")) {
                        pricebuy.sendKeys(llowtxt);
                    } else {
                        pricebuy.sendKeys(lowtxt);
                    }
                }
                case "open" -> {
                    if (opentxt.equals("0")) {
                        pricebuy.sendKeys(llowtxt);
                    } else {
                        pricebuy.sendKeys(opentxt);
                    }
                }
                case "average" -> {
                    if (averagetxt.equals("0")) {
                        pricebuy.sendKeys(llowtxt);
                    } else {
                        pricebuy.sendKeys(averagetxt);
                    }
                }
                default -> pricebuy.sendKeys(stockpricebuy);
            }

            WebElement lotbuy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Lot']/following-sibling::*/div/div/input")));
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

            try {
                // Wait for 1 seconds
                Thread.sleep(1000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            WebElement value = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Value']/following-sibling::*")));
            String valuetxt = value.getText();
            WebElement buybtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'BUY') and contains(@style, 'text-align: center')]")));
            buybtn.click();
            List<WebElement> errorElements2 = driver.findElements(By.xpath("//*[text()='Error']"));
            if (!errorElements2.isEmpty()) {
                WebElement error = errorElements2.get(0);
                String txterror = error.getText();
                WebElement failElements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Error'][1]/following-sibling::*[1]")));
                String txtfail = failElements.getText();
                extentTest.log(Status.FAIL, txterror + " " + txtfail);
                System.out.println("FAIL " + stocknamebuy + "-----------" + txterror + " " + txtfail);
                WebElement okElements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Error'][1]/following-sibling::*[2]/div")));
                okElements.click();
                return;
            }

            WebElement sendthisorderyes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style, 'font-weight: normal;') and text()='OK']")));
            sendthisorderyes.click();
            WebElement ordersendyes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style, 'font-weight: normal;') and text()='OK']")));
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
            WebElement stocklot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderlot-0']")));
            String stocklottxt = stocklot.getText();
            WebElement orderprice1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderprice-0']")));
            String orderpricetxt = orderprice1.getText();
            if (text.contains("REJECTED")) {

                WebElement rejects = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='orderreject-0']")));
                String rejectstatus = rejects.getText();
                try {
                    // Wait for 2 seconds
                    Thread.sleep(1000);
                } catch (InterruptedException f) {
                    f.printStackTrace();
                    Thread.currentThread().interrupt();
                }

                extentTest.log(Status.FAIL, "Buy :" + stocknamebuy + " | Price : " + stockpricebuy + " " + orderpricetxt + " | Lot : " + stocklottxt + "|  Value :" + valuetxt + " ---------- " + text + " " + rejectstatus);

                System.out.println("STOCK BUY FAIL " + stocknamebuy + " | Price : " + stockpricebuy + " " + orderpricetxt + " | Lot : " + stocklottxt + " | Value :" + valuetxt + " ---------- " + text + " " + rejectstatus);
            } else {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", portp);
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", portp);
                try {
                    // Wait for 2 seconds
                    Thread.sleep(1000);
                } catch (InterruptedException f) {
                    f.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                String asset2 = asset.getText();
                try {
                    // Wait for 2 seconds
                    Thread.sleep(1000);
                } catch (InterruptedException f) {
                    f.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                extentTest.log(Status.PASS, "Buy : " + stocknamebuy + " | Price : " + stockpricebuy + " " + orderpricetxt + " | Lot : " + stocklottxt + " | Value :" + valuetxt + " --------- PASS | Status : " + text + "------ LIMIT Before :" + asset1 + "LIMIT Before :" + asset2);
                //   System.out.println("STOCK BUY PASS "+ stocknameresulttxt + " | Price : "+stockpricebuy +" "+ orderpricetxt + " | Lot : " + stocklottxt+" | Value :"+valuetxt + " --------- PASS | Status : " + text+"------ LIMIT Before :"+asset1+" LIMIT After :"+asset2);
                System.out.println("STOCK BUY PASS " + stocknamebuy + " | Price : " + stockpricebuy + orderpricetxt + " | Lot : " + stocklottxt + " | Value :" + valuetxt + " --------- PASS | Status : " + text + "------ LIMIT Before :" + asset1 + " LIMIT After :" + asset2);
            }

        }
    }


