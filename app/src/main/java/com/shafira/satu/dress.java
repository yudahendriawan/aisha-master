package com.shafira.satu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dress extends AppCompatActivity implements View.OnClickListener {
    Button ab;
    Button de;
    Button gh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dress);

        ab = findViewById(R.id.btn5);
        ab.setOnClickListener(this);

        de = findViewById(R.id.btn6);
        de.setOnClickListener(this);

        gh = findViewById(R.id.btn7);
        gh.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn5:
                Intent j = new Intent(dress.this, abc.class);
                startActivity(j);
                break;
            case R.id.btn6:
                Intent k = new Intent(dress.this, def.class);
                startActivity(k);
                break;
            case R.id.btn7:
                Intent l = new Intent(dress.this, ghi.class);
                startActivity(l);
                break;
        }
    };
}