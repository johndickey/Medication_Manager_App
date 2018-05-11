package com.example.john.medication_manager_john;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.TextView;


import java.util.List;

/**
 * Created by John on 5/5/2018.
 */

public class MedAdapter extends ArrayAdapter<meds> {
    private List<meds> medsList;
    private Context context;
    private int layoutResource;

    public MedAdapter (Context context, int resource, List<meds> medsList){
        super(context, resource, medsList);
        this.context = context;
        this.layoutResource = resource;
        this.medsList = medsList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        meds Meds = medsList.get(position);
        View view;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(R.layout.med_row_layout, null);

        TextView tvName=(TextView)view.findViewById(R.id.textViewName);
        TextView tvAmount=(TextView)view.findViewById(R.id.textViewAmount);
        TextView tvUnit=(TextView)view.findViewById(R.id.textViewunit);
        TextView tvFrequency= (TextView)view.findViewById(R.id.textViewFrequency);

        return(view);


    }
}
