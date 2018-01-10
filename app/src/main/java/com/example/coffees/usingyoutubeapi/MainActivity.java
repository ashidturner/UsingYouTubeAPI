package com.example.coffees.usingyoutubeapi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    YouTubePlayerView youtube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        youtube = (YouTubePlayerView) findViewById(R.id.youtubeView);
        youtube.initialize("AIzaSyC4sJ_48pGErUYBU2K8ej3vDUMjNrFptic",this); // this will be used to verify the api key, here qeuest goes to youtube server
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        youTubePlayer.loadVideo("-K9ujx8vO_A"); // this is the unique name which can be copy paste from url
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

        /*  Intent in = new Intent();
        in.setAction(Intent.ACTION_VIEW);
        in.setData(Uri.parse("https://www.youtube.com/result?search_query=-K9ujx8vO_A"));
        startActivity(in);*/
    }
}
