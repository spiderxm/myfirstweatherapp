package com.example.myfirstweatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mWheatherTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWheatherTextView=(TextView)findViewById(R.id.tv_weather_data);
        String[] dummyWeatherData={
                "Today, MAy 17 - clear - 17c/15.c",
        };

        for(String dummyWeatherDay:dummyWeatherData)
        {
            mWheatherTextView.append(dummyWeatherDay+"\n\n\n");
        }
    }
}
