package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.pom.selenium.Base;
import org.openqa.selenium.WebElement;

public class Formy_Page extends Base {
    By fullNameInput = By.id("name");
    By newTab = By.id("new-tab-button");
    By alertBtn = By.id("alert-button");
    By modalBtn = By.id("modal-button");
    By closeModalBtn = By.id("close-button");
    By dragImage = By.id("image");
    By dropBox = By.id("box");
    By dateInput = By.id("datepicker");
    By dateInput2 = By.id("datepicker2");

    public Formy_Page(WebDriver driver){
        super(driver);
    }

    public void moveToFullName(){
        moveToElement(fullNameInput);
    }
    public void openNewTab(){
        click(newTab);
    }

    public void openAlert(){
        click(alertBtn);
    }
    public void changeBrowserTab(int index){
        changeTab(index);
    }
    public void acceptAlert()  {
        alertAcept();
    }
    public void cancelAlert()  {
        alertDismiss();
    }
    public String alertMessage()  {
        return getAlertMessage();
    }

    public void openModal() {
        click(modalBtn);
    }

    public void closeModal() {
        click(closeModalBtn);
    }

    public void closeModal2() {
        jsClick(closeModalBtn);
    }

    public void dragAndDropImage() {
        dragAndDropElement(dragImage,dropBox);
    }

    public void datePick(String date) {
        datePicker(dateInput,date);
    }
    public void datePick2(String date) {
        System.out.println("hi "+ waitElementVisible(dateInput));
        datePicker(dateInput,date);
    }


}

