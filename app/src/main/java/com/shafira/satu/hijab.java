package com.shafira.satu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hijab extends AppCompatActivity implements View.OnClickListener {
    Button pac;
    Button pae;
    Button pal;
    Button pap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijab);

        pac = findViewById(R.id.btn1);
        pac.setOnClickListener(this);

        pae = findViewById(R.id.btn3);
        pae.setOnClickListener(this);

        pal = findViewById(R.id.btn2);
        pal.setOnClickListener(this);

        pap = findViewById(R.id.btn4);
        pap.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Intent a = new Intent(hijab.this, pacgray.class);
                startActivity(a);
                break;
            case R.id.btn2:
                Intent b = new Intent(hijab.this, palpink.class);
                startActivity(b);
                break;
            case R.id.btn3:
                Intent c = new Intent(hijab.this, pearlgray.class);
                startActivity(c);
                break;
            case R.id.btn4:
                Intent e = new Intent(hijab.this, papink.class);
                startActivity(e);
                break;
        }
    };
}