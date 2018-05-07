package com.example.s132970.prototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {


    EditText getName;
    public static String username;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = "";
         getName = findViewById(R.id.RegNameTxt);


        Button regRegister = (Button) findViewById(R.id.RegRegisterBtn);
        regRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View regRegister) {

                username = getName.getText().toString();

                Intent regRegisterIntent = new Intent(getApplicationContext(), MainscreenActivity.class);
                startActivity(regRegisterIntent);
            }
        });



    }
}
