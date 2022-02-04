package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    SelenideElement loginForm = $("#login_form");


    @Step
    public void loginFormIsVisible(){
        loginForm.shouldBe(Condition.visible);
    }

    @Step
    public void fillEmail(String email) {
        $("#id_login-username").setValue(email);
    }

    @Step
    public void fillPassword(String password) {
        $("#id_login-password").setValue(password);
    }

    @Step
    public void clickLogIn() {
        $("[name=\"login_submit\"]").click();
    }

    @Step
    public void fillEmailRegForm(String email) {
        $("#id_registration-email").setValue(email);
    }

    @Step
    public void fillPasswordRegForm(String password) {
        $("#id_registration-password1").setValue(password);
    }

    @Step
    public void confirmPasswordRegForm(String password) {
        $("#id_registration-password2").setValue(password);
    }

    @Step
    public void clickRegister() {
        $("[name=\"registration_submit\"]").click();
    }

    @Step
    public void messageIsDisplayed(String s) {
//        $(byText(s)).shouldBe(Condition.visible);
        $(".alert strong").shouldBe(Condition.visible).shouldHave(Condition.text(s));
    }

    @Step
    public void isItLoginPage() {
        Selenide.title().equals("http://selenium1py.pythonanywhere.com/en-gb/accounts/login/");
    }
}
