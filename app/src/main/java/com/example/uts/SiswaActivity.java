package com.example.uts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SiswaActivity extends AppCompatActivity {
    private EditText nisInput;
    private EditText namaInput;
    private EditText alamatInput;
    private EditText hpInput;
    private EditText keteranganInput;
    String nis, nama, alamat, hp, keterangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa);
        nisInput = findViewById(R.id.nis);
        namaInput = findViewById(R.id.nama);
        alamatInput = findViewById(R.id.alamat);
        hpInput= findViewById(R.id.hp);
        keteranganInput = findViewById(R.id.keterangan);
    }

    public void alertButton(View view) {
        nis = nisInput.getText().toString();
        nama= namaInput.getText().toString();
        alamat= alamatInput.getText().toString();
        hp = hpInput.getText().toString();
        keterangan = keteranganInput.getText().toString();

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog
        alertDialogBuilder.setTitle("Data siswa");

        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("Nis : " + nis + "\nNama : " + nama + "\nAlamat : "+ alamat +"\nhandphone : "+hp +"\nKeterangan : "+keterangan)
                .setCancelable(false)
                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        SiswaActivity.this.finish();
                    }
                })
                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
}
