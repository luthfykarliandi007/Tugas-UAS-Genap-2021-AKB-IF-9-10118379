package com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


/** NIM : 10118379
 * Nama : Luthfy Karliandi Nugraha
 * Kelas : IF-9
 * **/

public class ProfileActivity extends Fragment {
    public ProfileActivity () {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        // Inflate the layout for this fragment
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        return inflater.inflate(R.layout.activity_profile, container, false);
    }
}
