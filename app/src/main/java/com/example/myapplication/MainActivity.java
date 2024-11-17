package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Button button1;
    CalendarView calendarView;
    TextView textView;
    RatingBar ratingBar;

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {    //bundle是java里的方法，用于做数据包裹
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.test);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.LinarLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Log.d("chy","Activity21:OnCreate...");

        //setContentView(R.layout.test);

        //button1=findViewById(R.id.button1);
        //calendarView=findViewById(R.id.calendarView);

        Context context=this;
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"",Toast.LENGTH_LONG).show();
            }
        });
/*
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                //textView.setText("i="+i+"/i1="+i1+"/i2="+i2);
            }
        });
*/


        ratingBar=findViewById(R.id.ratingBar);
        ratingBar.setNumStars(7);
        textView=findViewById(R.id.textView);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                //textView.setText(ratingBar.getRating());
            }
        });





    }
}




/*
public class MainActivity extends AppCompatActivity {

    Button button1=findViewById(R.id.button1);
    button1.setOnClickListener(new View.OnClickListener();{
        @Override
        public void OnClick(View view){
        Toast.makeText(context,"这是安卓课程。。。",Toast.LENGTH_LONG).show();  //整个标红表示无法识别this
        }
    });
}
*/