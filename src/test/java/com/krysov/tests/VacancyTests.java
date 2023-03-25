package com.krysov.tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class VacancyTests extends TestBase {

    @DisplayName("Проверка заполнения формы с валидными данными")
    @Owner("Krysov")
    @Tag("PositiveFormTest")
    @Test
    void checkForm() {
        openPage.openPerformancePage();
        navigationPage.hoverMenu();
        navigationPage.clickCareerVacancy();
        navigationPage.searchVacancyClick();
        userDataPage.setName();
        userDataPage.setLastName();
        userDataPage.setEmail();
        userDataPage.setPhone();
        uploadData.uploadInputPage();
        checkPage.checkForm();
    }

    @DisplayName("Проверка заполнения формы с валидными, рандомными данными")
    @Owner("Krysov")
    @Tag("PositiveFormTest")
    @Test
    void checkFormWithRandomData() {
        openPage.openPerformancePage();
        navigationPage.hoverMenu();
        navigationPage.clickCareerVacancy();
        navigationPage.searchVacancyClick();
        randomData.setRandomName();
        randomData.setRandomLastName();
        randomData.setRandomPhone();
        randomData.setRandomEmail();
        uploadData.uploadInputPage();
        checkPage.checkForm();
    }

    @DisplayName("Проверка заполнения формы с пустым полем 'Имя'")
    @Owner("Krysov")
    @Tag("NegativeFormTest")
    @Test
    void checkFormWithoutName() {
        openPage.openPerformancePage();
        navigationPage.hoverMenu();
        navigationPage.clickCareerVacancy();
        navigationPage.searchVacancyClick();
        userDataPage.setLastName();
        userDataPage.setEmail();
        userDataPage.setPhone();
        uploadData.uploadInputPage();
        checkPage.checkForm();
    }

    @DisplayName("Проверка заполнения формы с пустым полем 'Номер телефона'")
    @Owner("Krysov")
    @Tag("NegativeFormTest")
    @Test
    void checkFormWithoutPhoneNumber() {
        openPage.openPerformancePage();
        navigationPage.hoverMenu();
        navigationPage.clickCareerVacancy();
        navigationPage.searchVacancyClick();
        userDataPage.setName();
        userDataPage.setLastName();
        userDataPage.setEmail();
        uploadData.uploadInputPage();
        checkPage.checkForm();
    }

    @DisplayName("Проверка заполнения формы с пустым полем 'Фамилия'")
    @Owner("Krysov")
    @Tag("NegativeFormTest")
    @Test
    void checkFormWithoutLastName() {
        openPage.openPerformancePage();
        navigationPage.hoverMenu();
        navigationPage.clickCareerVacancy();
        navigationPage.searchVacancyClick();
        userDataPage.setName();
        userDataPage.setPhone();
        userDataPage.setEmail();
        uploadData.uploadInputPage();
        checkPage.checkForm();
    }

    @DisplayName("Проверка заполнения формы с пустым полем 'Email'")
    @Owner("Krysov")
    @Tag("NegativeFormTest")
    @Test
    void checkFormWithoutEmail() {
        openPage.openPerformancePage();
        navigationPage.hoverMenu();
        navigationPage.clickCareerVacancy();
        navigationPage.searchVacancyClick();
        userDataPage.setName();
        userDataPage.setPhone();
        userDataPage.setLastName();
        uploadData.uploadInputPage();
        checkPage.checkForm();
    }
}
