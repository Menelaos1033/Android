package com.example.myapplication;
/*
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

//    private final IBinder binder = new MyBinder();
    MediaPlayer mediaPlayer;
    Context context;

    public MyService(){
        Log.d("chy", "MyService...");
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d("chy", "MyService onBind...");
        MyBinder binder=new MyBinder();
        return binder;
    }

    public class MyBinder extends Binder {

        public MyBinder(){
        }

        public void todo(){
            Log.d("chy", "MyService Mybinder.todo...");
            mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.music2);
//            mediaPlayer=MediaPlayer.create(context,R.raw.music1);
            mediaPlayer.start();
        }

        MyService getService() {
            return MyService.this;
        }

    }

    @Override
    public void onDestroy() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        super.onDestroy();
        Log.d("chy", "MyService onDestroy...");
    }


    public void playMusic() {
        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(this, R.raw.music3);
        }
        mediaPlayer.start();
    }

    public void stopMusic() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
    }

    public void pauseMusic()
    {
        if (mediaPlayer != null && mediaPlayer.isPlaying())
        {
            mediaPlayer.pause();
        }
    }
}

 */

/*
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

//              普通服务

public class MyService extends Service {
    MediaPlayer mediaPlayer;

    public MyService(){
    }

    @Override
    public void onCreate(){
        super.onCreate();
        Log.d("chy","MyService onCreate...");
        mediaPlayer=MediaPlayer.create(this,R.raw.music3);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("chy","MyService onStartCommand...");
        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        mediaPlayer.stop();
        super.onDestroy();
        Log.d("chy","MyService onDestroy...");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
*/


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    MediaPlayer mediaPlayer;

    public MyService(){
        Log.d("chy", "MyService...");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d("chy", "MyService onBind...");
        MyBinder binder=new MyBinder();
        return binder;
    }

    public class MyBinder extends Binder {
        public MyBinder(){
        }

        public void todo(){
            Log.d("chy", "MyService Mybinder.todo...");
            mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.music2);
            mediaPlayer.start();
        }

    }

    @Override
    public void onDestroy() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        if (mediaPlayer != null) {mediaPlayer.release();}
        super.onDestroy();
        Log.d("chy", "MyService onDestroy...");
    }
}

