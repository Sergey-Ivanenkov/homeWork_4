package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PracticeFormTest {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
    }

    @Test
    @Disabled
    void fillFromTest() {
        open( "/automation-practice-form");
        $("#firstName").val("Sergey");
        $("#lastName").click();
        $("#lastName").val("Ivanenkov");
        $("#userEmail").click();
        $("#userEmail").val("ivanenkov@qa.guru");
        $("[for=gender-radio-1]").click();
        $("#userNumber").click();
        $("#userNumber").val("9067771134");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1996");
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__day--016").click();
        $("#subjectsInput").setValue("Arts").pressEnter();
        $("[for=hobbies-checkbox-1]").click();
        $("[for=hobbies-checkbox-2]").click();
        $("[for=hobbies-checkbox-3]").click();
        $("#uploadPicture").uploadFile(new File("/Users/19635024/Downloads/2022-08-11 16.22.46.jpg"));
        $("#currentAddress").click();
        $("#currentAddress").val("Moscow 101 dom 110");
        $("#state .css-1wa3eu0-placeholder").click();
        $("#react-select-3-option-1").click();
        $("#city .css-1wa3eu0-placeholder").click();
        $("#react-select-4-option-1").click();
        $("#submit").click();

        //Проверки заполнения
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Sergey Ivanenkov"));
        $(".table-responsive").shouldHave(text("ivanenkov@qa.guru"));
        $(".table-responsive").shouldHave(text("Male"));
        $(".table-responsive").shouldHave(text("9067771134"));
        $(".table-responsive").shouldHave(text("16 May,1996"));
        $(".table-responsive").shouldHave(text("Arts"));
        $(".table-responsive").shouldHave(text("Sports, Reading, Music"));
        $(".table-responsive").shouldHave(text("2022-08-11 16.22.46.jpg"));
        $(".table-responsive").shouldHave(text("Moscow 101 dom 110"));
        $(".table-responsive").shouldHave(text("Uttar Pradesh Lucknow"));
    }
}


