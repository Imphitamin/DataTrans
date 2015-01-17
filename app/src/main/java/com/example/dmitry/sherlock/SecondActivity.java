package com.example.dmitry.sherlock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by Dmitry on 16.01.2015.GGWP
 */
public class SecondActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public final static String THIEF = "com.example.dmitry.sherlock.THIEF";

    public void onRadioClick(View v) {
        Intent answer_intent = new Intent();

        switch (v.getId()) {
            case R.id.radioPapa:
                answer_intent.putExtra(THIEF, "Папа");
                break;
            case R.id.radioMama:
                answer_intent.putExtra(THIEF, "Мама");
                break;
            case R.id.radioDanya:
                answer_intent.putExtra(THIEF, "Сам всё съел");
                break;

            default:
                break;

        }

        setResult(RESULT_OK, answer_intent);
        finish();
    }
}
