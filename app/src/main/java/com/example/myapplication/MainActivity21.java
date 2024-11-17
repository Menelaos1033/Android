package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity21 extends AppCompatActivity {
    public MainActivity21() {
        super();
    }

    Button button21;
    TextView textView;
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("chy","Activity21:onStart...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("chy","Activity21:onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("chy","Activity21:onDestroy...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("chy","Activity21:onPause...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("chy","Activity21:OnResume...");
    }

    public MainActivity21(int contentLayoutId) {
        super(contentLayoutId);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("chy","Activity21:onRestart...");
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);
        Log.d("chy","Activity21:OnCreate...");

//        Context context=this;

//        button21=findViewById(R.id.button21);
/*
        Intent intent=new Intent(this,MainActivity21.class);

        button21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
*/
        textView=findViewById(R.id.textView2);

        Intent intent=getIntent();
        /*
        String str=intent.getStringExtra("name");
        int x=intent.getIntExtra("age",20);
         */

        Bundle bundle=intent.getExtras();
        String str2=bundle.getString("name")+"/"+bundle.getInt("age");

        textView.setText(str2);

    }

}
