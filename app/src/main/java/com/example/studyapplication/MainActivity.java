package com.example.studyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login_button = findViewById(R.id.login_button);
        login_button.setTransformationMethod(null);
    }

    public void toHomeScreen (View aView){
        Intent intent = new Intent(this,HomeScreen.class);
        EditText email = findViewById(R.id.emailAddressText);
        EditText password = findViewById(R.id.passwordText);
        String email_string = email.getText().toString();
        String password_string = password.getText().toString();
        switch (email_string){
            case "correct":
                System.out.println("correct email");
                switch (password_string){
                    case "correct":
                        System.out.print("correct password");
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        /*hello*/
                        break;
                    case "incorrect":
                        System.out.println("incorrect password");
                        break;
                }
                break;
            case "incorrect":
                System.out.println("incorrect email");
                break;
            default:
                System.out.println("didn't work");
        }
    }
}