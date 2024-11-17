package com.example.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileActivity extends AppCompatActivity {
    Button button1,button2,button3,button4;
    TextView textView1;
    SharedPreferences sp;
    FileOutputStream outputStream;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_file);

        button1=findViewById(R.id.button_file1);
        button2=findViewById(R.id.button_file2);
        button3=findViewById(R.id.button_file3);
        button4=findViewById(R.id.button_file4);
        textView1=findViewById(R.id.textView_file1);

        sp=getSharedPreferences("chy", Context.MODE_PRIVATE);   //生成一个名称为chy的sp文件，仅供自己的app使用
//        SharedPreferences.Editor editor=getSharedPreferences("chy",Context.MODE_PRIVATE).edit();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sp.edit()                           //调用edit编辑器
                        .putString("name","chy")
                        .putString("key","123456")
                        .commit();
                Log.d("xr","Data saved:"+sp.getString("name","chy"));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText( sp.getString("name","123"));
            }
        });

        File file=new File("/data/data/com.example.myapplication/chyfile.txt");


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    outputStream=new FileOutputStream(file);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                try {
                    outputStream.write("hello".getBytes());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}