package FluentAPI;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;


public class DemoqaPage extends DemoqaPageElements {
    private String _url;

    public DemoqaPage (String url)
    {
        super(url);
        _url = url;
    }
    @Step
    public DemoqaPage Navigate()
    {
        open(_url);
        return this;
    }
    @Step
    public DemoqaPage ClickToForms() {
        Forms().scrollTo();
        Forms().click();
        return this;
    }
    @Step
    public DemoqaPage ClickToPracticeForms() {
        PracticeForms().click();
        return this;
    }
    @Step
    public DemoqaPage FillFirstName(String firstname){
        FirstName().sendKeys(firstname);
        return this;
    }
    @Step
    public DemoqaPage FillLastName(String lastName){
        LastName().sendKeys(lastName);
        return this;
    }
    @Step
    public DemoqaPage FillGender(String gender){
        Gender(gender).click();
        return this;
    }
    @Step
    public DemoqaPage FillPhoneNumber(String phone){
        PhoneNumber().sendKeys(phone);
        return this;
    }
    @Step
    public DemoqaPage Submit(){
        SubmitButton().scrollTo();
        SubmitButton().click();
        return this;
    }
    @Step
    public DemoqaPage CheckMainText(String text){
        MainText().shouldHave(Condition.text(text));
        return this;
    }
    @Step("Check fullName with {0} and {1}")
    public DemoqaPage CheckStudentNameText(String firsName, String lastName){
        StudentNameText().shouldHave(Condition.text(firsName+" "+lastName));
        return this;
    }
    @Step
    public DemoqaPage CheckStudentGenderText(String gender){
        StudentGenderText().shouldHave(Condition.text(gender));
        return this;
    }
    @Step
    public DemoqaPage CheckStudentPhoneNumber(String phone){
        StudentPhoneNumberText().shouldHave(Condition.text(phone));
        return this;
    }
}
