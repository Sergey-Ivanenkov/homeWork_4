package com.demoqa.pages.components;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class UploadComponent {
    public UploadComponent setUploadComponent(String value) {
        $("#uploadPicture").uploadFile(new File(value));

        return this;
    }
}
