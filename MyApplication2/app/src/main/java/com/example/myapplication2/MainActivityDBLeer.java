package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityDBLeer extends AppCompatActivity {
    TextView ver;
    DataBase dataBase;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dbleer);
        ver = findViewById(R.id.textViewVerDataBase);
        dataBase = new DataBase(MainActivityDBLeer.this,"MyDataBase",null,1);
        db = dataBase.getWritableDatabase();
        String sql = "SELECT * FROM lugares;";
        db = dataBase.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql,null);
        String aux = "";
        if(cursor.moveToFirst()){
            do{
                //db.execSQL("INSERT INTO lugares(nombre, descripcion , latitud ,longitud)VALUES("+"'"+ nombre.getText() +"'"+","+"'"+ descricion.getText() +"'"+","+"'"+ latitud.getText() +"'"+", "+"'"+ longitud.getText() +"'"+");");
                aux += "Ciudad :"+cursor.getString(Integer.parseInt(String.valueOf(cursor.getColumnIndex("nombre"))))+"  ";
                aux += "Descripcion :"+cursor.getString(Integer.parseInt(String.valueOf(cursor.getColumnIndex("descripcion"))))+"  ";
                aux += "Latitud :"+cursor.getString(Integer.parseInt(String.valueOf(cursor.getColumnIndex("latitud"))))+"  ";
                aux += "Longitud :"+cursor.getString(Integer.parseInt(String.valueOf(cursor.getColumnIndex("longitud"))))+"\n";
            }while(cursor.moveToNext());
        }
        ver.setText(aux);
        Toast.makeText(MainActivityDBLeer.this, aux, Toast.LENGTH_SHORT).show();
        //db.execSQL(sql);
    }
}