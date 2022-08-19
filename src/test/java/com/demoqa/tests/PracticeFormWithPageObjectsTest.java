package com.demoqa.tests;

import org.junit.jupiter.api.Test;

import static com.demoqa.tests.TestData.*;
import static java.lang.String.format;

public class PracticeFormWithPageObjectsTest extends TestBase {


    @Test
    void fillFromTest() {
        practiceFormPage.openPage()
                .setFirstName(firstName)
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

    }
}


