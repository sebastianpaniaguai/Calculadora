package com.example.sebas.notas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText Quices=(EditText) findViewById(R.id.eQuices);
        final EditText Lab=(EditText) findViewById(R.id.eLab);
        final EditText Expo=(EditText) findViewById(R.id.eExpo);
        final EditText Proyect=(EditText) findViewById(R.id.eProyect);
        final Button Calcular=(Button) findViewById(R.id.bCalcular);
        final TextView Nota=(TextView) findViewById(R.id.tNotas);
        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nota.setText(String.valueOf(Double.parseDouble(Quices.getText().toString())*0.15+Double.parseDouble(Expo.getText().toString())*0.1+
                        Double.parseDouble(Lab.getText().toString())*0.4+Double.parseDouble(Proyect.getText().toString())*0.35));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
