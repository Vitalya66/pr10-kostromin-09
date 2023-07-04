package com.example.vitalya_pr10_mobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Table extends AppCompatActivity implements View.OnClickListener {

    LinearLayout btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        btn = findViewById(R.id.btn_borsh);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_borsh:
                startActivity(new Intent(this, Table.class));
                break;
        }
    }
}