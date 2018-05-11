package com.example.john.medication_manager_john;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by John on 5/9/2018.
 */

public class InfoActivity extends AppCompatActivity {

    Button buttonBack;
    EditText editTextname, editTextamount, editTextunit, editTextfrequency;
    MedDataSource medDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Bundle bundle = getIntent().getExtras();
        meds Meds = (meds) bundle.getSerializable("com.example.john.medication_manager_john.meds");

        editTextname = (EditText) findViewById(R.id.editTextMedName);
        editTextamount = (EditText) findViewById(R.id.editTextAmount);
        editTextunit = (EditText) findViewById(R.id.editTextUnit);
        editTextfrequency = (EditText) findViewById(R.id.editTextFrequency);

        editTextname.setText(meds.getName);
        editTextamount.setText(meds.getAmount);
        editTextunit.setText(med.getUnit);
        editTextfrequency.setText(meds.getFrequency);

        buttonBack = (Button) findViewById(R.id.buttonback);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent mainActIntent = new Intent(view.getContext(), MainActivity.class);
                finish();
                startActivity(mainActIntent);
            }
        });


    }
}
