package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String a0[],a1[],a2[];
    int images[]={R.drawable.pecel,R.drawable.nasgor,R.drawable.ayam,R.drawable.kari,R.drawable.tahu,R.drawable.salad};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        a0 =getResources().getStringArray(R.array.menu);
        a1 =getResources().getStringArray(R.array.desc);
        a2 =getResources().getStringArray(R.array.jelas);


        menu menu=new menu(this,a0,a1,a2,images);
        recyclerView.setAdapter(menu);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}