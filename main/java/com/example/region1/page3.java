package com.example.region1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page3 extends AppCompatActivity implements View.OnClickListener{

    Button goback, btn_d, btn_l, btn_c, btn_r, btn_aboutprovince;
    String key_province, description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        goback = findViewById(R.id.btn_back);
        btn_d = findViewById(R.id.btn_d);
        btn_c = findViewById(R.id.btn_c);
        btn_l = findViewById(R.id.btn_l);
        btn_r = findViewById(R.id.btn_r);
        btn_aboutprovince = findViewById(R.id.btn_aboutprovince);

        goback.setOnClickListener(this);
        btn_d.setOnClickListener(this);
        btn_c.setOnClickListener(this);
        btn_l.setOnClickListener(this);
        btn_r.setOnClickListener(this);
        btn_aboutprovince.setOnClickListener(this);

        key_province = getIntent().getStringExtra("key_province");
        description = getIntent().getStringExtra("description");

        TextView lbl_province = findViewById(R.id.lbl_province);
        lbl_province.setText(key_province);
    }

    @Override
    public void onClick(View view) {
        Intent goToFeatures = new Intent(page3.this, page4.class);

        switch(view.getId()){
            case R.id.btn_back:
                Intent goToHome = new Intent(page3.this, page2.class);

                startActivity(goToHome);
                break;

            case R.id.btn_l:
                goToFeatures.putExtra("key_feature", "Landmarks");
                goToFeatures.putExtra("key_province", key_province);

                startActivity(goToFeatures);
                break;

            case R.id.btn_d:
                goToFeatures.putExtra("key_feature", "Delicacies");
                goToFeatures.putExtra("key_province", key_province);

                startActivity(goToFeatures);
                break;

            case R.id.btn_r:
                goToFeatures.putExtra("key_feature", "Restaurants");
                goToFeatures.putExtra("key_province", key_province);

                startActivity(goToFeatures);
                break;

            case R.id.btn_c:
                goToFeatures.putExtra("key_feature", "Culture");
                goToFeatures.putExtra("key_province", key_province);

                startActivity(goToFeatures);
                break;

            case R.id.btn_aboutprovince:
                Intent goToAbout = new Intent(page3.this, page6.class);
                goToAbout.putExtra("key_name", key_province);
                goToAbout.putExtra("description", description);

                startActivity(goToAbout);
                break;
        }
    }
}