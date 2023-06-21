import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    public static void testScenariologin(WebDriver driver, ExtentTest extentTest ,String Username, String Password, String Pin) {


        try {
            // Wait for 5 seconds
            Thread.sleep(5000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement setting = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[4]/div[3]/div[5]/div/div"));
        setting.click();
        WebElement set2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/h1/div/span"));
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
        WebElement qq = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div/div/div[2]/div/div/div/div/div/div"));
        qq.click();
        WebElement feedserver = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[3]/div[2]/div"));
        feedserver.click();
        WebElement devweb = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div"));
        devweb.click();
        WebElement munitiyserver = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[4]/div[2]/div"));
        munitiyserver.click();
        WebElement devvpn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div"));
        devvpn.click();
        WebElement save = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div"));
        save.click();
        WebElement userid = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div[1]/input"));
        userid.sendKeys(Username);
        WebElement pssword = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[3]/div[2]/div[1]/input"));
        pssword.sendKeys(Password);
        WebElement pin = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[1]/div[4]/div[2]/div[1]/input"));
        pin.sendKeys(Pin);
        pin.sendKeys(Keys.ENTER);
        try {
            // Wait for 5 seconds
            Thread.sleep(5000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement porto = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div/div/div[2]"));

        porto.click();
        if (porto.isDisplayed()) {
            extentTest.log(Status.PASS, "PASS: Berhasil Login");

        } else {
            extentTest.log(Status.FAIL, "FAIL: Gagal Login");
        }

    }
}
