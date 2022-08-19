package com.demoqa.pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SujectsComponent {
    public SujectsComponent setSubjects(String value1, String value2) {
        $("#subjectsInput").click();
        $("#subjectsInput").setValue(value1).pressEnter();
        $("#subjectsInput").setValue(value2).pressEnter();
        return this;
    }
}
