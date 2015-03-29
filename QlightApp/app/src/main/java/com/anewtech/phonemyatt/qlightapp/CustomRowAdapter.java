package com.anewtech.phonemyatt.qlightapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


/**
 * Created by Phonemyatt on 30/3/2015.
 */
public class CustomRowAdapter extends ArrayAdapter<String> {
    public CustomRowAdapter(Context context, String[] foods) {
        super(context, R.layout.custom_listview_row,foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflate = LayoutInflater.from(getContext());
        View customView = inflate.inflate(R.layout.custom_listview_row,parent,false);
        String singleFoodItem = getItem(position);
        TextView tx1 = (TextView) customView.findViewById(R.id.tv1);
        TextView tx2 = (TextView) customView.findViewById(R.id.tv2);
        TextView tx3 = (TextView) customView.findViewById(R.id.tv3);

        tx1.setText(singleFoodItem);
        tx2.setText(new String(singleFoodItem + " AND"));
        tx3.setText(new String(singleFoodItem + " MORE"));

        return customView;
    }
}
