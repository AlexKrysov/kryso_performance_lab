package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class NavigationPage {

    private SelenideElement
            hoverMenu = $("#menu-item-1619"),
            careerVacancy = $(".menu-item-has-children.menu-item-1153", 1).$(byText("Вакансии")),
            searchVacancy = $(".vacancy.single-page").$(byText("Тестировщик (QA Engineer)"));

    public void hoverMenu() {
        step("Наводим курсор на 'вакансии'", () -> {
            hoverMenu.hover();
        });
    }

    public void clickCareerVacancy() {
        step("Кликаем на 'Вакансии' в разделе 'Карьера в Перфоманс Лаб'", () -> {
            careerVacancy.click();
        });
    }

    public void searchVacancyClick() {
        step("Клик на 'Стажер - инженер по тестированию'", () -> {
            searchVacancy.click();
        });
    }
}
