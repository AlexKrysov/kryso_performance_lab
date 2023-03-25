package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class UploadData {

    private SelenideElement
            uploadInput = $("[name='your-resume']");

    public void uploadInputPage() {
        step("Загружаем резюме", () ->
                uploadInput.uploadFromClasspath("pdf/Krysov_QA_ENGINEER.pdf"));
    }
}
