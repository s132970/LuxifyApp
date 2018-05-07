package com.example.s132970.prototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        Button login = (Button) findViewById(R.id.LoginBtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View login) {
                Intent loginIntent = new Intent(getApplicationContext(), MainscreenActivity.class);
                startActivity(loginIntent);
            }
        });

        TextView register = (TextView) findViewById(R.id.RegisterTxtClickable);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View register) {
                Intent  registerIntent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(registerIntent);
            }

        });



    }
}
