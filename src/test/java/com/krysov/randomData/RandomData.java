package com.krysov.randomData;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class RandomData {

    public static Faker faker = new Faker();

    private SelenideElement
            firstName = $("[name='your-name']", 2),
            lastName = $("[name='your-surname']", 2),
            phone = $("[name='your-tel']", 2),
            email = $("[name='your-email']", 2);


    private String randomEmail = faker.internet().emailAddress();

    private String randomLastName = faker.name().lastName();
    private String randomName = faker.name().firstName();
    private String randomPhone = faker.phoneNumber().cellPhone();


    public void setRandomName() {
        step("Вводим рандомное имя", () -> {
            firstName.setValue(randomName);
        });
    }

    public void setRandomLastName() {
        step("Вводим рандомную фамилию", () -> {
            lastName.setValue(randomLastName);
        });
    }

    public void setRandomPhone() {
        step("Вводим рандомный номер телефона", () -> {
            phone.setValue("+7" + randomPhone);
        });
    }

    public void setRandomEmail() {
        step("Вводим рандомный адрес электронной почты", () -> {
            email.setValue(randomEmail);
        });
    }
}
