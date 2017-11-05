package com.webgalaxie.blischke.bachelortakeone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    CardView all_expose_card, add_expose_card, my_account_card, settings_card, abmelden_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        all_expose_card = findViewById(R.id.all_expose_card);
        add_expose_card = findViewById(R.id.add_expose_card);
        my_account_card = findViewById(R.id.my_account_card);
        settings_card = findViewById(R.id.settings_card);
        abmelden_card = findViewById(R.id.abmelden_card);


        all_expose_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Show all Expose", Toast.LENGTH_LONG).show();
            }
        });
        add_expose_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Add new Expose", Toast.LENGTH_LONG).show();
            }
        });
        my_account_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Show my Account Details", Toast.LENGTH_LONG).show();
            }
        });
        settings_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Show Settings Activity", Toast.LENGTH_LONG).show();
            }
        });
        abmelden_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LoginScreen.class));
            }
        });
    }


}
