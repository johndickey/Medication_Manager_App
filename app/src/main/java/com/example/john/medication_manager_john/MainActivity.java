package com.example.john.medication_manager_john;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button buttonAdd, buttonDelete, buttonInfo;
    ListView listViewMeds;
    MedDataSource medDataSource;
    ArrayAdapter<meds> medAdpater;
    List<meds> medsList;
    int positionSelected;
    meds medSelected;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        medDataSource = new MedDataSource(this);
        medDataSource.open();

        listViewMeds = (ListView) findViewById(R.id.ListViewmeds);
        medsList = medDataSource.getAllmeds();

        medAdpater = new MedAdapter(this, android.R.layout.simple_list_item_single_choice, medsList);

        listViewMeds.setAdapter(medAdpater);
        listViewMeds.setOnItemClickListener(new View.OnClickListener() {
            public void onItemClick(AdapterView<?> adapter, View parent, int position, long id){
                positionSelected = position;
                Log.d("MAIN", "Medication Selected at position " + positionSelected);
            }
        });

        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent detailActIntent = new Intent(view.getContext(), AddMedActivity.class);
                finish();
                startActivity(detailActIntent);
            }
        });


    }
}
