package com.example.chris.learningapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.chris.learningapp.R;

/**
 * Created by Chris on 12/08/16.
 */
public class RoleSelectActivity extends Activity{

    private Button btnLinkToMoodEntry;

    protected void onCreate(Bundle savedInstanceState) {

        //btnLinkToMoodEntry = (Button) findViewById(R.id.button);
        //System.out.println("you killed kenny you fuck" + btnLinkToMoodEntry.toString());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_select);
    }
        // Link to Register Screen
        /*btnLinkToMoodEntry.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        MoodEntryActivity.class);
                startActivity(i);
                finish();

            }
        });*/
        public void moodEntry(View view){
            Intent i = new Intent(getApplicationContext(),
                MoodEntryActivity.class);
            startActivity(i);
            finish();
        }
    }


