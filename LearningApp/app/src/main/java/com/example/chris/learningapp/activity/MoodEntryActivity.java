package com.example.chris.learningapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.chris.learningapp.R;

public class MoodEntryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_entry);
    }

    public void moodToDiary(View view) {

        String moodSelected = "0";
        String message = "Great!";

        switch (view.getId()) {
            case R.id.Mood1Button:
                moodSelected = "1";
                message = "Glad you're happy";
                break;
            case R.id.Mood2Button:
                moodSelected = "2";
                message = "Keep it up..";
                break;
            case R.id.Mood3Button:
                moodSelected = "3";
                message = "Sorry that you're not feeling great, like to write it down?";
                break;
            case R.id.Mood4Button:
                moodSelected = "4";
                message = ":( :( :(";
                break;
            default:
                System.out.println("DEFAULT");
                break;
        }

        if(!moodSelected.equals("0")){
            //store mood in user's db
        }

        Intent intent = new Intent(this, DiaryEntryActivity.class);
        intent.putExtra("mood", moodSelected);
        intent.putExtra("message", message);
        startActivity(intent);
    }
}
