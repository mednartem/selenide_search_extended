package qa.guru.homework.tools_qa_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qa.guru.homework.pages.PracticeFormPage;

public class ToolsQATest extends TestBase {

    /**
     * Проверка успешности регистрации (успешна/неуспешна)
     * если успешна - видим модальное окно Thanks for submitting the form
     * заполняем только обязательные поля, остальное - значения по умолчанию
     * @throws InterruptedException
     */
    @Test
    public void studentRegistrationTest() throws InterruptedException {

        PracticeFormPage toolsQA = new PracticeFormPage();
        toolsQA.setValueOfElement(toolsQA.firstName, "123");
        toolsQA.setValueOfElement(toolsQA.lastName, "123");
        toolsQA.setValueOfElement(toolsQA.emailTextField, "123@gmail.com");
        toolsQA.clickElement(toolsQA.female);
        toolsQA.setValueOfElement(toolsQA.userNumber, "1111111111");
        toolsQA.clickElement(toolsQA.buttonSubmit);
        Assertions.assertTrue(toolsQA.thankYouWindow.exists());

    }

}
