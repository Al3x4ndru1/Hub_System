package com.example.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;


public class MainActivity extends AppCompatActivity {
    private TextInputLayout text;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);

       handler.postDelayed(new Runnable() {
           @Override
           public void run() {
               setContentView(R.layout.firstlayout);

           }
       },0);



        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.login_layout);

            }
        },7000);



    }

    public void userlayout(View view){
        setContentView(R.layout.user_activity_layout);

    }

    public void activityAfterLogIn(View view){
        setContentView(R.layout.activity_main);
    }

    public void registration(View view){
        setContentView(R.layout.register_layout);
    }

    public void text(View view) {
        setContentView(R.layout.talking);
        /*
        String getEditText = text.getEditText().getText().toString();
        Log.d("Edit Text", getEditText);
        System.out.println(getEditText);
        //ai.aici(text.getEditText().getText().toString(), view);
        text= findViewById(R.id.textInputEditText);
         */
    }

    public void chat(View view){
        setContentView(R.layout.chat_layout);
    }

    public void profesional(View view){
        setContentView(R.layout.profesional);
    }

    public void talk(View view){
        setContentView(R.layout.talking);
    }

}
