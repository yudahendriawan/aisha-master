package com.shafira.satu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    TextView textView;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            progressBar = (ProgressBar) findViewById(R.id.progressBar);
            textView = (TextView) findViewById(R.id.welcome);

            progressBar.setMax(100);
            progressBar.setScaleY(3f);

            progressAnimation();

        }

    private void progressAnimation() {
        ProgressBarAnimation anim = new ProgressBarAnimation(this, progressBar, textView, 0f,100f);
        anim.setDuration(5000);
        progressBar.setAnimation(anim);
        }

    }

