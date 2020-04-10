package base.pom.selenium;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Base {
    private WebDriver driver;
    private Actions actions;
    private WebDriverWait wait;
    public Base(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver,5);
        return driver;
    }

    public void moveToElement(By locator){
        actions.moveToElement(driver.findElement(locator))
        .perform();
    }

    public void changeTab(int indexTab){
        String[] browserTibSize = driver.getWindowHandles().toArray(new String[0]);
        driver.switchTo().window(browserTibSize[indexTab]);
    }

    public void alertAcept() {
        driver.switchTo().alert().accept();
    }

    public void alertDismiss() {
        driver.switchTo().alert().dismiss();
    }

    public String getAlertMessage() {
        return driver.switchTo().alert().getText();
    }

    public void jsClick(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",driver.findElement(locator));
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public void dragAndDropElement(By locatorDrag, By locatorDrop){
        actions.dragAndDrop(driver.findElement(locatorDrag),driver.findElement(locatorDrop))
                .perform();
    }

    public void datePicker(By locator, String date){
        driver.findElement(locator).sendKeys(date);
        driver.findElement(locator).sendKeys(Keys.RETURN);

    }

    public boolean waitElementVisible(By locator){
        boolean state;
        try{
            state = true;
            System.out.println("test "+ wait.until(ExpectedConditions.visibilityOfElementLocated(locator)));

        }catch (Exception e){
            System.out.println("Error: "+e);
             state = false;
        }
        return state;
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void click(WebElement element){
        element.click();
    }

    public Boolean isDisplayed(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    public void goTo(String url){
        driver.get(url);
    }


}
