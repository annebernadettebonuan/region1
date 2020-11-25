package com.example.region1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class page4 extends AppCompatActivity{
    Button item1, item2, item3, item4, item5, btn_back;
    TextView lbl_features, lbl_province;
    String key_feature, key_province;

    private Features[] la_union_landmarks = new Features[]{
            new Features(R.drawable.btn_lu_l_mt, "Ma-cho Temple"), //first image
            new Features(R.drawable.btn_lu_l_bnb, "Balay na Bato"), //second
            new Features(R.drawable.btn_lu_l_tf, "Tangadan Falls"),
            new Features(R.drawable.btn_lu_l_ub, "Urbiztondo Beach"),
            new Features(R.drawable.btn_lu_l_lwt, "Luna's Watch Tower")};
    private Features[] la_union_restaurants = new Features[]{
            new Features(R.drawable.btn_lu_r_ob, "Olas Banditos"),
            new Features(R.drawable.btn_lu_r_mm, "Mad Monkeys"),
            new Features(R.drawable.btn_lu_r_ss, "Surf Shack"),
            new Features(R.drawable.btn_lu_r_t, "Tagpuan sa San Juan")};
    private Features[] la_union_delicacies = new Features[]{
            new Features(R.drawable.btn_lu_d_hhi, "Halo-Halo de Iloko"),
            new Features(R.drawable.btn_lu_d_sfc, "Sabong Fried Chicken")};
    private Features[] la_union_culture = new Features[]{
            new Features(R.drawable.btn_lu_c_df, "Dinengdeng Festival"),
            new Features(R.drawable.btn_lu_c_mlu, "Miss La Union")};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        btn_back = findViewById(R.id.btn_back);
        item1 = findViewById(R.id.item1);
        item2 = findViewById(R.id.item2);
        item3 = findViewById(R.id.item3);
        item4 = findViewById(R.id.item4);
        item5 = findViewById(R.id.item5);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToExplore = new Intent(page4.this, page3.class);
                goToExplore.putExtra("key_province", key_province);
                switch(key_province){
                    case "La Union":
                        goToExplore.putExtra("description", getString(R.string.description_launion));
                        break;
                    case "Ilocos Norte":
                        goToExplore.putExtra("description", getString(R.string.description_ilocosnorte));
                        break;
                    case "Ilocos Sur":
                        goToExplore.putExtra("description", getString(R.string.description_ilocossur));
                        break;
                    case "Pangasinan":
                        goToExplore.putExtra("description", getString(R.string.description_pangasinan));
                        break;
                }
                startActivity(goToExplore);
            }
        });

        lbl_features = findViewById(R.id.lbl_features);
        lbl_province = findViewById(R.id.lbl_province);

        key_feature = getIntent().getStringExtra("key_feature");
        key_province = getIntent().getStringExtra("key_province");

        lbl_features.setText(key_feature);
        lbl_province.setText(key_province);

        switch (key_province){
            case "La Union":
                switch(key_feature){
                    case "Landmarks":
                        item1.setBackgroundResource(la_union_landmarks[0].getResId());
                        item2.setBackgroundResource(la_union_landmarks[1].getResId());
                        item3.setBackgroundResource(la_union_landmarks[2].getResId());
                        item4.setBackgroundResource(la_union_landmarks[3].getResId());
                        item5.setBackgroundResource(la_union_landmarks[4].getResId());

                        addKeys(item1, la_union_landmarks, 0);
                        addKeys(item2, la_union_landmarks, 1);
                        addKeys(item3, la_union_landmarks, 2);
                        addKeys(item4, la_union_landmarks, 3);
                        addKeys(item5, la_union_landmarks, 4);
                        break;
                    case "Restaurants":
                        item1.setBackgroundResource(la_union_restaurants[0].getResId());
                        item2.setBackgroundResource(la_union_restaurants[1].getResId());
                        item3.setBackgroundResource(la_union_restaurants[2].getResId());
                        item4.setBackgroundResource(la_union_restaurants[3].getResId());
                        item5.setVisibility(View.GONE);

                        addKeys(item1, la_union_restaurants, 0);
                        addKeys(item2, la_union_restaurants, 1);
                        addKeys(item3, la_union_restaurants, 2);
                        addKeys(item4, la_union_restaurants, 3);
                        break;
                    case "Delicacies":
                        item1.setBackgroundResource(la_union_delicacies[0].getResId());
                        item2.setBackgroundResource(la_union_delicacies[1].getResId());
                        item3.setVisibility(View.GONE);
                        item4.setVisibility(View.GONE);
                        item5.setVisibility(View.GONE);

                        addKeys(item1, la_union_delicacies, 0);
                        addKeys(item2, la_union_delicacies, 1);
                        break;
                    case "Culture":
                        item1.setBackgroundResource(la_union_culture[0].getResId());
                        item2.setBackgroundResource(la_union_culture[1].getResId());
                        item3.setVisibility(View.GONE);
                        item4.setVisibility(View.GONE);
                        item5.setVisibility(View.GONE);

                        addKeys(item1, la_union_culture, 0);
                        addKeys(item2, la_union_culture, 1);
                        break;
                }
                break;
            case "Ilocos Norte":
                break;
        }
    }

    public void addKeys(Button button, Features[] features, int i){
        final Intent goToItemPage = new Intent(page4.this, page5.class);

        goToItemPage.putExtra("key_province", key_province);
        goToItemPage.putExtra("key_feature", key_feature);
        goToItemPage.putExtra("key_item", features[i].getName());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(goToItemPage);
            }
        });
    }
}