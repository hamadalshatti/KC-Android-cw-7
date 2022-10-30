package com.example.adaptertraining;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Flightsadapte extends ArrayAdapter<Item> {
    List<Item> flightslist;

    public Flightsadapte(@NonNull Context context, int resource, @NonNull List<Item> objects) {
        super(context, resource, objects);
        flightslist=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.flight_row,parent,false);
        Item currentflight= flightslist.get(position);
        TextView flightname= v.findViewById(R.id.flightname);
        TextView flightprice= v.findViewById(R.id.flightprice);
        ImageView flightimage= v.findViewById(R.id.flightimage);

        flightname.setText(currentflight.getFlightname());
        flightprice.setText(currentflight.getFlightprice() + "KD");
        flightimage.setImageResource(currentflight.getFlightimage());
       return v;






    }
}
