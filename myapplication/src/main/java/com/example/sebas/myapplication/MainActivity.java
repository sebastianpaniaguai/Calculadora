package com.example.sebas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText Lado=(EditText) findViewById(R.id.eLado);
        final EditText Radio=(EditText) findViewById(R.id.eRadio);
        final EditText Altura=(EditText) findViewById(R.id.eAltura);
        final EditText Base=(EditText) findViewById(R.id.eBase);
        final Button Calcular=(Button) findViewById(R.id.bCalcular);
        final TextView Result=(TextView) findViewById(R.id.tResult);
        final RadioButton Circulo=(RadioButton) findViewById(R.id.rCirculo);
        final RadioButton Cuadrado=(RadioButton) findViewById(R.id.rCuadrado);
        final RadioButton Triangulo=(RadioButton) findViewById(R.id.rTriangulo);
        final RadioButton Rectangulo=(RadioButton) findViewById(R.id.rRectangulo);

        Circulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Radio.setVisibility(View.VISIBLE);
                Lado.setVisibility(View.INVISIBLE);
                Altura.setVisibility(View.INVISIBLE);
                Base.setVisibility(View.INVISIBLE);
                Calcular.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double radio=Double.parseDouble(Radio.getText().toString());
                        double area=Math.PI*radio*radio;
                        Result.setText(String.valueOf(area));
                    }
                });

            }
        });
        Cuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Radio.setVisibility(View.INVISIBLE);
                Lado.setVisibility(View.VISIBLE);
                Altura.setVisibility(View.INVISIBLE);
                Base.setVisibility(View.INVISIBLE);

                Calcular.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double lado=Double.parseDouble(Lado.getText().toString());
                        double area=lado*lado;
                        Result.setText(String.valueOf(area));
                    }
                });

            }
        });
        Triangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Radio.setVisibility(View.INVISIBLE);
                Lado.setVisibility(View.INVISIBLE);
                Altura.setVisibility(View.VISIBLE);
                Base.setVisibility(View.VISIBLE);

                Calcular.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double altura=Double.parseDouble(Altura.getText().toString());
                        double base=Double.parseDouble(Base.getText().toString());
                        double area=base*altura/2;
                        Result.setText(String.valueOf(area));
                    }
                });

            }
        });
        Rectangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final double base, altura, area;
                Radio.setVisibility(View.INVISIBLE);
                Lado.setVisibility(View.INVISIBLE);
                Altura.setVisibility(View.VISIBLE);
                Base.setVisibility(View.VISIBLE);

                Calcular.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double altura=Double.parseDouble(Altura.getText().toString());
                        double base=Double.parseDouble(Base.getText().toString());
                        double area=base*altura;
                        Result.setText(String.valueOf(area));
                    }
                });

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
