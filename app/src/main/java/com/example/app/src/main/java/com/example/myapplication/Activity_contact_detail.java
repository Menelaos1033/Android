package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Activity_contact_detail extends AppCompatActivity {
    TextView textView1,textView2,textView3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_contact);

        textView1=findViewById(R.id.textView_contact_detail1);
        textView2=findViewById(R.id.textView_contact_detail2);
        textView3=findViewById(R.id.textView_contact_detail3);

        String str1= getIntent().getStringExtra("name");
        String str2= getIntent().getStringExtra("tel");
        String str3= getIntent().getStringExtra("city");
        textView1.setText(str1);
        textView2.setText(str2);
        textView3.setText(str3);
    }
}