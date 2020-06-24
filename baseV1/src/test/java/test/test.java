package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {
    public static void main(String[] arg) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedrivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement inputName = driver.findElement(By.id("name"));
        WebElement date = driver.findElement(By.id("date"));
        WebElement logo = driver.findElement(By.id("logo"));
        Actions actions = new Actions(driver);
        actions.moveToElement(inputName).contextClick()
                .moveToElement(date).click()
                .moveToElement(logo)
//        .build()
        .perform();

        Thread.sleep(10000);
        driver.quit();
    }
}
