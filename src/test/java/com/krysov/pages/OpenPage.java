package com.krysov.pages;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class OpenPage {

    private final String CompanyUrl = "https://www.performance-lab.ru/";

    public void openPerformancePage() {
        step("Открыть страницу", () ->
                open(CompanyUrl));
    }
}
