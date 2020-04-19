package com.programmaster.osakashopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaymentMethod extends AppCompatActivity {

    Button btn_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);

        btn_info = findViewById(R.id.paymentAdd_btn);

        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaymentMethod.this,PaymentInfo.class);
                startActivity(intent);
            }
        });

    }
}
