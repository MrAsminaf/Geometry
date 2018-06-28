package com.example.adam.novemberapp;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class option_kwadrat extends AppCompatActivity {

    public void Oblicz(EditText a, TextView tv){
        float bok1 = Float.parseFloat( a.getText().toString() );
        if(bok1!=0) {
            float result = bok1 * bok1;
            tv.setText(String.valueOf(result));
        }
        else
            tv.setText("0");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_kwadrat);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Kwadrat");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==R.id.menuSearch)
            Toast.makeText(this, "No action", Toast.LENGTH_LONG).show();
        if(id==android.R.id.home)
            finish();
        return true;
    }
}
