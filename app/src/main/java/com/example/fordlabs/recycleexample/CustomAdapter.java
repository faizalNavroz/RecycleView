package com.example.fordlabs.recycleexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    ArrayList teams;
    Context contxt;

    public CustomAdapter( Context context,ArrayList teamList){
        this.teams = teamList;
        this.contxt=context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //create a view and inflate it
        Log.d("print*****","inside oncreateViewHolder");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row,viewGroup,false);
        MyViewHolder viewHolder = new MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, final int i) {
        Log.d("print*****","inside onBindViewHolder");
    viewHolder.nameViewElement.setText(teams.get(i).toString()  );
    viewHolder.nameViewElement.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(contxt,teams.get(i)+"Selected",Toast.LENGTH_SHORT).show();
        }
    });

    }

    @Override
    public int getItemCount() {
        return teams.size();
    }

    public class MyViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {

        TextView nameViewElement;
        public MyViewHolder(View view){
            super(view);
            //get the view holder ref foreach row
            nameViewElement = view.findViewById(R.id.rowName);
        }
    }


}
