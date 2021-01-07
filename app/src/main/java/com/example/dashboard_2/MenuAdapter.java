package com.example.dashboard_2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    Context mContext;
    List<item> mData;
    int selected_position = 0;

    public MenuAdapter(Context mContext, List<item> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {

        holder.imgIcon.setImageResource(mData.get(position).getIcon());
        holder.imgIcon.setBackgroundColor(selected_position == position ? Color.parseColor("#fff1f1f1"):Color.parseColor("#ffffff"));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder{

        ImageView imgIcon;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.img_icon);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    notifyItemChanged(selected_position);
                    selected_position = getAdapterPosition();
                    notifyItemChanged(selected_position);
                }
            });
        }
    }
}
