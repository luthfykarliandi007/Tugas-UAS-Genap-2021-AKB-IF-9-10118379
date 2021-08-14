package com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.Model;

import android.database.Cursor;

import java.util.ArrayList;

/** NIM : 10118379
 * Nama : Luthfy Karliandi Nugraha
 * Kelas : IF-9
 * **/

public class MapHelper {
    public static ArrayList<TourPlace> mapCursorToArrayList(Cursor TourPlaceCursor) {
        ArrayList<TourPlace> TourPlaceList = new ArrayList<>();

        while (TourPlaceCursor.moveToNext()) {
           int id = TourPlaceCursor.getInt(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.id));
           String nama = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.nama));
           String alamat = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.alamat));
            String waktuBuka = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.waktubuka));
            String deskripsi = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.deskripsi));
            String foto = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.foto));
            String lang = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.lang));
            String leng = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.leng));
            TourPlaceList.add(new TourPlace(id, nama, alamat, waktuBuka, deskripsi, foto, lang, leng));

        }
        return TourPlaceList;
    }

}
