package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {
        @BeforeAll
        static void setUp() {
            Configuration.browser = "Chrome";
            Configuration.browserSize = "1920х1080";
            Configuration.pageLoadStrategy = "eager";
        }
//        @BeforeEach
//        void beforeEach() {
//            SelenideLogger.addListener("allure", new AllureSelenide());
//        }
//
//        @AfterEach
//        void addAttachments() {
//            Attach.screenshotAs("Last Screen");
//        }
}