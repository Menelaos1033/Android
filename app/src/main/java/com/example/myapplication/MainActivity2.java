package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Context;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    public MainActivity2() {
        super();
    }

//    private launcher

    Button button21;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("chy","Activity2:onStart...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("chy","Activity2:onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("chy","Activity2:onDestroy...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("chy","Activity2:onPause...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("chy","Activity2:OnResume...");
    }

    public MainActivity2(int contentLayoutId) {
        super(contentLayoutId);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("chy","Activity2:onRestart...");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("chy", "Activity2:OnCreate...");

        Context context=this;
        button21=findViewById(R.id.button20);

//        someAvtivityResultLauncher = registerForActivityResult

        Intent intent=new Intent(this,MainActivity21.class);

        Bundle bundle=new Bundle();
        bundle.putString("name","chy");
        bundle.putInt("age",20);
        intent.putExtras(bundle);

        button21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }


        });

//        ActivityResultLauncher launcher=registerForActivityResult();

    }
}
