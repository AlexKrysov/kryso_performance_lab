package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class CheckPage {
    private SelenideElement
            conditions = $("#wpcf7-f11352-p4198-o3");

    public void checkForm() {
        step("Проверка формы 'Отклик на вакансию'(текста, чтоб не спамить)", () ->
                conditions.shouldHave(text("Нажимая \"Отправить\", вы соглашаетесь принять условия ")));
    }
}
