package com.shafira.satu;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class second extends AppCompatActivity implements View.OnClickListener {
    Button prof;
    Button hijab;
    Button dress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        prof = findViewById(R.id.btnProfile);
        prof.setOnClickListener(this);

        hijab = findViewById(R.id.btnHijab);
        hijab.setOnClickListener(this);

        dress = findViewById(R.id.btnGamis);
        dress.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnProfile:
                Intent p = new Intent(second.this, profile.class);
                startActivity(p);
                break;
            case R.id.btnHijab:
                Intent h = new Intent(second.this, hijab.class);
                startActivity(h);
                break;
            case R.id.btnGamis:
                Intent d = new Intent(second.this, dress.class);
                startActivity(d);
                break;
        }

    }

    public void onBackPressed() {
//        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
//        alertDialogBuilder.setTitle("Exit");
//        alertDialogBuilder.setMessage("Are you sure you want to exit?");
//        alertDialogBuilder.setCancelable(false);
//        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                finish();
//                System.exit(0);
//            }
//        });
//        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(second.this, "You clicked on cancel", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        AlertDialog alertDialog = alertDialogBuilder.create();
//        alertDialog.show();
    }


}
