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
 @Test
 void addToCard () {
  open("https://www.chitai-gorod.ru/");
  $(".header-search__input").setValue("Анна Каренина").pressEnter();
  sleep(3000);
  executeJavaScript("document.getElementsByClassName('cookie-notice')[0].style.display = 'none'");
  executeJavaScript("document.getElementsByClassName('popmechanic-js-wrapper')[0].style.display = 'none'");
  $$(".products-list").first()
          .$(".product-buttons")
          .$(".button").click();
  $(".header-cart__icon").click();
  sleep(10000);
 }
}
