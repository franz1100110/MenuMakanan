package com.example.menumakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class menu extends RecyclerView.Adapter<menu.MyViewHolder> {

    String data0[],data1[],data2[];
    int images[];
    Context context;

    public menu(Context ct,String a0[], String a1[], String a2[],int img[]) {
        context = ct;
        data0 = a0;
        data1 = a1;
        data2 = a2;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.desc, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
            holder.text1.setText(data0[position]);
            holder.text2.setText(data1[position]);
            holder.imagess.setImageResource(images[position]);
            holder.mainLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, Second.class);
                    intent.putExtra("data0",data0[position]);
                    intent.putExtra("data1",data1[position]);
                    intent.putExtra("data2",data2[position]);
                    intent.putExtra("images",images[position]);
                    context.startActivity(intent);
                }
            });
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView text1,text2;
        ImageView imagess;
        ConstraintLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.nama);
            text2 = itemView.findViewById(R.id.harga);
            imagess = itemView.findViewById(R.id.imageView);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
