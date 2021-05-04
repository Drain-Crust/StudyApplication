package com.example.studyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login_button = (Button) findViewById(R.id.login_button);
        login_button.setTransformationMethod(null);
    }
    public void toHomeScreen (View aView){
        Intent intent = new Intent(this,HomeScreen.class);
        startActivity(intent);
    }
}