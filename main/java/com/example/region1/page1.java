package com.example.region1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        Button btnletsgo = findViewById(R.id.btn_continue);
        VideoView videoView = (VideoView)findViewById(R.id.videoView);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.videobg);
        videoView.setVideoURI(uri);

        videoView.start();

        btnletsgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToExplore = new Intent(page1.this, page2.class);

                startActivity(goToExplore);
            }
        });
    }
}