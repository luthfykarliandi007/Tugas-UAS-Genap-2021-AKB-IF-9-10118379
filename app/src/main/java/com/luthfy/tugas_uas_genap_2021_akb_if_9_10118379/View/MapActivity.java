package com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.View;

import android.os.Bundle;

import com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.Model.TourPlace;
import com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import androidx.fragment.app.FragmentActivity;

/** NIM : 10118379
 * Nama : Luthfy Karliandi Nugraha
 * Kelas : IF-9
 * **/


public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;
    private TourPlace tp;


    public static final String EXTRA_NOTE = "extra_note";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
 //       getSupportActionBar().hide();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        tp = getIntent().getParcelableExtra(EXTRA_NOTE);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        LatLng farmhouse = new LatLng(Double.valueOf(tp.getLang()), Double.valueOf(tp.getLeng()));
        map.addMarker(new MarkerOptions().position(farmhouse).title(tp.getNama()));
        map.moveCamera(CameraUpdateFactory.newLatLng(farmhouse));
        map.animateCamera(CameraUpdateFactory.zoomTo(15),200, null);

    }
}
