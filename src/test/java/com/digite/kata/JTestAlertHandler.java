package com.digite.kata;

import com.digite.kata.tracker.AlertHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class JTestAlertHandler {
    @Test
    void testMobileGenerateAlert() {
        AlertHandler alerthandler = new AlertHandler();

        assertEquals("Mobile Alert", alerthandler.generateAlert("rainy") );
    }

    @Test
    void testEmailGenerateAlert() {
        AlertHandler alerthandler = new AlertHandler();

        assertEquals("Email Alert", alerthandler.generateAlert("sunny"));
    }
}
