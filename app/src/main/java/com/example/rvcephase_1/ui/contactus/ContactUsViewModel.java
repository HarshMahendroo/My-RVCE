package com.example.rvcephase_1.ui.contactus;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactUsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ContactUsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Contact Us fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}