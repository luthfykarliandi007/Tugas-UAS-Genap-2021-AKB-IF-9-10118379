package com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.Model;


import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.R;
import com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.View.DetailActivity;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

/** NIM : 10118379
 * Nama : Luthfy Karliandi Nugraha
 * Kelas : IF-9
 * **/

public class AdapterTourPlace extends RecyclerView.Adapter<AdapterTourPlace.TourPlaceViewHolder> {
    private ArrayList<TourPlace> listTourPlace = new ArrayList<>();
    private Activity activity;

    public AdapterTourPlace(Activity activity){
        this.activity = activity;
    }

    public ArrayList<TourPlace> getListNotes(){
        return listTourPlace;
    }

    public void setListNotes(ArrayList<TourPlace> listNotes){
        if (listNotes.size() > 0 ){
            this.listTourPlace.clear();
        }
        this.listTourPlace.addAll(listNotes);

        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public AdapterTourPlace.TourPlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note, parent, false);
        return new TourPlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TourPlaceViewHolder holder, int position) {
        holder.tvNama.setText(listTourPlace.get(position).getNama());
        holder.tvWaktuBuka.setText(listTourPlace.get(position).getWaktuBuka());
        Glide.with(activity)
                .asBitmap()
                .load(listTourPlace.get(position).getFoto())
                .into(holder.tvFoto);
        holder.cvNote.setOnClickListener(new CustomClickListener(position, new CustomClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(activity, DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_POSITION, position);
                intent.putExtra(DetailActivity.EXTRA_NOTE, listTourPlace.get(position));
                activity.startActivityForResult(intent, DetailActivity.REQUEST_UPDATE);
            }
        }));
    }

    @Override
    public int getItemCount() {
        return listTourPlace.size();
    }

    public class TourPlaceViewHolder extends RecyclerView.ViewHolder{
        final TextView  tvNama, tvWaktuBuka;
        final ImageView tvFoto;
        final CardView cvNote;

        public TourPlaceViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.nama_wisata);
            tvWaktuBuka = itemView.findViewById(R.id.waktuBuka);
            tvFoto = itemView.findViewById(R.id.gambar_wisata);
            cvNote = itemView.findViewById(R.id.cv_item_note);
        }
    }


}
