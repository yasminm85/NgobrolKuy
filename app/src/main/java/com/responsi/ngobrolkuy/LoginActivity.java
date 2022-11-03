package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    TextView login,lupa_euy,belum_punya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.Loginmsk);
        lupa_euy=findViewById(R.id.lupa);
        belum_punya=findViewById(R.id.Belum);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String teks_username = username.getText().toString();
//                String teks_password = password.getText().toString();

                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);

//                intent.putExtra("KEY_USERNAME",teks_username);
//                intent.putExtra("KEY_PASSWORD", teks_password);
                startActivity(intent);
            }
        });

        lupa_euy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, LupaPasswordActivity.class);
                startActivity(intent);
            }
        });

        belum_punya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

    }
}