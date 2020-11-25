package com.example.region1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class page5 extends AppCompatActivity implements View.OnClickListener {
    Button btn_back;
    TextView lbl_province, lbl_features, lbl_description;
    ImageView img_location;
    String key_item, key_province, key_feature;

    //items for la union
    private ItemPage[] la_union_restaurants = new ItemPage[]{
            new ItemPage(R.string.olas_banditos, R.drawable.loc_lu_r_ob),
            new ItemPage(R.string.surf_shack, R.drawable.loc_lu_r_ss),
            new ItemPage(R.string.mad_monkeys, R.drawable.loc_lu_r_mm),
            new ItemPage(R.string.tagpuan, R.drawable.loc_lu_r_t)
    };

    private ItemPage[] la_union_landmarks = new ItemPage[]{
            new ItemPage(R.string.macho_temple, R.drawable.loc_lu_l_mt),
            new ItemPage(R.string.balay_na_bato, R.drawable.loc_lu_l_bb),
            new ItemPage(R.string.tangadan_falls, R.drawable.loc_lu_l_tf),
            new ItemPage(R.string.urbiztondo_beach, R.drawable.loc_lu_l_ub),
            new ItemPage(R.string.luna_watch_tower, R.drawable.loc_lu_l_lwt)
    };

    //items for ilocos norte
        //step 1: create for example, ItemPage[] ilocos_norte_landmarks = new ItemPage{
        //      new ItemPage(string description of landmark1, picture of landmark1's location),
        //      new ItemPage(string description of landmark2, picture of landmark2's location)};
            //for culture and delicacy, hardcode na dun sa case statement
    //items for ilocos sur
    //items for pangasinan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(this);

        lbl_province = findViewById(R.id.lbl_province);
        lbl_features = findViewById(R.id.lbl_features);
        lbl_description = findViewById(R.id.lbl_description);

        key_item = getIntent().getStringExtra("key_item");
        key_province = getIntent().getStringExtra("key_province");
        key_feature = getIntent().getStringExtra("key_feature");

        lbl_province.setText(key_province);
        lbl_features.setText(key_feature);

        img_location = findViewById(R.id.img_location);

        //eto
        ViewPager viewPager = findViewById(R.id.viewpager);
        ImageAdapter adapter = new ImageAdapter(this, key_item);
        viewPager.setAdapter(adapter);

        switch(key_province){
            case "La Union":
                switch(key_item){
                    //landmarks
                    case "Ma-cho Temple":
                        lbl_description.setText(getString(la_union_landmarks[0].getStringResId()));
                        img_location.setBackgroundResource(la_union_landmarks[0].getLocation());
                        break;
                    case "Balay na Bato":
                        lbl_description.setText(getString(la_union_landmarks[1].getStringResId()));
                        img_location.setBackgroundResource(la_union_landmarks[1].getLocation());
                        break;
                    case "Tangadan Falls":
                        lbl_description.setText(getString(la_union_landmarks[2].getStringResId()));
                        img_location.setBackgroundResource(la_union_landmarks[2].getLocation());
                        break;
                    case "Urbiztondo Beach":
                        lbl_description.setText(getString(la_union_landmarks[3].getStringResId()));
                        img_location.setBackgroundResource(la_union_landmarks[3].getLocation());
                        break;
                    case "Luna's Watch Tower":
                        lbl_description.setText(getString(la_union_landmarks[4].getStringResId()));
                        img_location.setBackgroundResource(la_union_landmarks[4].getLocation());
                        break;
                    //restaurants
                    case "Olas Banditos":
                        lbl_description.setText(getString(la_union_restaurants[0].getStringResId()));
                        img_location.setBackgroundResource(la_union_restaurants[0].getLocation());
                        break;
                    case "Surf Shack":
                        lbl_description.setText(getString(la_union_restaurants[1].getStringResId()));
                        img_location.setBackgroundResource(la_union_restaurants[1].getLocation());
                        break;
                    case "Mad Monkeys":
                        lbl_description.setText(getString(la_union_restaurants[2].getStringResId()));
                        img_location.setBackgroundResource(la_union_restaurants[2].getLocation());
                        break;
                    case "Tagpuan sa San Juan":
                        lbl_description.setText(getString(la_union_restaurants[3].getStringResId()));
                        img_location.setBackgroundResource(la_union_restaurants[3].getLocation());
                        break;
                    //delicacies
                    case "Halo-Halo de Iloko":
                        lbl_description.setText(getString(R.string.halohalo_de_iloko));
                        img_location.setVisibility(View.GONE);
                        break;
                    case "Sabong Fried Chicken":
                        lbl_description.setText(getString(R.string.sabong_fried_chicken));
                        img_location.setVisibility(View.GONE);
                        break;
                    //culture
                    case "Dinengdeng Festival":
                        lbl_description.setText(getString(R.string.dinengdeng_festival));
                        img_location.setVisibility(View.GONE);
                        break;
                    case "Miss La Union":
                        lbl_description.setText(getString(R.string.miss_lu));
                        img_location.setVisibility(View.GONE);
                        break;
                }
                break;
            case "Ilocos Norte":
                switch(key_item){
                    //case name here
                }
                break;
            case "Ilocos Sur":
                break;

            case "Pangasinan":
                break;
        }
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn_back:
                Intent goBack = new Intent(page5.this, page4.class);
                                      goBack.putExtra("key_province", key_province);
                goBack.putExtra("key_feature", key_feature);

                startActivity(goBack);
                break;
        }
    }

}