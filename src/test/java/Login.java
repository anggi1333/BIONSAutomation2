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
            WebElement feedserver = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[3]/div[2]/div")));
            feedserver.click();
            WebElement custom1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[3]/div/div")));
            custom1.click();
            WebElement custom1txt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[3]/div[3]/div[2]/div/input")));
            custom1txt.clear();
            custom1txt.sendKeys("mock.bions.id");
//            WebElement devweb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div")));
//            devweb.click();
            WebElement munitiyserver = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[4]/div[2]/div")));
            munitiyserver.click();
            WebElement custom2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[3]/div/div")));
            custom2.click();
            WebElement custom2txt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[4]/div[3]/div[2]/div/input")));
            custom2txt.clear();
            custom2txt.sendKeys("mock.bions.id");
//            WebElement apiserverurl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[5]/div[2]/div[2]/div/input")));
//            apiserverurl.clear();
//            apiserverurl.sendKeys("apidev.bions.id");
//            WebElement devvpn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div")));
//            devvpn.click();

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
                Thread.sleep(5000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            try {
                // Wait for 1 seconds
                Thread.sleep(5000);
            } catch (InterruptedException f) {
                f.printStackTrace();
                Thread.currentThread().interrupt();
            }
            List<WebElement> tutorpuh = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div/div/div/div"));

//            List<WebElement> tutorpuh = driver.findElements(By.xpath("//*[text()='Hide Tutorial']"));
            if (!tutorpuh.isEmpty()) {
               // tutorpuh.get(0).click();
                WebElement g3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div[3]")));
                g3.click();
                WebElement setting2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Setting']")));
                setting2.click();
                WebElement fixed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Fixed']")));
                fixed.click();
                WebElement quicktour = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[4]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div/div[6]/div/div[2]/div/div/input")));
                quicktour.click();
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

        //kondisi jika gagal login


        List<WebElement> menuElements = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div/div/div[4]"));
        if (!menuElements.isEmpty()) {
        //    extentTest.log(Status.PASS, "LOGIN PASS USER :" + Username+ "----"+SettingEnv);
          //  System.out.println("LOGIN PASS USER : "+ Username+ "----"+SettingEnv);
        } else {
            extentTest.log(Status.FAIL,"ERROR LOGIN "+SettingEnv);
            System.out.println("ERROR LOGIN "+SettingEnv);
            driver.quit();
            System.exit(0);
        }

    }
}