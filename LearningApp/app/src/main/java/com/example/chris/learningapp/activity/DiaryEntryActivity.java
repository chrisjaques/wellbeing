package com.example.chris.learningapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chris.learningapp.R;

/**
 * Created by Chris on 12/08/16.
 */
public class DiaryEntryActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_entry);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("mood");
            String message = extras.getString("message");
            System.out.println("MOOD: " + value + " " + message);

            TextView textView = new TextView(this);
            textView.setTextSize(40);
            textView.setText(message);

            ViewGroup layout = (ViewGroup) findViewById(R.id.activity_diary_entry);
            layout.addView(textView);
        }
    }
}
