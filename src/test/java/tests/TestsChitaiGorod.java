package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class TestsChitaiGorod extends TestBase {
 @Test
 @Owner("Denis Nikitin | tg: nikk113")
 @Severity(SeverityLevel.NORMAL)
    void openTest() {
     open("https://www.chitai-gorod.ru/");
     $x("//*[@name='phrase']").setValue("Test");
 }

}
