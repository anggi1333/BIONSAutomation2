import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    public static void  testScenariologin(WebDriver driver, ExtentTest extentTest  ,String SettingEnv, String Username, String Password, String Pin) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        if (SettingEnv.equals("DEV")) {
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
            WebElement devweb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div")));
            devweb.click();
            WebElement munitiyserver = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[4]/div[2]/div")));
            munitiyserver.click();
            WebElement devvpn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div")));
            devvpn.click();
            WebElement save = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div")));
            save.click();
            WebElement userid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div[1]/input")));
            userid.sendKeys(Username);
            WebElement pssword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[3]/div[2]/div[1]/input")));
            pssword.sendKeys(Password);
            WebElement pin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[4]/div[2]/div[1]/input")));
            pin.sendKeys(Pin);
            pin.sendKeys(Keys.ENTER);
            WebElement porto = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div/div/div[2]")));
            porto.click();
            if (porto.isDisplayed()) {
                extentTest.log(Status.PASS, "PASS: Berhasil Login");

            } else {
                extentTest.log(Status.FAIL, "FAIL: Gagal Login");
            }
        }
        else if (SettingEnv.equals("MOCK")) {
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
            WebElement qq  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div/div/div[2]/div/div/div/div/div/div")));
            qq.click();
            WebElement qq2  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[3]/div[2]/div")));
            qq2.click();
            WebElement custom  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[3]/div/div")));
            custom.click();
            WebElement txtcustom  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[3]/div[3]/div[2]/div/input")));
            txtcustom.clear();
            txtcustom.sendKeys("mock.bions.id");
            txtcustom.sendKeys(Keys.ENTER);
            WebElement muserver  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[4]/div[2]/div")));
            muserver.click();
            WebElement muservercustom = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[3]/div/div")));
            muservercustom.click();
            WebElement txtmuserver  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[4]/div[3]/div[2]/div/input")));
            txtmuserver.clear();
            txtmuserver.sendKeys("mock.bions.id");
            txtmuserver.sendKeys(Keys.ENTER);
            WebElement save  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div")));
            save.click();
            WebElement userid  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div[1]/input")));
            userid.sendKeys(Username);
            WebElement pssword  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[3]/div[2]/div[1]/input")));
            pssword.sendKeys(Password);
            WebElement pin  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[4]/div[2]/div[1]/input")));
            pin.sendKeys(Pin);
            pin.sendKeys(Keys.ENTER);
            WebElement porto  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div/div/div[2]")));
            porto.click();
            if (porto.isDisplayed()) {
                extentTest.log(Status.PASS, "PASS: Berhasil Login");

            } else {
                extentTest.log(Status.FAIL, "FAIL: Gagal Login");
            }
        } else {
            WebElement userid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div[1]/input")));
            userid.sendKeys(Username);
            WebElement pssword  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[3]/div[2]/div[1]/input")));
            pssword.sendKeys(Password);
            WebElement pin  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[4]/div[2]/div[1]/input")));
            pin.sendKeys(Pin);
            pin.sendKeys(Keys.ENTER);
            WebElement porto  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div/div/div[2]")));
            porto.click();
            if (porto.isDisplayed()) {
                extentTest.log(Status.PASS, "PASS: Berhasil Login");
            } else {
                extentTest.log(Status.FAIL, "FAIL: Gagal Login");
            }
        }

    }
}