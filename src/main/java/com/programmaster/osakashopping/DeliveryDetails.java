package com.programmaster.osakashopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeliveryDetails extends AppCompatActivity {

    Button btn_manage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_details);

        btn_manage = findViewById(R.id.manageAdd_btn);
        btn_manage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DeliveryDetails.this,ManageAddress.class);
                startActivity(intent);
            }
        });

    }
}
