package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import java.util.ArrayList;

public class CustomerMainScreen extends AppCompatActivity {
    ArrayList<ModelRestaurant> restList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_main_screen);

        recyclerView=findViewById(R.id.recl_view);
        restList=new ArrayList<>();
        restList.add(new ModelRestaurant(R.drawable.food,"Coffe beans and Resturant"));
        restList.add(new ModelRestaurant(R.drawable.food,"Coffe beans and Resturant"));
        restList.add(new ModelRestaurant(R.drawable.food,"Coffe beans and Resturant"));
        restList.add(new ModelRestaurant(R.drawable.food,"Coffe beans and Resturant"));
        restList.add(new ModelRestaurant(R.drawable.food,"Coffe beans and Resturant"));
        restList.add(new ModelRestaurant(R.drawable.food,"Coffe beans and Resturant"));

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        RecyclerView.LayoutManager rv= layoutManager;
        recyclerView.setLayoutManager(rv);
        RestaurantAdapter restaurantAdapter=new RestaurantAdapter(this,restList);
        recyclerView.setAdapter(restaurantAdapter);

    }
}
