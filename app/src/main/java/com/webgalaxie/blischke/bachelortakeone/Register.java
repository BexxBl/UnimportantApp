package com.webgalaxie.blischke.bachelortakeone;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    Button registerBTN;
    TextView backtoLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        backtoLogin = (TextView) findViewById(R.id.back_to_login);
        backtoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LoginScreen.class));
            }
        });

        registerBTN = (Button) findViewById(R.id.registerBTN);
        registerBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "User will be registered when clicking this Button", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
