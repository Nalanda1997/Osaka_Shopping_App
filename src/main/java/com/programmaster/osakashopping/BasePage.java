package com.programmaster.osakashopping;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BasePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_page);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
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
                        startActivity(new Intent(getApplicationContext()
                                ,Profile.class));
                        overridePendingTransition(0,0);
                        return true;


                }
                return false;
            }
        });


    }
}
