package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MusicActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
//        Log.d("chy","MusicActivity:OnCreate...");

        button1=findViewById(R.id.button_music1);

        button2=findViewById(R.id.button_music2);

        button3=findViewById(R.id.button_music3);


        Intent intent=new Intent(MusicActivity.this, MyService.class);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(intent);
            }
        });
    }
}

/*
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MusicActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    MyService myService;
    MyService.MyBinder binder;
    boolean isBound = false;

    private ServiceConnection connection = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName className, IBinder iBinder) {
            binder = (MyService.MyBinder) iBinder;
//            myService = binder.getService();
            binder.todo();
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName arg0) {
            isBound = false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        button1 = findViewById(R.id.button_music1);
        button2 = findViewById(R.id.button_music2);
        button3 = findViewById(R.id.button_music3);

        Intent intent = new Intent(this, MyService.class);
        bindService(intent, connection, Context.BIND_AUTO_CREATE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBound && myService != null) {
                    myService.playMusic();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myService.pauseMusic();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBound && myService != null) {
                    myService.stopMusic();
                }
                unbindService(connection);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (isBound) {
            unbindService(connection);
        }
    }
}
 */