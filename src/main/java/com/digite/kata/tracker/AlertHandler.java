package com.digite.kata.tracker;

public class AlertHandler {
    public String generateAlert(String weather) {
        if (weather == "rainy") {
            Phone phone = new Phone();
            String alert = phone.generateWeatherAlert(weather);
            return "Mobile Alert";
        } else if (weather == "sunny") {
            Emailer emailer = new Emailer();
            String alert = emailer.generateWeatherAlert(weather);
            return "Email Alert";
        }

        return "no alert";
    }
}
