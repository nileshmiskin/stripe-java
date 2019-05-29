package com.stripe;

import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MyStripeTest {

    @Test
    public void testCharges(){
        Stripe.apiKey = "sk_test_7CTiDS47hsbqVCU50gZdwFrr";

        Map<String, Object> chargeMap = new HashMap<String, Object>();
        chargeMap.put("amount", 999);
        chargeMap.put("currency", "usd");
        chargeMap.put("description", "Example charge");
        chargeMap.put("source", "tok_visa"); // obtained via Stripe.js
        chargeMap.put("receipt_email", "25ae2a97be554c16e97ebc1e687f7558");

        try {
            Charge charge = Charge.create(chargeMap);
            System.out.println(charge);
        } catch (StripeException e) {
            e.printStackTrace();
        }
    }
}
