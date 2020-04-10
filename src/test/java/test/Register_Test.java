package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Register_Page;

import static junit.framework.TestCase.assertEquals;

public class Register_Test {

    private WebDriver driver;
    private String url;
    Register_Page registerPage;
    String userName = "test003";
    String password = "123456";
    String confirmPassword ="123456";

    @Before
    public void setUp(){
        url = "http://newtours.demoaut.com/mercurywelcome.php";
        registerPage = new Register_Page(driver);
        driver = registerPage.chromeDriverConnection();
        driver.manage().window().maximize();
        registerPage.goTo(url);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testRegisterPOM() throws InterruptedException {
        registerPage.registerUser(userName,password,confirmPassword);
        assertEquals("Note: Your user name is " + userName + ".",registerPage.registerMessage());
    }
}

