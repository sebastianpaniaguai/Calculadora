package com.example.sebas.formulario;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
public class MainActivity extends AppCompatActivity {
    int indUser=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText Nombre=(EditText) findViewById(R.id.eName);
        final EditText Apellido=(EditText) findViewById(R.id.eLast_Name);
        final EditText ID=(EditText) findViewById(R.id.eID);
        final RadioButton Masculino=(RadioButton) findViewById(R.id.rMasculino);
        final RadioButton Femenino=(RadioButton) findViewById(R.id.rFemenino);
        final DatePicker Nacimiento=(DatePicker) findViewById(R.id.dpFecha);
        final Spinner Ciudades=(Spinner) findViewById(R.id.spinner);
        final RadioButton Hobby1=(RadioButton) findViewById(R.id.rHobby1);
        final RadioButton Hobby2=(RadioButton) findViewById(R.id.rHobby2);
        final RadioButton Hobby3=(RadioButton) findViewById(R.id.rHobby3);
        final RadioButton Hobby4=(RadioButton) findViewById(R.id.rHobby4);
        final Button Ingresar=(Button) findViewById(R.id.bIngresar);
        final EditText NombreCapturado=(EditText) findViewById(R.id.capturedNombre);
        final EditText ApellidoCapturado=(EditText) findViewById(R.id.capturedLastNombre);
        final EditText IDCapturado=(EditText) findViewById(R.id.capturedID);
        final EditText SexoCapturado=(EditText) findViewById(R.id.capturedSex);
        final EditText CiudadCapturada=(EditText) findViewById(R.id.capturedCity);
        final EditText FechaCapturada=(EditText) findViewById(R.id.capturedBirthDate);
        final EditText HobbyCapturado=(EditText) findViewById(R.id.capturedHobby);
        final LinearLayout lNombre=(LinearLayout) findViewById(R.id.lNombre);
        final LinearLayout lApellido=(LinearLayout) findViewById(R.id.lApellido);
        final LinearLayout lID=(LinearLayout) findViewById(R.id.lID);
        final LinearLayout lSex=(LinearLayout) findViewById(R.id.lSex);
        final LinearLayout lDate=(LinearLayout) findViewById(R.id.lBirthDate);
        final LinearLayout lCiudad=(LinearLayout) findViewById(R.id.lCiudad);
        final LinearLayout lHobby=(LinearLayout) findViewById(R.id.lHobby);
        final User[] usuarios=new User[100];

        for (int i=0;i<10;i++){
            usuarios[i]=new User();
        }
        Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indUser++;
                usuarios[indUser].setNombre(Nombre.getText().toString());
                usuarios[indUser].setApellido(Apellido.getText().toString());
                usuarios[indUser].setID(ID.getText().toString());
                if(Masculino.isChecked())   usuarios[indUser].setSex("Masculino");
                else if (Femenino.isChecked())   usuarios[indUser].setSex("Femenino");
                usuarios[indUser].setDateDay(Nacimiento.getDayOfMonth());
                usuarios[indUser].setDateMonth(Nacimiento.getMonth());
                usuarios[indUser].setDateYear(Nacimiento.getYear());
                usuarios[indUser].setCity(Ciudades.getSelectedItem().toString());
                if(Hobby1.isChecked())   usuarios[indUser].setHobby(Hobby1.getText().toString());
                else if(Hobby2.isChecked())   usuarios[indUser].setHobby(Hobby2.getText().toString());
                else if(Hobby3.isChecked())   usuarios[indUser].setHobby(Hobby3.getText().toString());
                else if(Hobby4.isChecked())   usuarios[indUser].setHobby(Hobby4.getText().toString());
                lNombre.setVisibility(View.VISIBLE);NombreCapturado.setText(usuarios[indUser].getNombre());
                lApellido.setVisibility(View.VISIBLE);ApellidoCapturado.setText(usuarios[indUser].getApellido());
                lID.setVisibility(View.VISIBLE);IDCapturado.setText(usuarios[indUser].getID());
                lSex.setVisibility(View.VISIBLE);SexoCapturado.setText(usuarios[indUser].getSex());
                lDate.setVisibility(View.VISIBLE);FechaCapturada.setText(new StringBuilder()
                        .append(usuarios[indUser].getDateDay()).append("/")
                        .append(usuarios[indUser].getDateMonth() +1).append("/")
                        .append(usuarios[indUser].getDateYear()));
                lDate.setVisibility(View.VISIBLE);CiudadCapturada.setText(usuarios[indUser].getCity());
                lHobby.setVisibility(View.VISIBLE);HobbyCapturado.setText(usuarios[indUser].getHobby());

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
