package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity3 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<String> list;
    private int i;
    private Context context;
    private Adapter adapter;
    List<Map<String,Object>> list1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rc);

        Context context=this;

        recyclerView=findViewById(R.id.RecyclerView);

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

        adapter=new Adapter(context,list1, adapter.launcher);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
    }
}
