package com.example.mortgage_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    int intYears;
    float decMonthPay;
    int decprincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText MonthlyPayment = (EditText) findViewById(R.id.txtMonthlyPayment);
        final EditText years = (EditText) findViewById(R.id.txtYears);
        final EditText principal = (EditText) findViewById(R.id.txtPrincipal);
        Button button = (Button) findViewById(R.id.btnPayment);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decMonthPay = Float.parseFloat(MonthlyPayment.getText().toString());
                intYears = Integer.parseInt(years.getText().toString());
                decprincipal = Integer.parseInt(principal.getText().toString());
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putFloat("Key1", decMonthPay);
                editor.putInt("Key2", intYears);
                editor.putInt("Key3", decprincipal);
                editor.commit();
                startActivity(new Intent(MainActivity.this, Payment.class));
            }

        });
    }
}