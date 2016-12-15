package com.rama.videoview;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.VideoView;
import android.widget.MediaController;

public class MainActivity extends Activity {

    private VideoView videoView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.videoView)    ;
        videoView.setVideoPath("http://www.regilog.esy.es/videos/RegilogApps.mp4");

        //Player controls play, pause, stop etc.
        MediaController mediaController = new MediaController(this) ;
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }
}