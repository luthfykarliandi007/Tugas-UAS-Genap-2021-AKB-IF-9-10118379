package com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import static com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.Model.DatabaseHelper.MyColumns.NamaTabel;
import static com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.Model.DatabaseHelper.MyColumns.alamat;
import static com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.Model.DatabaseHelper.MyColumns.deskripsi;
import static com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.Model.DatabaseHelper.MyColumns.foto;
import static com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.Model.DatabaseHelper.MyColumns.id;
import static com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.Model.DatabaseHelper.MyColumns.lang;
import static com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.Model.DatabaseHelper.MyColumns.leng;
import static com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.Model.DatabaseHelper.MyColumns.nama;
import static com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.Model.DatabaseHelper.MyColumns.waktubuka;


/** NIM : 10118379
 * Nama : Luthfy Karliandi Nugraha
 * Kelas : IF-9
 * **/

public class DatabaseHelper extends SQLiteOpenHelper {
    static abstract class MyColumns implements BaseColumns {
        //Menentukan Nama Table dan Kolom
        static final String NamaTabel = "tempatWisata";
        public static String id = "id";
        public static String nama = "nama";
        public static String alamat = "alamat";
        public static String waktubuka = "waktubuka";
        public static String deskripsi = "deskripsi";
        public static String foto = "foto";
        public static String lang = "lang";
        public static String leng = "leng";
    }

    private static final String NamaDatabse = "dma.db";
    private static final int VersiDatabase = 1;

    //Query yang digunakan untuk membuat Tabel
    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE "+ NamaTabel+
            "("+MyColumns.id+" TEXT PRIMARY KEY, "+MyColumns.nama+" TEXT NOT NULL, "+MyColumns.alamat+
            " TEXT NOT NULL, "+MyColumns.waktubuka+" TEXT NOT NULL, "+MyColumns.deskripsi+
            " TEXT NOT NULL, "+MyColumns.foto+" BLOB NOT NULL, "+MyColumns.lang+" TEXT NOT NULL, "+MyColumns.leng+" TEXT NOT NULL)";

    //Query yang digunakan untuk mengupgrade Tabel
    private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS "+ NamaTabel;


    public void save(TourPlace tp){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(id, tp.getId());
        values.put(nama, tp.getNama());
        values.put(alamat, tp.getAlamat());
        values.put(waktubuka, tp.getWaktuBuka());
        values.put(deskripsi, tp.getDeskripsi());
        values.put(foto, tp.getFoto());
        values.put(lang, tp.getLang());
        values.put(leng, tp.getLeng());

        db.insert(NamaTabel, null, values);
        db.close();
    }

    public DatabaseHelper(Context context) {
        super(context, NamaDatabse, null, VersiDatabase);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }


}
