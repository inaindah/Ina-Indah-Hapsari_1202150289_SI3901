package com.example.asus.ina_1202150289_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etFood, etPorsi; //untuk deklarasi objek
    Intent intent;
    String restaurant, menu;
    int porsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //metod yang pertama dijalankan ketika activity dibuat
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFood = (EditText)findViewById(R.id.et_food);
        etPorsi = (EditText)findViewById(R.id.et_porsi);
        intent = new Intent(this, Pesanan.class);
    }

    public void oneEatbus(View view) {
        //log menampilkan data di logcat android studio bukan di hp
        menu = etFood.getText().toString();
        restaurant = "Eatbus";
        porsi = Integer.parseInt(etPorsi.getText().toString());
        int total = 50000 * porsi;
        Log.d("TOTAL HARGA", "Rp. "+total);
        intent.putExtra("restaurant", restaurant);
        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsi);
        intent.putExtra("harga", total);
        startActivity(intent);
    }

    public void onAbnormal(View view) {
        menu = etFood.getText().toString();
        restaurant = "Abnormal";
        porsi = Integer.parseInt(etPorsi.getText().toString());
        int total = 30000 * Integer.parseInt(etPorsi.getText().toString());
        Log.d("TOTAL HARGA", "Rp. "+total);
        intent.putExtra("restaurant", restaurant);
        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsi);
        intent.putExtra("harga", total);
        startActivity(intent);
    }
}
