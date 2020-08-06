package com.studytrial.synrgypley_setor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.konten_layout.view.*

class KontenAdapter(val listKonten: ArrayList<KontenData>) :
    RecyclerView.Adapter<KontenAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.konten_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listKonten.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tv_nama.setText(listKonten[position].namaKonten)
        holder.itemView.tv_besar.setText("${listKonten[position].besar.toString()} MB")
        Glide.with(holder.itemView.context).load(listKonten[position].image)
            .into(holder.itemView.iv_konten)
    }
}