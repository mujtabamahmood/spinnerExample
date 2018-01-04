package com.example.mm.spinnerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] carNames={"Chevy","Dodge","Mazda","Honda","BMW","Toyota"};
    int icons[] = {R.drawable.toyota, R.drawable.dodge, R.drawable.mazda, R.drawable.bmw, R.drawable.nissan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Spinner spin = (Spinner) findViewById(R.id.sSpinner);
            spin.setOnItemSelectedListener(this);

            CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),icons,carNames);
            spin.setAdapter(customAdapter);
    }




    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(getApplicationContext(), carNames[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
