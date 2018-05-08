package com.example.juani.laboratorio;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class FormularioSQLLiteHelper extends SQLiteOpenHelper {

    String sql = "CREATE TABLE Formulario (Id INTEGER, Nombre TEXT, Apellido TEXT, Email TEXT, Fecha DATE, Lat DOUBLE, Long DOUBLE)";

    public FormularioSQLLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF  EXISTs Formulario");
        db.execSQL(sql);
    }
}
