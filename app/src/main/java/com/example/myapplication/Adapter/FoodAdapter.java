package com.example.myapplication.Adapter;

import static android.view.LayoutInflater.from;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.Food;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private final ArrayList<Food> foodList;
    private final Context context;

    public FoodAdapter(ArrayList<Food> foodList, Context context) {
        this.foodList = foodList;
        this.context = context;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        FoodItemBinding listItem;
        listItem = FoodItemBinding.inflate(from(context),parent, false);
        return new FoodViewHolder(listItem);
    }

    private LayoutInflater from() {
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        ActionBarPolicy food;
        holder.binding.imgFood.setBackgroundResource(food.get(position).getImgFood());
        holder.binding.txtNomeFood.setText(foodList.get(position).getFoodName());
        holder.binding.txtDescripption.setText(foodList.get(position).getFoodDescripption());
        holder.binding.txtPrice.setText(foodList.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public static class FoodViewHolder extends RecyclerView.ViewHolder{

        FoodItemBinding binding;


        public FoodViewHolder(FoodItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
