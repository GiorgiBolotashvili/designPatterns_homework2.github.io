package FluentAPI;

import com.codeborne.selenide.testng.SoftAsserts;
import io.qameta.allure.*;

import junit.framework.TestListener;
import junit.textui.TestRunner;
import org.testng.ITestListener;
import org.testng.TestListenerAdapter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Epic("Allure examples")
@Feature("selenide support")
@Listeners({SoftAsserts.class, TestLIstener.class})
public class FluentDemoqaTests extends ConfigurationClass {
    private DemoqaPage _demoqaPage;
    private String _name = "Gio";
    private String _lastName = "Bolota";
    private String _gender = "Male";
    private String _phone = "9995555999";
    private String _mainText = "Thanks for submitting the form";
    private String _url = "https://demoqa.com/";

    @Description("Assign a configuration ")
    @BeforeMethod
    public void Start(){
        _demoqaPage = new DemoqaPage(_url);
    }


    @Description("Running the main test")
    @Severity(SeverityLevel.NORMAL)
    @Story("Base support for annotations")
    @Test(invocationCount = 1)
    public void MainTest(){
        _demoqaPage
                .Navigate()
                .ClickToForms()
                .ClickToPracticeForms()
                .FillFirstName(_name)
                .FillLastName(_lastName)
                .FillGender(_gender)
                .FillPhoneNumber(_phone)
                .Submit()
                .CheckMainText(_mainText)
                .CheckStudentNameText(_name,_name)
                .CheckStudentGenderText(_gender)
                .CheckStudentPhoneNumber(_phone);
    }
}
