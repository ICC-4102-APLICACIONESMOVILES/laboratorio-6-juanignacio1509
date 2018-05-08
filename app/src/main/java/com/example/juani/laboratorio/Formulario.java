package com.example.juani.laboratorio;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {

    Button btn3;
    EditText edtNombre;
    EditText edtApellido;
    EditText edtEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        edtNombre = (EditText) findViewById(R.id.edtNombre);
        edtApellido = (EditText) findViewById(R.id.edtApellido);
        edtEmail = (EditText) findViewById(R.id.edtEmail);

        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicki();
            }
        });

    }


    public void  clicki(){
        String id = "0";
        String nomb = edtNombre.getText().toString();
        String apell = edtApellido.getText().toString();
        String mail = edtEmail.getText().toString();
        String fecha ="0";
        String lat ="0";
        String longi ="0";

        if (nomb.length() > 0 && apell.length() > 0 && mail.length() > 0){

            FormularioSQLLiteHelper formulario = new FormularioSQLLiteHelper(this, "DBFormulario",null,1);
            SQLiteDatabase db = formulario.getWritableDatabase();

            db.execSQL("INSERT INTO Formulario (Id, Nombre, Apellido, Email, Fecha, Lat, Long) VALUES (" + id + ",'" + nomb + "','" + apell + "','" + mail + "','" + fecha + "','" + lat + "','" + longi +"')");
            db.close();
            Toast.makeText(this,"Formulario Enviado",Toast.LENGTH_SHORT).show();

        }

    }




}
