package com.demoqa.tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;

public class TestData {
    public static Faker faker = new Faker();
    public static String

            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = "Male",
            phoneNumber = faker.phoneNumber().subscriberNumber(10),
            birthDay = String.valueOf(faker.number().numberBetween(1, 28)),
            birthMonth = "April",
            birthYear = String.valueOf(faker.number().numberBetween(1991, 2014)),
            subjectsFirst = "Arts",
            subjectsSecond = "Hindi",
            hobbiesFirst = "Sports",
            hobbiesSecond = "Music",
            uploadPictureName = "Its fine.jpg",
            uploadPicturePath = "src/test/resources/" + uploadPictureName,
            currentAddress = faker.address().fullAddress(),
            state = "Haryana",
            city = "Karnal";

/*    static String firstName = "Sergey",
            lastName = "Ivanenkov",
            email = "ivanenkov@qa.guru",
            gender = "Male",
            phoneNumber = "9067773133",
            birthDay = "16",
            birthMonth = "April",
            birthYear = "1996",
            subjectsFirst = "Arts",
            subjectsSecond = "Hindi",
            hobbiesFirst = "Sports",
            hobbiesSecond = "Music",
            uploadPictureName = "2022-08-11 16.22.46.jpg",
            uploadPicturePath = "/Users/19635024/Downloads/" + uploadPictureName,
            currentAddress = "Moscow 33 str 12",
            state = "Haryana",
            city = "Karnal";*/

/*  public static String firstName,
     lastName,
     email,
     gender,
     phoneNumber,
     birthDay,
     birthMonth,
     birthYear,
     subjectsFirst,
     subjectsSecond,
     hobbiesFirst,
     hobbiesSecond,
     uploadPictureName,
     uploadPicturePath,
     currentAddress,
     state,
     city;

    @BeforeEach
    void prepareTextData() {
       static String firstName = "Sergey",
                lastName = "Ivanenkov",
                email = "ivanenkov@qa.guru",
                gender = "Male",
                phoneNumber = "9067773133",
                birthDay = "16",
                birthMonth = "April",
                birthYear = "1996",
                subjectsFirst = "Arts",
                subjectsSecond = "Hindi",
                hobbiesFirst = "Sports",
                hobbiesSecond = "Music",
                uploadPictureName = "2022-08-11 16.22.46.jpg",
                uploadPicturePath = "/Users/19635024/Downloads/" + uploadPictureName,
                currentAddress = "Moscow 33 str 12",
                state = "Haryana",
                city = "Karnal";
    }*/
}
