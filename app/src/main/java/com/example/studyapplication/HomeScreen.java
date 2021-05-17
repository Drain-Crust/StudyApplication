package com.example.studyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button menu_button = (Button) findViewById(R.id.menu_button);
        menu_button.setTransformationMethod(null);
    }
    public void toMenuScreen (View aView){
        Intent intent = new Intent(this,MenuScreen.class);
        startActivity(intent);
    }
    public void toTaskScreen (View aView){
        Intent intent = new Intent(this,TaskScreen.class);
        startActivity(intent);
    }
    public void toPlantScreen (View aView){
        Intent intent = new Intent(this,PlantScreen.class);
        startActivity(intent);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}