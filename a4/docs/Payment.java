package com.example.mortgage_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        TextView monthlyPayment = (TextView) findViewById(R.id.txtMonthlyPayment);
        ImageView image = (ImageView) findViewById(R.id.imgYears);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        float decMonthPay = sharedPref.getFloat("Key1", 0);
        int intYears = sharedPref.getInt ("Key2", 0);
        int decprincipal = sharedPref.getInt("Key3", 0);
        int monthToyear = intYears * 12;
        double decMonthlyPayment = 0;

        decMonthlyPayment = ((decMonthPay * monthToyear) - decprincipal);
        DecimalFormat currency = new DecimalFormat("$###,###.##");
        monthlyPayment.setText("Total Interest Paid: " + currency.format(decMonthlyPayment));

        if (intYears == 10){
            image.setImageResource(R.drawable.pay);
        }
        else if (intYears == 20){
            image.setImageResource(R.drawable.pay);
        }
        else if (intYears == 30){
            image.setImageResource(R.drawable.pay);
        }
        else {
            monthlyPayment.setText("Enter 10, 20, or 30 years.");
        }
    }
}