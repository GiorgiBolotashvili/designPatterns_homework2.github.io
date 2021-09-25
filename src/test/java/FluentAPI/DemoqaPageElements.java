package FluentAPI;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

import static com.codeborne.selenide.Selenide.$;

public class DemoqaPageElements {

    public DemoqaPageElements(String url){
        open(url);
    }
    @Step
    public SelenideElement Forms(){
        return $("#app > div > div > div.home-body > div > div:nth-child(2)");
    }
    @Step
    public SelenideElement PracticeForms(){
        return $(By.xpath("//div[@class='element-list collapse show']"));
    }
    @Step
    public SelenideElement FirstName(){
        return $("#firstName");
    }
    @Step
    public SelenideElement LastName(){
        return $("#lastName");
    }
    @Step
    public SelenideElement Gender(String gender){
        ElementsCollection genders = $("#genterWrapper > div.col-md-9.col-sm-12").findAll("#genterWrapper > div.col-md-9.col-sm-12 > div > label");
        for (SelenideElement g : genders)
        {
            if (g.getText().equals(gender))
            {
                return g;
            }
        }
        return null;
    }
    @Step
    public SelenideElement PhoneNumber(){
        return $("#userNumber");
    }
    @Step
    public SelenideElement SubmitButton(){
        return $("#submit");
    }
    @Step
    public SelenideElement MainText(){
        return $("#example-modal-sizes-title-lg");
    }
    @Step
    public  SelenideElement StudentNameText(){
        return  $("body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(1) > td:nth-child(2)");
    }
    @Step
    public SelenideElement StudentGenderText(){
        return  $("body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(3) > td:nth-child(2)");
    }
    @Step
    public SelenideElement StudentPhoneNumberText(){
        return $("body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(4) > td:nth-child(2)");
    }
}
