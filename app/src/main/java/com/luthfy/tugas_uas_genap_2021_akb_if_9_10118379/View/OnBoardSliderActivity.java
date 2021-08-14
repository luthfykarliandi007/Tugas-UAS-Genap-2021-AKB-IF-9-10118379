package com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.View;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.MainActivity;
import com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.R;
import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;


/** NIM : 10118379
 * Nama : Luthfy Karliandi Nugraha
 * Kelas : IF-9
 * **/

public class OnBoardSliderActivity extends TutorialActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addFragment(new Step.Builder().setTitle("Daftar Tempat Wisata")
                .setContent("Tampil Daftar Tempat Wisata")
                .setBackgroundColor(Color.parseColor("#cbe0e9")) // int background color
                .setDrawable(R.drawable.vp1) // int top drawable
                .setSummary("Menampilkan Tempat Wisata di Kota Bandung")
                .build());
        addFragment(new Step.Builder().setTitle("Deskripsi Wisata")
                .setContent("Tampil Deskripsi Wisata")
                .setBackgroundColor(Color.parseColor("#cbe0e9")) // int background color
                .setDrawable(R.drawable.vp2) // int top drawable
                .setSummary("Menampilkan Deskripsi Wisata Secara Detail")
                .build());
        addFragment(new Step.Builder().setTitle("Lokasi Di Google Map")
                .setContent("Menampilkan Lokasi Di Google Map")
                .setBackgroundColor(Color.parseColor("#cbe0e9")) // int background color
                .setDrawable(R.drawable.vp3) // int top drawable
                .setSummary("Menampilkan Lokasi Wisata Di Google Map")
                .build());
        setCancelText("Skip");

    }

    @Override
    public void finishTutorial() {
        super.finishTutorial();
        Intent intent = new Intent(OnBoardSliderActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
