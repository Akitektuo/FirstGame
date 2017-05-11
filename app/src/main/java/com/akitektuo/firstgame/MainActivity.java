package com.akitektuo.firstgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by AoD Akitektuo on 11-May-17 at 16:38.
 */

public class MainActivity extends AppCompatActivity {

    private GameView gameView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameView = new GameView(this);
        setContentView(gameView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        gameView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        gameView.onResume();
    }
}
