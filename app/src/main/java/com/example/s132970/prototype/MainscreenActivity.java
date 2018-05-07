package com.example.s132970.prototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainscreenActivity extends AppCompatActivity {

    static boolean MSVisVis = true;
    static boolean MSRecVis = true;
    static boolean MSGuideVis = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);

        TextView PersonalWelcome = (TextView) findViewById(R.id.MSPersonalWelcomeTxt);
        String concatenated = (String) "Welcome " + RegisterActivity.username;
        PersonalWelcome.setText(concatenated);

        //^WHY DOES THIS NOT WORK!?



        //login status
        boolean loggedin = true;
        //login status


        if(!loggedin) {
            Intent loginpage = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(loginpage);
        }

        Button logout = (Button) findViewById(R.id.MSLogoutBtn);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View logout) {
                startActivity(new Intent(MainscreenActivity.this, popup.class));
            }
        });

        Button options = (Button) findViewById(R.id.MSOptionsBtn);
        options.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View options) {
                Intent MSOptions = new Intent(getApplicationContext(), OptionsActivity.class);
                startActivity(MSOptions);
            }
        });



        Button MSVisualizationBtn = (Button) findViewById(R.id.MSVisualizationBtn);
        Button MSRecommendationBtn = (Button) findViewById(R.id.MSRecommendationBtn);
        Button MSGuidanceBtn = (Button) findViewById(R.id.MSGuidanceBtn);

        if(MSVisVis) {
            MSVisualizationBtn.setVisibility(View.VISIBLE);
        } else {
            MSVisualizationBtn.setVisibility(View.INVISIBLE);
        }

        if(MSRecVis) {
            MSRecommendationBtn.setVisibility(View.VISIBLE);
        } else {
            MSRecommendationBtn.setVisibility(View.INVISIBLE);
        }

        if(MSGuideVis) {
            MSGuidanceBtn.setVisibility(View.VISIBLE);
        } else {
            MSGuidanceBtn.setVisibility(View.INVISIBLE);

        }


        final Intent MSVisualization = new Intent(getApplicationContext(), VisualizationActivity.class);
        final Intent MSRecommendation = new Intent(getApplicationContext(), RecommendationActivity.class);
        final Intent MSGuidance = new Intent(getApplicationContext(), GuidanceActivity.class);

        MSVisualizationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(MSVisualization);
            }
        });

        MSRecommendationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(MSRecommendation);
            }
        });

        MSGuidanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(MSGuidance);
            }
        });







    }



}
