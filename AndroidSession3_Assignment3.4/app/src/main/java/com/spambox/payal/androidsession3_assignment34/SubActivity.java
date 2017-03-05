package com.spambox.payal.androidsession3_assignment34;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    String username;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        display = (TextView) findViewById(R.id.dName);
        Bundle extras = getIntent().getExtras();

        if (extras.containsKey("username")) {
           username = extras.getString("username");
        }
        display.setText("Hello " + username);
    }
}
