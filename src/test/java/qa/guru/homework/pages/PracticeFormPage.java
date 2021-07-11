package qa.guru.homework.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PracticeFormPage extends BasePage {

    public PracticeFormPage() {
        super();
    }

    //имя
    public final SelenideElement firstName = $("#firstName");
    //фамилия
    public final SelenideElement lastName = $("#lastName");
    //поле для ввода email
    public final SelenideElement emailTextField = $("#userEmail");
    //пол
    public final SelenideElement female = $(".custom-radio:nth-child(2) > .custom-control-label");
    //Other
    public final SelenideElement userNumber = $("#userNumber");
    //кнопка для завершения регистрации
    public final SelenideElement buttonSubmit = $("#submit");
    //модальное окно Thanks for submitting the form
    public final SelenideElement thankYouWindow = $("#example-modal-sizes-title-lg");

}
