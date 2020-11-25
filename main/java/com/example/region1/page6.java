package com.example.region1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page6 extends AppCompatActivity {

    Button btn_back;
    String source, description;
    TextView lbl_province, lbl_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);

        btn_back = findViewById(R.id.btn_back);
        lbl_province = findViewById(R.id.lbl_province);
        lbl_description = findViewById(R.id.lbl_description);

        source = getIntent().getStringExtra("key_name");
        description = getIntent().getStringExtra("description");

        lbl_province.setText(source);
        lbl_description.setText(description);

        lbl_description.setMovementMethod(new ScrollingMovementMethod());

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                source = getIntent().getStringExtra("key_name");
                Intent goToExplore = new Intent(page6.this, page3.class);
                switch(source){
                    case "Ilocos":
                        Intent goBack = new Intent(page6.this, page2.class);
                        goBack.putExtra("key_province", source);
                        goBack.putExtra("description", description);

                        startActivity(goBack);
                        break;
                    case "La Union":
                        goToExplore.putExtra("key_province", "La Union");
                        goToExplore.putExtra("key_province", source);
                        goToExplore.putExtra("description", description);

                        startActivity(goToExplore);
                        break;
                    case "Ilocos Norte":
                        goToExplore.putExtra("key_province", "Ilocos Norte");
                        goToExplore.putExtra("key_province", source);
                        goToExplore.putExtra("description", description);

                        startActivity(goToExplore);
                        break;
                    case "Ilocos Sur":
                        goToExplore.putExtra("key_province", "Ilocos Sur");
                        goToExplore.putExtra("key_province", source);
                        goToExplore.putExtra("description", description);

                        startActivity(goToExplore);
                        break;
                    case "Pangasinan":
                        goToExplore.putExtra("key_province", "Pangasinan");
                        goToExplore.putExtra("key_province", source);
                        goToExplore.putExtra("description", description);

                        startActivity(goToExplore);
                        break;
                }
            }
        });
    }
}