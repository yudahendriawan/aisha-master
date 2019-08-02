package com.shafira.satu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profile extends AppCompatActivity implements View.OnClickListener {
    Button balik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        balik = findViewById(R.id.btnBack);
        balik.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent b = new Intent(profile.this, second.class);
        startActivity(b);
        finish();

    }
}
