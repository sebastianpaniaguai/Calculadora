package com.example.sebas.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Op1=(EditText)findViewById(R.id.eOp1);
        final EditText Op2=(EditText)findViewById(R.id.eOp2);
        final TextView Result=(TextView)findViewById(R.id.tResultado);
        Button Ingresar=(Button)findViewById(R.id.bIngresar);
        final RadioButton rSumar = (RadioButton)findViewById(R.id.rSumar);
        final RadioButton rRestar = (RadioButton)findViewById(R.id.rRestar);
        final RadioButton rMultiplicar = (RadioButton)findViewById(R.id.rMultiplicar);
        final RadioButton rDividir = (RadioButton)findViewById(R.id.rDividir);
        Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1,num2;
                num1=Double.parseDouble(Op1.getText().toString());
                num2=Double.parseDouble(Op2.getText().toString());
                if (rSumar.isChecked())
                    Result.setText(String.valueOf(num1+num2));
                else if (rRestar.isChecked())
                    Result.setText(String.valueOf(num1-num2));
                else if (rMultiplicar.isChecked())
                    Result.setText(String.valueOf(num1*num2));
                else if (rDividir.isChecked())
                    Result.setText(String.valueOf(num1/num2));
                else
                    Result.setText(null);
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
