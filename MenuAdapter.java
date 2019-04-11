package com.example.logindemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class MenuAdapter extends ArrayAdapter<Menu> {

    public MenuAdapter(@NonNull Context context, int resource, @NonNull List<Menu> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.menu_row, parent, false);
        }
        TextView name = convertView.findViewById(R.id.txt_name);
        TextView desc = convertView.findViewById(R.id.txt_disc);
        TextView price = convertView.findViewById(R.id.txt_price);
        ImageView image = convertView.findViewById(R.id.image);
         LinearLayout row = convertView.findViewById(R.id.id_row);

        if (getItem(position) != null) {
            name.setText(getItem(position).getName());
            desc.setText(getItem(position).getDesc());
            price.setText("" + getItem(position).getPrice());
            image.setImageResource(getItem(position).getImage());
            row.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getContext(), Details_dishActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("name", getItem(position).getName());
                    intent.putExtras(bundle);
                    getContext().startActivity(intent);
                }
            });
        }
            return convertView;
        }}

