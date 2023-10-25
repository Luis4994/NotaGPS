package com.example.notagps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Menu extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        videoView = (VideoView) findViewById(R.id.video);
        String video = "android.resource://"+getPackageName()+"/"+R.raw.videosanto;
        Uri uri = Uri.parse(video);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }
    public void sedes(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}