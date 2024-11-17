package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Map;


public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    List<Map<String,Object>> list;
    private Context context;
    ActivityResultLauncher<Intent> launcher;

    public Adapter(Context context, List<Map<String,Object>> list,ActivityResultLauncher<Intent> launcher) {
        this.context=context;
        this.list = list;
        this.launcher=launcher;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        context = viewGroup.getContext();
        View inflater = LayoutInflater.from(context).inflate(R.layout.layout_items, viewGroup, false);

        MyViewHolder holder=new MyViewHolder(inflater);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
//        myViewHolder.imageView.setImageResource(list.get(position).get("name").toString());
        Map<String,Object> currentItem = list.get(position);

        myViewHolder.imageView.setImageResource((Integer)currentItem.get("photo"));

        String str1=list.get(position).get("name").toString();
        String str2=list.get(position).get("tel").toString();
        String str3=list.get(position).get("city").toString();
        myViewHolder.textView1.setText(str1);
        myViewHolder.textView2.setText(str2);
        myViewHolder.textView3.setText(str3);


        /*
        launcher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>(){
                    @Override
                    public void onActivityResult(ActivityResult result){
                        if(result.getResultCode()==666)
                        {
                            String str1=result.getData().getStringExtra("result1");
//                            textView.setText(str1);
                        }
                    }

        }
        );
         */


        myViewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Activity_contact_detail.class);
                intent.putExtra("name",str1);
                intent.putExtra("tel",str2);
                intent.putExtra("city",str3);
                launcher.launch(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView1,textView2,textView3;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.rv_textView1);
            textView2 = itemView.findViewById(R.id.rv_textView2);
            textView3 = itemView.findViewById(R.id.rv_textView3);
            imageView = itemView.findViewById(R.id.rv_imageView1);

        }
    }
}
