package com.demoqa.pages.components;

import com.demoqa.tests.TestData;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public CalendarComponent setDate(String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__day--0" + TestData.birthDay + ":not(.react-datepicker__day--outside-month)").click();

        return this;
    }
}
