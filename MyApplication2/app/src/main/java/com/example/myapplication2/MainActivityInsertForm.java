package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityInsertForm extends AppCompatActivity {
    DataBase dataBase;
    SQLiteDatabase db;
    Button insert;
    EditText nombre, descricion,latitud, longitud;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_insert_form);
        insert = findViewById(R.id.buttonInsertar);
        nombre = findViewById(R.id.editTextNombre);
        descricion = findViewById(R.id.editTextDescripcion);
        latitud = findViewById(R.id.editTextLatitud);
        longitud = findViewById(R.id.editTextLongitud);
        dataBase = new DataBase(MainActivityInsertForm.this,"MyDataBase",null,1);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db = dataBase.getWritableDatabase();
                db.execSQL("INSERT INTO lugares(nombre, descripcion , latitud ,longitud)VALUES("+"'"+ nombre.getText() +"'"+","+"'"+ descricion.getText() +"'"+","+"'"+ latitud.getText() +"'"+", "+"'"+ longitud.getText() +"'"+");");
                Toast.makeText(MainActivityInsertForm.this, "Datos Insertados", Toast.LENGTH_SHORT).show();
            }
        });


    }
}