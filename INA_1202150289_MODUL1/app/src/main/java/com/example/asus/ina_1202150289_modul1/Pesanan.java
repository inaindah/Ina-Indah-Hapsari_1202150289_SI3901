package com.example.asus.ina_1202150289_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Pesanan extends AppCompatActivity {

    TextView tvRestaurant, tvMenu, tvPorsi, tvHarga;
    String restaurant, menu;
    int porsi, harga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);
        tvRestaurant = (TextView)findViewById(R.id.tv_restaurant); //komponen
        tvMenu = (TextView)findViewById(R.id.tv_menu);
        tvPorsi = (TextView)findViewById(R.id.tv_porsi);
        tvHarga = (TextView)findViewById(R.id.tv_harga);

        //mengambil data dari aktivity sebelumnya
        Intent intent = getIntent();
        restaurant = intent.getStringExtra("restaurant");
        menu = intent.getStringExtra("menu");
        porsi = intent.getIntExtra("porsi", 0);
        harga = intent.getIntExtra("harga", 0);

        //untuk mengisi omponen dengan data
        tvRestaurant.setText(restaurant);
        tvMenu.setText(menu);
        tvPorsi.setText(""+porsi);
        tvHarga.setText("Rp. "+harga);

        Toast toast = null; //inisiasi awal
        if (harga > 65000) {
            toast = Toast.makeText(getApplicationContext(), "Makan disini aja", Toast.LENGTH_SHORT); //getApp mengetahui dimna kita berada sekarang
        } else {
            toast = Toast.makeText(getApplicationContext(), "Jangan makan disini, uang kamu tidak cukup", Toast.LENGTH_SHORT);
        }
        toast.show();

    }
}
