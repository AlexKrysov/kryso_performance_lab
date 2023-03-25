package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class UserDataPage {

    private SelenideElement
            firstName = $("[name='your-name']", 2),
            lastName = $("[name='your-surname']", 2),
            phone = $("[name='your-tel']", 2),
            email = $("[name='your-email']", 2);

    private String nameData = "Алексей";
    private String lastNameData = "Крысов";
    private String phoneData = "+79609898725";
    private String emailData = "krysov-95@mail.ru";


    public void setName() {
        step("Вводим имя", () -> {
            firstName.setValue(nameData);
        });
    }

    public void setLastName() {
        step("Вводим фамилию", () -> {
            lastName.setValue(lastNameData);
        });
    }

    public void setPhone() {
        step("Вводим номер телефона", () -> {
            phone.setValue(phoneData);
        });
    }

    public void setEmail() {
        step("Вводим почту", () -> {
            email.setValue(emailData);
        });
    }
}
