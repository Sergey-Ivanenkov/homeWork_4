package com.demoqa.pages;


import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PracticeFormPage {
    private final static String TITLE_TEXT = "Student Registration Form";

    private CalendarComponent calendarComponent = new CalendarComponent();
    private HobbiesComponent hobbiesComponent = new HobbiesComponent();
    private SujectsComponent sujectsComponent = new SujectsComponent();
    private UploadComponent uploadComponent = new UploadComponent();
    private StateAndCityComponent stateAndCityComponent = new StateAndCityComponent();
    private ResultsModal resultsModal = new ResultsModal();

    private SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            phoneNumberInput = $("#userNumber"),
            currentAddressInput = $("#currentAddress");

    public PracticeFormPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }

    public PracticeFormPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public PracticeFormPage clearFirstName(String value) {
        firstNameInput.clear();

        return this;
    }

    public PracticeFormPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public PracticeFormPage clearLastName(String value) {
        lastNameInput.clear();

        return this;
    }

    public PracticeFormPage setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }

    public PracticeFormPage clearEmail(String value) {
        emailInput.clear();

        return this;
    }

    public PracticeFormPage setGender(String value) {
        $("#genterWrapper").$(byText(value)).click();

        return this;
    }

    public PracticeFormPage setPhoneNumber(String value) {
        phoneNumberInput.setValue(value);

        return this;
    }

    public PracticeFormPage clearPhoneNumber(String value) {
        phoneNumberInput.clear();

        return this;
    }

    public PracticeFormPage setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public PracticeFormPage setSubjects(String value1, String value2) {
        sujectsComponent.setSubjects(value1, value2);

        return this;
    }

    public PracticeFormPage setHobbies(String value1, String value2, String value3) {
        hobbiesComponent.setHobbies(value1, value2, value3);

        return this;
    }

    public PracticeFormPage setUploadPicture(String value) {
        uploadComponent.setUploadComponent(value);


        return this;
    }

    public PracticeFormPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);

        return this;
    }

    public PracticeFormPage clearCurrentAddress(String value) {
        currentAddressInput.clear();

        return this;
    }

    public PracticeFormPage setStateAndCity(String State, String City) {
        stateAndCityComponent.setStateAndCity(State, City);

        return this;
    }


    public PracticeFormPage pressSubmit() {
        $("#submit").click();

        return this;
    }

    public PracticeFormPage checkResultsTableVisible() {
        resultsModal.checkVisible();

        return this;
    }


    public PracticeFormPage results(String key, String value) {
        resultsModal.results(key, value);

        return this;
    }
}


