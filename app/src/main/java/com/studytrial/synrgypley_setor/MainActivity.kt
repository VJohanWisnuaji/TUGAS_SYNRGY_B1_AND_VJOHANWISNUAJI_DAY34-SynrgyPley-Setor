package com.studytrial.synrgypley_setor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Aplikasi

        val listUtama = arrayListOf(
            KontenData(R.drawable.youtube, "Youtube", 128),
            KontenData(R.drawable.instagram, "Instagram", 32),
            KontenData(R.drawable.linkedin, "LinkedIn", 16),
            KontenData(R.drawable.chrome, "Google Chrome", 42),
            KontenData(R.drawable.whatsapp, "WhatsApp", 12)
        )

        val listHiburan = arrayListOf(
            KontenData(R.drawable.coc, "Clash of Clan", 132),
            KontenData(R.drawable.asphalt, "Asphalt 6 Adrenaline", 200),
            KontenData(R.drawable.instagram, "Instagram", 32),
            KontenData(R.drawable.youtube, "Youtube", 128)
        )

        val listMedia = arrayListOf(
            KontenData(R.drawable.linkedin, "LinkedIn", 16),
            KontenData(R.drawable.whatsapp, "WhatsApp", 12),
            KontenData(R.drawable.twitter, "Twitter", 12),
            KontenData(R.drawable.instagram, "Instagram", 32),
            KontenData(R.drawable.youtube, "Youtube", 128)
        )

        val listOlShop = arrayListOf(
            KontenData(R.drawable.shopee, "Shopee", 16),
            KontenData(R.drawable.tokepd, "Toko Pedia", 12),
            KontenData(R.drawable.olx, "OLX", 12),
            KontenData(R.drawable.blibli, "Blibli.com", 32),
            KontenData(R.drawable.lazada, "Lazada", 23)
        )

        val listLainLain = arrayListOf(
            KontenData(R.drawable.linkedin, "LinkedIn", 16),
            KontenData(R.drawable.whatsapp, "WhatsApp", 12),
            KontenData(R.drawable.coc, "Clash of Clan", 132),
            KontenData(R.drawable.twitter, "Twitter", 12),
            KontenData(R.drawable.asphalt, "Asphalt 6 Adrenaline", 200)
        )
        val listKategori = arrayListOf(
            KategoriData("Aplikasi Utama", listUtama),
            KategoriData("Hiburan", listHiburan),
            KategoriData("Media Sosial", listMedia),
            KategoriData("Online Shop", listOlShop),
            KategoriData("Aplikasi Lainnya", listLainLain)
        )



        val adapterKategori = KategoriAdapter(listKategori)
        rv_judul.adapter = adapterKategori
        val layoutLinearKategori = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_judul.layoutManager = layoutLinearKategori
    }
}