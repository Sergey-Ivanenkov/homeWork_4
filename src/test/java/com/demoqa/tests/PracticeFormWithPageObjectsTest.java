package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.PracticeFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PracticeFormWithPageObjectsTest {
    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
    }

    @Test
    void fillFromTest() {
        practiceFormPage.openPage()
                .setFirstName("Sergey")
                .setLastName("Ivanenkov")
                .setEmail("ivanenkov@qa.guru")
                .setGender("Male")
                .setPhoneNumber("9067774133")
                .setBirthDate("16", "April", "1996")
                .setSubjects("Arts", "Hindi")
                .setHobbies("Sports", "Music", "") //Sports, Reading, Music
                .setUploadPicture("/Users/19635024/Downloads/2022-08-11 16.22.46.jpg")
                .setCurrentAddress("Moscow 33 str 12")
                .setStateAndCity("Haryana", "Karnal")
                .pressSubmit();


        practiceFormPage.checkResultsTableVisible()
                .checkResult("Student Name", "Sergey Ivanenkov")
                .checkResult("Student Email", "ivanenkov@qa.guru")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "9067774133")
                .checkResult("Date of Birth", "16 April,1996")
                .checkResult("Subjects", "Arts, Hindi")
                .checkResult("Hobbies", "Sports, Music")
                .checkResult("Picture", "2022-08-11 16.22.46.jpg")
                .checkResult("Address", "Moscow 33 str 12")
                .checkResult("State and City", "Haryana Karnal");
    }
}


