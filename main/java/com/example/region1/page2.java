package com.example.region1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity implements View.OnClickListener{
    Button btn_lu, btn_in, btn_is, btn_p, btn_aboutilocos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        btn_lu = findViewById(R.id.btn_lu);
        btn_in = findViewById(R.id.btn_in);
        btn_is = findViewById(R.id.btn_is);
        btn_p = findViewById(R.id.btn_p);
        btn_aboutilocos = findViewById(R.id.btn_aboutilocos);

        btn_lu.setOnClickListener(this);
        btn_in.setOnClickListener(this);
        btn_is.setOnClickListener(this);
        btn_p.setOnClickListener(this);
        btn_aboutilocos.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent goToExplore = new Intent(page2.this, page3.class);

        switch(view.getId()){
            case R.id.btn_lu:
                goToExplore.putExtra("key_province", "La Union");
                goToExplore.putExtra("description", getString(R.string.description_launion));

                startActivity(goToExplore);
                break;
            case R.id.btn_in:
                goToExplore.putExtra("key_province", "Ilocos Norte");
                goToExplore.putExtra("description", getString(R.string.description_ilocosnorte));

                startActivity(goToExplore);
                break;

            case R.id.btn_is:
                goToExplore.putExtra("key_province", "Ilocos Sur");
                goToExplore.putExtra("description", getString(R.string.description_ilocossur));

                startActivity(goToExplore);
                break;

            case R.id.btn_p:
                goToExplore.putExtra("key_province", "Pangasinan");
                goToExplore.putExtra("description", getString(R.string.description_pangasinan));

                startActivity(goToExplore);
                break;

            case R.id.btn_aboutilocos:
                Intent goToAbout = new Intent(page2.this, page6.class);

                goToAbout.putExtra("key_name", "Ilocos");
                goToAbout.putExtra("description", getString(R.string.description_ilocos));
                startActivity(goToAbout);
                break;
        }
    }
}