package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        List_IP mailservers = new List_IP();
        WriteToFile write = new WriteToFile();
        driver.get(mailservers.getnextIPscore());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement cucies = driver.findElement(By.cssSelector("#onetrust-close-btn-container"));
        cucies.click();
        WebElement digit = driver.findElement(By.cssSelector(".ss-score .ss-score__num"));
        System.out.println(digit.getText());
        write.writeData(digit.getText());

        for (int i = 1; i < mailservers.score_mail.size()  ; i++) {
            driver.get(mailservers.getnextIPscore());
            digit = driver.findElement(By.cssSelector(".ss-score .ss-score__num"));
            System.out.println( digit.getText());
            write.writeData(digit.getText());
            if (i==12){
                write.writeData("\n");
            }
        }
        write.writeData("-----------------------------------------");

        StringBuilder resRBL = new StringBuilder();
        int test2, test3, test4;
        for (int i = 0; i < mailservers.multirbl_mail.size(); i++) {
            driver.get(mailservers.getnextIPmultirbl());
            WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(100));
            driverWait.until(ExpectedConditions.textToBe(By.cssSelector(".global_data_processing_DNSBLBlacklistTest"),
                    "All done"));
            resRBL.append(driver.findElement(By.cssSelector(".global_data_cntBlacklisted_DNSBLBlacklistTest")).getText());
            test2 = Integer.parseInt(driver.findElement(By.cssSelector(".global_data_cntBlacklisted_DNSBLCombinedlistTest"
            )).getText());
            test3 = Integer.parseInt(driver.findElement(By.cssSelector(".global_data_cntBlacklisted_DNSBLWhitelistTest")).getText());
            test4 = Integer.parseInt(driver.findElement(By.cssSelector(
                    ".global_data_cntBlacklisted_DNSBLInformationallistTest")).getText());
            if (test2 != 0) {
                resRBL.append("/");
                resRBL.append(test2);
            }
            if (test3 != 0) {
                resRBL.append("/");
                resRBL.append(test3);
            }
            if (test4 != 0) {
                resRBL.append("/");
                resRBL.append(test4);
            }

            System.out.println(resRBL);
            write.writeData(resRBL.toString());
            resRBL.delete(0,resRBL.length());

            if (i==12){
                write.writeData("\n");
            }
        }

        driver.quit();


    }
}