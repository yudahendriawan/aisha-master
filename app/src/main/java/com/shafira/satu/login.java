package com.shafira.satu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private EditText uname;
    private EditText pw;
    private Button Login;
    String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        uname = (EditText) findViewById(R.id.editUsername);
        pw = (EditText) findViewById(R.id.Password);
        Login = (Button) findViewById(R.id.btn_login);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(uname.getText().toString(), pw.getText().toString());
            }
        });
    }
    private void validate(String user, String pass) {
        if((user.equals("admin")) && (pass.equals("admin"))) {
            Intent intent = new Intent(login.this, second.class);
            startActivity(intent);
            finish();
        }
        else {
            Toast.makeText(getApplicationContext(), "Login Anda Gagal", Toast.LENGTH_LONG).show();
            uname.setText("");
            pw.setText("");
            uname.requestFocus();
        }
    }
}
