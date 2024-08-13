package tests;

import com.codeborne.selenide.SelenideElement;
import dev.failsafe.internal.util.Assert;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsChitaiGorod extends TestBase {
 @Test
 @Owner("Denis Nikitin | tg: nikk113")
 @Severity(SeverityLevel.NORMAL)
    void openTest() {
     open("https://www.chitai-gorod.ru/");
     $x("//*[@name='phrase']").setValue("Test");
 }

 @Test
 // Тест кейс на добавление одной книги в корзину и сравнение цены книги и итоговой суммы
 public void addToCard() {
  open("https://www.chitai-gorod.ru/");
  $(".header-search__input").setValue("Анна Каренина").pressEnter();
  $(".cookie-notice").shouldBe(visible);
  executeJavaScript("document.getElementsByClassName('cookie-notice')[0].style.display = 'none'");
  $(".popmechanic-js-wrapper").shouldBe(visible);
  executeJavaScript("document.getElementsByClassName('popmechanic-js-wrapper')[0].style.display = 'none'");
  $$(".products-list").first()
          .$(".product-buttons")
          .$(".button").hover().click();
  $(".header-cart").click();
  String FirstPrice = $(".product-price__value").getText();
  String SummaryPrice = $(".cart-sidebar__info-summary").$(".info-item__value").getText();
  assertEquals(FirstPrice, SummaryPrice);
 }

 @Test
 void turnToPageTwo () {
   open("https://www.chitai-gorod.ru/");
   $x("//*[@name='phrase']").setValue("java").pressEnter();
     sleep(3000);
     executeJavaScript("document.getElementsByClassName('cookie-notice')[0].style.display = 'none'");
     executeJavaScript("document.getElementsByClassName('popmechanic-js-wrapper')[0].style.display = 'none'");
   $(By.cssSelector(".pagination__button[href='/search?page=2']")).shouldBe(visible).hover().click();
   sleep(3000);
 }
}