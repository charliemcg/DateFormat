package com.example.charl.dateformat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tv);

        int year = 2018;
        int month = 12;
        int day = 25;

        String locale = String.valueOf(Locale.getDefault());

        if(locale.equals("en_AS")
                || locale.equals("en_BM")
                || locale.equals("en_GU")
                || locale.equals("en_PH")
                || locale.equals("en_PR")
                || locale.equals("en_UM")
                || locale.equals("en_US")
                || locale.equals("en_VI")){
            tv.setText(month + "/" + day + "/" + year);
        }else{
            tv.setText(day + "/" + month + "/" + year);
        }

    }
}
