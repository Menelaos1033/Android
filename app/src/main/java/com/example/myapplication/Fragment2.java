package com.example.myapplication;
/*
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Bundle;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.example.myapplication.Adapter;

public class Fragment2 extends Fragment {

    private RecyclerView recyclerView;
    private List<String> list;
    private int i;
    private Context context;
    private Adapter adapter;
    List<Map<String,Object>> list1;
    private ActivityResultLauncher<Intent> launcher;

    MyService.MyBinder mybinder;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.activity_main3, container, false) ;

        context = getContext();

        recyclerView= view.findViewById(R.id.RecyclerView);

        int[] phonename= {R.drawable.me1,R.drawable.me1,R.drawable.me1};
        String[] price={"1000","2000","3000"};
        String[] config={"qqq","www","eee"};

        list1=new ArrayList<>();

        for (i=0;i< phonename.length;i++)
        {
            Map<String,Object> map = new HashMap<>();
            map.put("name",phonename[i]);
            map.put("price",price[i]);
            map.put("config",config[i]);
            list1.add(map);
        }

        adapter=new Adapter(context,list1,launcher);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(manager);

        Intent intent=new Intent(context,MyService.class);

//        context.startService(intent);
        ServiceConnection connection = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder iBinder) {
                mybinder=(MyService.MyBinder) iBinder;
                mybinder.todo();
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {
                mybinder=null;
            }
        };

        context.bindService(intent,connection,Context.BIND_AUTO_CREATE);

//        context.unbindService(connection);

        return view;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        // 注册ActivityResultLauncher
        launcher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == 666) {
                            String str1 = result.getData().getStringExtra("result1");
                            // 这里可以根据需要处理获取到的结果，比如更新UI等
                        }
                    }
                }
        );
    }

    public ActivityResultLauncher<Intent> getLauncher() {
        return launcher;
    }

}

 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Fragment2 extends Fragment {

    private RecyclerView recyclerView;
    private List<String> list;
    private int i;
    private Context context;
    private Adapter adapter;
    List<Map<String,Object>> list1;
    private ActivityResultLauncher<Intent> launcher;

    MyService.MyBinder mybinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.activity_rc, container, false) ;

        context = getContext();

        recyclerView= view.findViewById(R.id.RecyclerView);

        int[] photo= {R.drawable.contact1,R.drawable.contact2,R.drawable.contact3,R.drawable.contact4};

        String[] name={"Mike","Andy","David","Frank"};
        String[] tel={"111222333","222333444","444555666","666777888"};
        String[] city={"NewYork","Washington","Manchester","Colombia"};

        list1=new ArrayList<>();

        for (i=0;i< photo.length;i++)
        {
            Map<String,Object> map = new HashMap<>();
            map.put("photo",photo[i]);
            map.put("name",name[i]);
            map.put("tel",tel[i]);
            map.put("city",city[i]);
            list1.add(map);
        }

        adapter=new Adapter(context,list1,launcher);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(manager);

        Intent intent=new Intent(context,MyService.class);

        ServiceConnection connection = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder iBinder) {
                mybinder=(MyService.MyBinder) iBinder;
                mybinder.todo();
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {
                mybinder=null;
            }


        };

        context.bindService(intent,connection,Context.BIND_AUTO_CREATE);

        return view;

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        launcher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == 666) {
                            String str1 = result.getData().getStringExtra("result1");
                        }
                    }
                }
        );
    }

    public ActivityResultLauncher<Intent> getLauncher() {
        return launcher;
    }

}
