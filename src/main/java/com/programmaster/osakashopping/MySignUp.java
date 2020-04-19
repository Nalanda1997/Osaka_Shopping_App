package com.programmaster.osakashopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class MySignUp extends AppCompatActivity {

    TextInputLayout regName, regUsername, regEmail, regPhoneNo, regPassword;
    Button regBtn, regToLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_sign_up);

        regName = findViewById(R.id.name);
        regUsername = findViewById(R.id.username);
        regEmail = findViewById(R.id.email);
        regPhoneNo = findViewById(R.id.phoneNo);
        regPassword = findViewById(R.id.password);
        regBtn = findViewById(R.id.submit_btn);
        regToLoginBtn = findViewById(R.id.btn_signLog);

        regToLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MySignUp.this,MyLogin.class);
                startActivity(intent);
            }
        });

    }
}
