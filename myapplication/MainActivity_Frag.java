package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity_Frag extends AppCompatActivity implements View.OnClickListener{
//public class MainActivity_Frag extends AppCompatActivity{
    Fragment fragment1,fragment2,fragment3,fragment4;

    FragmentManager manager;
    FragmentTransaction transaction;

    LinearLayout layout1,layout2,layout3,layout4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_frag);

        layout1 = findViewById(R.id.LinearLayout1);
        layout2 = findViewById(R.id.LinearLayout2);
        layout3 = findViewById(R.id.LinearLayout3);
        layout4 = findViewById(R.id.LinearLayout4);

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();

        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();

        initial();

        fragmentHide();

        transaction.show(fragment1);
        transaction.commit();

        layout1.setOnClickListener(this);
        layout2.setOnClickListener(this);
        layout3.setOnClickListener(this);
        layout4.setOnClickListener(this);

/*
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction= manager.beginTransaction();
                fragmentHide();
                transaction.show(fragment1);
                transaction.commit();
            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction= manager.beginTransaction();
                fragmentHide();
                transaction.show(fragment2);
                transaction.commit();
            }
        });
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction= manager.beginTransaction();
                fragmentHide();
                transaction.show(fragment3);
                transaction.commit();
            }
        });
        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction= manager.beginTransaction();
                fragmentHide();
                transaction.show(fragment4);
                transaction.commit();
            }
        });

    }
*/
    }

    private void initial(){
        transaction.add(R.id.framelayout,fragment1);
        transaction.add(R.id.framelayout,fragment2);
        transaction.add(R.id.framelayout,fragment3);
        transaction.add(R.id.framelayout,fragment4);
    }
    void fragmentHide()
    {
        transaction.hide(fragment1);
        transaction.hide(fragment2);
        transaction.hide(fragment3);
        transaction.hide(fragment4);
    }

    private void showfragment(Fragment fragment) {
        transaction= manager.beginTransaction();
        fragmentHide();
        transaction.show(fragment);
        transaction.commit();
    }
/*
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.LinarLayout1:{fragmentHide();showfragment(fragment1);}
            case R.id.LinarLayout2:{fragmentHide();showfragment(fragment2);}
            case R.id.LinarLayout3:{fragmentHide();showfragment(fragment3);}
            case R.id.LinarLayout4:{fragmentHide();showfragment(fragment4);}
            default:
            break;
        }
    }
*/

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.LinearLayout1)
            showfragment(fragment1);
        else if(v.getId()==R.id.LinearLayout2)
            showfragment(fragment2);
        else if(v.getId()==R.id.LinearLayout3)
            showfragment(fragment3);
        else if(v.getId()==R.id.LinearLayout4)
            showfragment(fragment4);
    }
}