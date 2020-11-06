package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    ImageView main;
    TextView title,desc,harga;
    String data0,data1,data2;
    int images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        main = findViewById(R.id.imageView);
        title = findViewById(R.id.namamakanan);
        desc = findViewById(R.id.deskripsi);
        harga = findViewById(R.id.harga);
        getData();
        setData();
    }

    private void getData() {
        if(getIntent().hasExtra("images")&&getIntent().hasExtra("data0")&&getIntent().hasExtra("data1")&&getIntent().hasExtra("data2")){
            data0 = getIntent().getStringExtra("data0");
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            images = getIntent().getIntExtra("images",1);
        }
        else{
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        title.setText(data0);
        desc.setText(data2);
        harga.setText("Harga : "+data1);
        main.setImageResource(images);
    }
}