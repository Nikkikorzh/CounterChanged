package com.example.homework1;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MainViewModel extends ViewModel {

    public int count = 0;

    public String countEmpty = "empty";
    public String name ="Добро пожаловать, Anonymous!";

    public String getName() {
        return name;
    }

    public boolean checkZero() {
        if (count == 0) {
            return true;
        }
        else
            return false;
    }
    public String getEmpty() {
        return countEmpty;
    }
    public void setName(String text) {
        name = text;
    }
    public int getClicks() {
        return count;
    }

    public void setClicks() {
        count++;
    }
}
