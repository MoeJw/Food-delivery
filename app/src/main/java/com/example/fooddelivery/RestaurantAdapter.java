package com.example.fooddelivery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {
    private Context mcontext;

    private ArrayList<ModelRestaurant> mlist;
    RestaurantAdapter(Context context,ArrayList<ModelRestaurant> list){
        mcontext=context;
        mlist=list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater  layoutInflater=LayoutInflater.from(mcontext);
        View view=layoutInflater.inflate(R.layout.card_view,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelRestaurant restaurantItems=mlist.get(position);
        ImageView item_image=holder.item_image;
        TextView  item_name=holder.item_name;
        item_image.setImageResource(restaurantItems.getImage());
        item_name.setText(restaurantItems.getName());

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public  class ViewHolder extends  RecyclerView.ViewHolder{
        ImageView item_image;
        TextView  item_name;
        public ViewHolder(View itemView){
            super(itemView);
            item_image=itemView.findViewById(R.id.rest);
            item_name=itemView.findViewById(R.id.text_item);
        }
    }
}
