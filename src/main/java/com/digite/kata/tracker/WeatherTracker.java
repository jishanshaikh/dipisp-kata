package com.digite.kata.tracker;

import com.digite.kata.tracker.Emailer;
import com.digite.kata.tracker.Phone;

public class WeatherTracker {
    String currentConditions;

    public WeatherTracker() {

    }

    public void changeWeatherCondition(String weatherDescription, AlertHandler alerthandler) {
        setCurrentConditions(weatherDescription);
        alerthandler.generateAlert(weatherDescription);
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
    }
}
