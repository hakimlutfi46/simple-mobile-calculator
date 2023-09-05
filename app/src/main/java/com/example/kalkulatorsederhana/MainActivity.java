package com.example.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText angka1, angka2;
    private Button tambah, kurang, kali, bagi, clear;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       DecimalFormat df = new DecimalFormat("###.#");

        angka1 = findViewById(R.id.tf_angka1);
        angka2 = findViewById(R.id.tf_angka2);

        tambah = findViewById(R.id.btn_tambah);
        kurang = findViewById(R.id.btn_kurang);
        kali = findViewById(R.id.btn_kali);
        bagi = findViewById(R.id.btn_bagi);
        clear = findViewById(R.id.btn_clear);

        hasil = findViewById(R.id.lbl_setHasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (angka1.getText().toString().isEmpty() && angka2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Kedua Angka Harus Diisi", Toast.LENGTH_SHORT).show();
                }else if(angka1.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Angka 1 Kosong", Toast.LENGTH_SHORT).show();
                }else if (angka2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Angka 2 Kosong", Toast.LENGTH_SHORT).show();
                }else{
                    double valA = Double.parseDouble(angka1.getText().toString());
                    double valB = Double.parseDouble(angka2.getText().toString());

                    double result = valA + valB;
                    hasil.setText(String.valueOf(df.format(result)));

                }
//                kode menghiilangkan keyboard ketika di klik
                InputMethodManager imm = (InputMethodManager)getSystemService(
                        Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(angka2.getWindowToken(), 0);
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (angka1.getText().toString().isEmpty() && angka2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Kedua Angka Harus Diisi", Toast.LENGTH_SHORT).show();
                }else if(angka1.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Angka 1 Kosong", Toast.LENGTH_SHORT).show();
                }else if (angka2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Angka 2 Kosong", Toast.LENGTH_SHORT).show();
                }else{
                    double valA = Double.parseDouble(angka1.getText().toString());
                    double valB = Double.parseDouble(angka2.getText().toString());

                    double result = valA - valB;
                    hasil.setText(String.valueOf(df.format(result)));
                }

                InputMethodManager imm = (InputMethodManager)getSystemService(
                        Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(angka2.getWindowToken(), 0);
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (angka1.getText().toString().isEmpty() && angka2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Kedua Angka Harus Diisi", Toast.LENGTH_SHORT).show();
                }else if(angka1.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Angka 1 Kosong", Toast.LENGTH_SHORT).show();
                }else if (angka2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Angka 2 Kosong", Toast.LENGTH_SHORT).show();
                }else{
                    double valA = Double.parseDouble(angka1.getText().toString());
                    double valB = Double.parseDouble(angka2.getText().toString());

                    double result = valA * valB;
                    hasil.setText(String.valueOf(df.format(result)));
                }

                InputMethodManager imm = (InputMethodManager)getSystemService(
                        Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(angka2.getWindowToken(), 0);
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (angka1.getText().toString().isEmpty() && angka2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Kedua Angka Harus Diisi", Toast.LENGTH_SHORT).show();
                }else if(angka1.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Angka 1 Kosong", Toast.LENGTH_SHORT).show();
                }else if (angka2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Angka 2 Kosong", Toast.LENGTH_SHORT).show();
                }else{
                    double valA = Double.parseDouble(angka1.getText().toString());
                    double valB = Double.parseDouble(angka2.getText().toString());

                    double result = valA / valB;

                    hasil.setText(String.valueOf(df.format(result)));
                }

                InputMethodManager imm = (InputMethodManager)getSystemService(
                        Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(angka2.getWindowToken(), 0);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1.setText("");
                angka2.setText("");
                hasil.setText("0");
                angka1.clearFocus();
                angka2.clearFocus();

                InputMethodManager imm = (InputMethodManager)getSystemService(
                        Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(angka2.getWindowToken(), 0);
            }
        });
    }
}