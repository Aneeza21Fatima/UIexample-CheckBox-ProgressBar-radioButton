package com.example.uiexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox apple,orange, banana;
    RadioGroup gender;
    ProgressBar pbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apple=findViewById(R.id.apple);
        orange=findViewById(R.id.orange);
        banana=findViewById(R.id.banana);

        gender=findViewById(R.id.gender);

        pbar =findViewById(R.id.progressbar);

        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
              if(checkedId==R.id.male)  {
                  Toast.makeText(MainActivity.this,"Hey Handsome", Toast.LENGTH_SHORT).show();
                  pbar.setVisibility(View.VISIBLE);
              } else if (checkedId==R.id.female) {
                  Toast.makeText(MainActivity.this,"Hey Beautiful", Toast.LENGTH_SHORT).show();
                  pbar.setVisibility(View.GONE);
              }
              else{
                  Toast.makeText(MainActivity.this,"Hey you are Wonderful", Toast.LENGTH_SHORT).show();
              }
            }
        });


        apple.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "you like apple", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "You dont like apple", Toast.LENGTH_SHORT).show();
                }
            }
        });
        orange.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "You Like orange ", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"You don't like orange", Toast.LENGTH_SHORT).show();
                }
            }
        });
        banana.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this,"You Like Banana ", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"You Dont like Banana ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}