package com.wimonsiri.radiobutton2app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioButton redRadio , greenRadio , blueRadio , whiteRadio ;
    private RadioGroup radioGroup;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redRadio = (RadioButton) findViewById(R.id.redRadio);
        greenRadio = (RadioButton) findViewById(R.id.greenRadio);
        blueRadio = (RadioButton) findViewById(R.id.blueRadio);
        whiteRadio = (RadioButton) findViewById(R.id.whiteRadio);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

        radioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group , int checkedId) {
        if (checkedId == R.id.redRadio){
            linearLayout.setBackgroundColor(Color.RED);
        }
        else if (checkedId == R.id.greenRadio){
            linearLayout.setBackgroundColor(Color.GREEN);
        }
        else if (checkedId == R.id.blueRadio){
            linearLayout.setBackgroundColor(Color.BLUE);
        }
        else if (checkedId == R.id.whiteRadio){
            linearLayout.setBackgroundColor(Color.WHITE);
        }
    }
}