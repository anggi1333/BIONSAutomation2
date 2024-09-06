import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Login {
    public static void  testScenariologin(WebDriver driver, ExtentTest extentTest  ,String SettingEnv, String Username, String Password, String Pin) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        if (SettingEnv.equals("DEV")) {
            //login ke Development
            WebElement setting = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='SETTING']")));
            setting.click();
            WebElement set2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Language']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/preceding-sibling::*/div")));
            int numClicks = 7;
            for (int i = 0; i < numClicks; i++) {
                set2.click();
                try {
                    Thread.sleep(100); // Wait for 0.1 second between clicks
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    try {
                        // Wait for 5 seconds
                        Thread.sleep(20000);
                    } catch (InterruptedException s) {
                        s.printStackTrace();
                    }
                }
            }
            WebElement set3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Ok']")));
            set3.click();

            WebElement set4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='DEV']")));
            set4.click();

            WebElement feedserver = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Feed Server']/following-sibling::div[1]")));
            feedserver.click(); try {
                Thread.sleep(100); // Wait for 0.1 second between clicks
            } catch (InterruptedException e) {
                e.printStackTrace();
                try {
                    // Wait for 5 seconds
                    Thread.sleep(2000);
                } catch (InterruptedException s) {
                    s.printStackTrace();
                }
            }
                    WebElement custom1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Dev (Web BO DEV)']/parent::*/parent::*/parent::*/parent::*/following-sibling::*/div/div")));
            custom1.click();
            try {
                Thread.sleep(100); // Wait for 0.1 second between clicks
            } catch (InterruptedException e) {
                e.printStackTrace();
                try {
                    // Wait for 5 seconds
                    Thread.sleep(2000);
                } catch (InterruptedException s) {
                    s.printStackTrace();
                }
            }
            WebElement custom1txt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Feed Server']/following-sibling::*[2]/div//input")));
            custom1txt.sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
            custom1txt.clear();
            try {
                Thread.sleep(100); // Wait for 0.1 second between clicks
            } catch (InterruptedException e) {
                e.printStackTrace();
                try {
                    // Wait for 5 seconds
                    Thread.sleep(2000);
                } catch (InterruptedException s) {
                    s.printStackTrace();
                }
            }
            custom1txt.sendKeys("appdeev.bions.id");

            List<WebElement> error = driver.findElements(By.xpath("//*[contains(text(), 'Invalid custom hostname. Please correct your server settings')]"));
            boolean iserrorDisplayed = error.stream().anyMatch(WebElement::isDisplayed);
            if (iserrorDisplayed){
                WebElement ok2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Ok')]")));
                ok2.click();
            }


            WebElement munitiyserver = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Mutual Unity Server']/following-sibling::div[1]")));
            munitiyserver.click();
            try {
                Thread.sleep(100); // Wait for 0.1 second between clicks
            } catch (InterruptedException e) {
                e.printStackTrace();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException s) {
                    s.printStackTrace();
                }
            }
            WebElement custom2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Dev (VPN)']/ancestor::*[4]/following-sibling::*//div/div")));
            custom2.click();
            WebElement custom2txt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Mutual Unity Server']/following-sibling::*[2]/div//input")));
            custom2txt.sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
            custom2txt.clear();try {
                Thread.sleep(100); // Wait for 0.1 second between clicks
            } catch (InterruptedException e) {
                e.printStackTrace();
                try {
                    // Wait for 5 seconds
                    Thread.sleep(2000);
                } catch (InterruptedException s) {
                    s.printStackTrace();
                }
            }

            custom2txt.sendKeys("appdeev.bions.id");


            WebElement save = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Save']")));
            save.click();
            WebElement userid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@autocomplete='username']")));
            userid.sendKeys(Username);
            WebElement pssword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
            pssword.sendKeys(Password);
            WebElement pin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='PIN']")));
            pin.sendKeys(Pin);
            pin.sendKeys(Keys.ENTER);
            try {
                // Wait for 1 seconds
                Thread.sleep(5000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }

            List<WebElement> tutor = driver.findElements(By.xpath("//*[text()='Hide Tutorial']"));
            List<WebElement> menu = driver.findElements(By.xpath("//*[@data-testid='main.menu.label']"));

            boolean istutorDisplayed = tutor.stream().anyMatch(WebElement::isDisplayed);
            boolean ismenuNotDisplayed = menu.stream().noneMatch(WebElement::isDisplayed);

            if (istutorDisplayed||
                    ismenuNotDisplayed) {
                WebElement g3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-testid='text-input-outlined']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div/following-sibling::*/following-sibling::*[@role='button']")));
                g3.click();
                WebElement setting2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Setting']")));
                setting2.click();
            try {
                // Wait for 1 seconds
                Thread.sleep(2000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
                WebElement fixed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Fixed']")));
                fixed.click();
                WebElement quicktour = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Quick Tour']/parent::*/parent::*/following-sibling::*//input[@type='checkbox']")));
                if (quicktour.isSelected()) {
                    quicktour.click();
                }
            }
            extentTest.log(Status.PASS, "LOGIN PASS USER :" + Username + "----DEV");
            System.out.println("LOGIN PASS USER : " + Username + "----DEV");}
        else if (SettingEnv.equals("MOCK")) {
            //login ke Mock Trading
            WebElement setting = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[4]/div[3]/div[5]/div/div")));
            setting.click();
            WebElement set2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/h1/div/span")));
            int numClicks = 7;
            for (int i = 0; i < numClicks; i++) {
                set2.click();
                try {
                    Thread.sleep(100); // Wait for 0.1 second between clicks
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    try {
                        // Wait for 5 seconds
                        Thread.sleep(20000);
                    } catch (InterruptedException s) {
                        s.printStackTrace();
                    }
                }
            }
            WebElement qq = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div/div/div[2]/div/div/div/div/div/div")));
            qq.click();
            WebElement qq2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[3]/div[2]/div")));
            qq2.click();
            WebElement custom = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[3]/div/div")));
            custom.click();
            WebElement txtcustom = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[3]/div[3]/div[2]/div/input")));
            txtcustom.clear();
            txtcustom.sendKeys("mock.bions.id");
            txtcustom.sendKeys(Keys.ENTER);
            WebElement save = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div")));
            save.click();
            WebElement userid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div[1]/input")));
            userid.sendKeys(Username);
            WebElement pssword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[3]/div[2]/div[1]/input")));
            pssword.sendKeys(Password);
            WebElement pin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[4]/div[2]/div[1]/input")));
            pin.sendKeys(Pin);
            pin.sendKeys(Keys.ENTER);
            try {
                // Wait for 1 seconds
                Thread.sleep(10000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }

            extentTest.log(Status.PASS, "LOGIN PASS USER :" + Username + "----MOCK");
            System.out.println("LOGIN PASS USER : " + Username + "----MOCK");}
        else {
            //login ke Production
            WebElement userid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div[1]/input")));
            userid.sendKeys(Username);
            WebElement pssword  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[3]/div[2]/div[1]/input")));
            pssword.sendKeys(Password);
            WebElement pin  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[4]/div[2]/div[1]/input")));
            pin.sendKeys(Pin);
            pin.sendKeys(Keys.ENTER);
            try {
                // Wait for 1 seconds
                Thread.sleep(10000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }

        }


        List<WebElement> menuElements = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div/div/div[4]"));
        if (!menuElements.isEmpty()) {
        //    extentTest.log(Status.PASS, "LOGIN PASS USER :" + Username+ "----"+SettingEnv);
          //  System.out.println("LOGIN PASS USER : "+ Username+ "----"+SettingEnv);
        } else {
//            extentTest.log(Status.FAIL,"ERROR LOGIN "+SettingEnv);
//            System.out.println("ERROR LOGIN "+SettingEnv);
//            driver.quit();
//            System.exit(0);
        }

    }
}