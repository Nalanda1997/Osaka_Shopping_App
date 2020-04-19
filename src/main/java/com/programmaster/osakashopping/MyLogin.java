package com.programmaster.osakashopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MyLogin extends AppCompatActivity {

    Button callSignUp , forgetPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_my_login);

        callSignUp = findViewById(R.id.signup_screen);
        forgetPass = findViewById(R.id.btn_forgetPass);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            callSignUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MyLogin.this,MySignUp.class);
                    startActivity(intent);
                }

            });
        }

        forgetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyLogin.this,ForgetPassword.class);
                startActivity(intent);
            }
        });

    }
}
