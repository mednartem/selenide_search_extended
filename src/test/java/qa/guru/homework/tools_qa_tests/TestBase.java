package qa.guru.homework.tools_qa_tests;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class TestBase {

    private static final String BaseUrl = System.getenv("BASE_URL");

    @BeforeEach
    public void setup(){
        open(BaseUrl);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterEach
    public void after(){
        clearBrowserCache();
        closeWebDriver();
    }

}
