package test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Formy_Page;

public class Formy_Test {
    private WebDriver driver;
    private String url;

    Formy_Page FormyScrollElementPage;

    @Before
    public void setUp(){
        FormyScrollElementPage = new Formy_Page(driver);
        driver = FormyScrollElementPage.chromeDriverConnection();
        driver.manage().window().maximize();
//        url = "https://formy-project.herokuapp.com/switch-window";
//        FormyScrollElementPage.goTo(url);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

//    @Test
//    public void scrollToElement() throws InterruptedException {
//        url = "https://formy-project.herokuapp.com/scroll";
//        FormyScrollElementPage.goTo(url);
//        FormyScrollElementPage.moveToFullName();
//        Thread.sleep(2000);
//    }

//    @Test
//    public void switchToActiveWindow() throws InterruptedException {
//        url = "https://formy-project.herokuapp.com/switch-window";
//        FormyScrollElementPage.goTo(url);
//        FormyScrollElementPage.openNewTab();
//        Thread.sleep(2000);
//        FormyScrollElementPage.changeBrowserTab(0);
//        Thread.sleep(2000);
//    }

//    @Test
//    public void alert() throws InterruptedException {
//        url = "https://formy-project.herokuapp.com/switch-window";
//        FormyScrollElementPage.goTo(url);
//        FormyScrollElementPage.openAlert();
//        Thread.sleep(2000);
//        String message = FormyScrollElementPage.alertMessage();
//        System.out.println(message);
//        FormyScrollElementPage.acceptAlert();
//        Thread.sleep(2000);
//        FormyScrollElementPage.openAlert();
//        Thread.sleep(2000);
//        message = FormyScrollElementPage.alertMessage();
//        System.out.println(message);
//        FormyScrollElementPage.cancelAlert();
//        Thread.sleep(2000);
//
//    }

//    @Test
//    public void modal() throws InterruptedException {
//        url = "https://formy-project.herokuapp.com/modal";
//        FormyScrollElementPage.goTo(url);
//        FormyScrollElementPage.openModal();
//        Thread.sleep(2000);
//        FormyScrollElementPage.closeModal();
//        Thread.sleep(2000);
//        FormyScrollElementPage.openModal();
//        Thread.sleep(2000);
//        FormyScrollElementPage.closeModal2();
//        Thread.sleep(2000);
//
//    }

//    @Test
//    public void dragDrop() throws InterruptedException {
//        url = "https://formy-project.herokuapp.com/dragdrop";
//        FormyScrollElementPage.goTo(url);
//        Thread.sleep(2000);
//        FormyScrollElementPage.dragAndDropImage();
//        Thread.sleep(2000);
//
//    }

//    @Test
//    public void datePicker() throws InterruptedException {
//        url = "https://formy-project.herokuapp.com/datepicker";
//        FormyScrollElementPage.goTo(url);
//        Thread.sleep(2000);
//        FormyScrollElementPage.datePick("03/03/2020");
//        Thread.sleep(2000);
//
//    }

    @Test
    public void explicitWait() throws InterruptedException {
        url = "https://formy-project.herokuapp.com/datepicker";
        FormyScrollElementPage.goTo(url);
        FormyScrollElementPage.datePick2("03/03/2020");
        Thread.sleep(2000);

    }
}
