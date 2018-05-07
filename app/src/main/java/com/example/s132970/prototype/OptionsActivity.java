package com.example.s132970.prototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.Switch;

public class OptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

            final Switch SwitchVis = (Switch) findViewById(R.id.SwitchVis);
            final Switch SwitchRec = (Switch) findViewById(R.id.SwitchRec);
            final Switch SwitchGuide = (Switch) findViewById(R.id.SwitchGuide);



            SwitchVis.setChecked(MainscreenActivity.MSVisVis);
            SwitchRec.setChecked(MainscreenActivity.MSRecVis);
            SwitchGuide.setChecked(MainscreenActivity.MSGuideVis);

            SwitchVis.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean VOn) {
                    if(SwitchVis.isChecked()) {
                        MainscreenActivity.MSVisVis = true;
                    } else {
                        MainscreenActivity.MSVisVis = false;
                    }
                }
            });

            SwitchRec.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean ROn) {
                    if(SwitchRec.isChecked()) {
                        MainscreenActivity.MSRecVis = true;
                    } else {
                        MainscreenActivity.MSRecVis = false;
                    }
                }
            });

            SwitchGuide.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean GOn) {
                    if(SwitchGuide.isChecked()) {
                        MainscreenActivity.MSGuideVis = true;
                    } else {
                        MainscreenActivity.MSGuideVis = false;
                    }
                }
            });
    }

    @Override
    public void onBackPressed() {
        Intent temporary = new Intent(getApplicationContext(), MainscreenActivity.class);
        startActivity(temporary);

    }
}
