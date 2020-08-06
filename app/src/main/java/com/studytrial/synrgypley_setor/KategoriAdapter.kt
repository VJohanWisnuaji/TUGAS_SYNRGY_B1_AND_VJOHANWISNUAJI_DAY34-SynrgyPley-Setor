package com.studytrial.synrgypley_setor

import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import kotlinx.android.synthetic.main.kategori_layout.view.*


class KategoriAdapter(val listKategori: ArrayList<KategoriData>) :
    RecyclerView.Adapter<KategoriAdapter.ViewHolder>() {

    private val viewPool = RecycledViewPool()

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {
        internal val tvItemTitle: TextView
        internal val rvSubItem: RecyclerView

        init {
            tvItemTitle = itemView.findViewById(R.id.tv_kategori)
            rvSubItem = itemView.findViewById(R.id.rv_isi)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.kategori_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listKategori.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listKategori[position]
        holder.itemView.tv_kategori.setText(listKategori[position].namaKategori)

        val layoutManager = LinearLayoutManager(
            holder.rvSubItem.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        layoutManager.initialPrefetchItemCount = item.listKonten.size

        // Create sub item view adapter
        val subItemAdapter = KontenAdapter(item.listKonten)

        holder.rvSubItem.layoutManager = layoutManager
        holder.rvSubItem.adapter = subItemAdapter
        holder.rvSubItem.setRecycledViewPool(viewPool)
    }
}