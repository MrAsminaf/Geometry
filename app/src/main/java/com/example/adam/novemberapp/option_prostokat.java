package com.example.adam.novemberapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class option_prostokat extends AppCompatActivity {

    public void Oblicz(EditText a, EditText b, TextView tv){
        float bok1 = Float.parseFloat( a.getText().toString() );
        float bok2 = Float.parseFloat( b.getText().toString() );

        float result = bok1 * bok2;
        tv.setText(String.valueOf(result));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_prostokat);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button buttonConfirm=(Button)findViewById(R.id.buttonConfirm);
        final TextView result=(TextView)findViewById(R.id.wynikOutput);
        final EditText bokA=(EditText)findViewById(R.id.etBokAInput);
        final EditText bokB=(EditText) findViewById(R.id.etBokBInput);

        View.OnClickListener confirmListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Oblicz(bokA, bokB, result);
            }
        };
        buttonConfirm.setOnClickListener(confirmListener);

    }

    public boolean onOptionsItemSelected(MenuItem item){
       finish();
        return true;
    }
}
