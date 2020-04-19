package com.programmaster.osakashopping;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    Button btn_profile, btn_login, btn_payment, btn_delivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.profile);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,BasePage.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.search:
                        startActivity(new Intent(getApplicationContext()
                                ,Search.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.notification:
                        startActivity(new Intent(getApplicationContext()
                                ,Notification.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.feedback:
                        startActivity(new Intent(getApplicationContext()
                                ,Feedback.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.profile:
                        return true;


                }
                return false;
            }
        });



        btn_profile = findViewById(R.id.btn_profile);
        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayProfile();
            }
        });

        btn_login = findViewById(R.id.login_button);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayLogin();
            }
        });

        btn_payment = findViewById(R.id.payment_button);
        btn_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayPayMethod();
            }
        });

        btn_delivery = findViewById(R.id.delivery_button);
        btn_delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayDelivery();
            }
        });



    }
    public void displayProfile(){
        Intent intent = new Intent(this,MyProfile.class);
        startActivity(intent);
    }

    public void displayLogin(){
        Intent intent = new Intent(this,MyLogin.class);
        startActivity(intent);
    }

    public void displayPayMethod(){
        Intent intent = new Intent(this,PaymentMethod.class);
        startActivity(intent);
    }

    public void displayDelivery(){
        Intent intent = new Intent(this,DeliveryDetails.class);
        startActivity(intent);
    }

}
