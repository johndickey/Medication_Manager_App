package com.example.john.medication_manager_john;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;



/**
 * Created by John on 5/5/2018.
 */

public class AddMedActivity extends AppCompatActivity {

    Button buttonSave;
    EditText editTextMedName, editTextAmount;
    Spinner spinnerUnits, spinnerFrequency;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_med);

        MedDataSource = new MedDataSource(this);
        MedDataSource.open();

        editTextMedName = (EditText) findViewById(R.id.editTextMedName);
        editTextAmount = (EditText) findViewById(R.id.editTextAmount);
        spinnerUnits = (Spinner) findViewById(R.id.spinnerUnit);
        spinnerFrequency = (Spinner) findViewById(R.id.spinnerFrequency);

        buttonSave = (Button) findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextMedName.getText().toString();
                String amount = editTextAmount.getText().toString();
                String unit = spinnerUnits.getSelectedItem().toString();
                String frequency = spinnerFrequency.getSelectedItem().toString();
                MedDataSource.createmeds(name, amount, unit, frequency);
                finish();
                startActivity(mainActIntent);
            }
        });

    }
}
