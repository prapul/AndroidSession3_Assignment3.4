package com.spambox.payal.androidsession3_assignment34;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name;
    EditText username;
    Button bLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.name);
        bLogin = (Button)findViewById(R.id.bLogin);
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = username.getText().toString();
                if(username!= null) {
                    Toast.makeText(getApplicationContext(), "Login Successful" ,Toast.LENGTH_SHORT);
                    Intent i = new Intent(MainActivity.this, SubActivity.class);
                    i.putExtra("username", name);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Login Unsuccessful" ,Toast.LENGTH_SHORT);
                }
            }
        });
    }
}
