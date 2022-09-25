package com.demoqa.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.demoqa.tests.TestData.*;
import static io.qameta.allure.Allure.step;
import static java.lang.String.format;

public class PracticeFormWithPageObjectsTest extends TestBase {

    @Test
    @Tag("properties")
    @DisplayName("Проверка формы регистрации")
    void fillFromTest() {
        step("Открываем форму регистрации", () -> {
            practiceFormPage.openPage();
        });

        step("Заполняем форму", () -> {
            practiceFormPage.setFirstName(firstName)
                    .setLastName(lastName)
                    .setEmail(email)
                    .setGender(gender)
                    .setPhoneNumber(phoneNumber)
                    .setBirthDate(birthDay, birthMonth, birthYear)
                    .setSubjects(subjectsFirst, subjectsSecond)
                    .setHobbies(hobbiesFirst, hobbiesSecond, "") //Sports, Reading, Music
                    .setUploadPicture(uploadPicturePath)
                    .setCurrentAddress(currentAddress)
                    .setStateAndCity(state, city)
                    .pressSubmit();
        });

        step("Проверяем результат", () -> {
            practiceFormPage.checkResultsTableVisible()
                    .results("Student Name", format("%s %s", firstName, lastName))
                    .results("Student Email", email)
                    .results("Gender", gender)
                    .results("Mobile", phoneNumber)
                    .results("Date of Birth", format("%s %s,%s", birthDay, birthMonth, birthYear))
                    .results("Subjects", format("%s, %s", subjectsFirst, subjectsSecond))
                    .results("Hobbies", format("%s, %s", hobbiesFirst, hobbiesSecond))
                    .results("Picture", uploadPictureName)
                    .results("Address", currentAddress)
                    .results("State and City", format("%s %s", state, city));
        });
    }
}


