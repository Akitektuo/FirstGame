package com.akitektuo.firstgame;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

/**
 * Created by AoD Akitektuo on 11-May-17 at 16:41.
 */

public class GameView extends GLSurfaceView {

    private final GameRenderer gameRenderer;

    public GameView(Context context) {
        super(context);
        setEGLContextClientVersion(2);
        gameRenderer = new GameRenderer(context);
        setRenderer(gameRenderer);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                if (x < getWidth() / 2) {
                    gameRenderer.setHeroMove(gameRenderer.getHeroMove() + .1f);
                }
                if (x > getWidth() / 2) {
                    gameRenderer.setHeroMove(gameRenderer.getHeroMove() - .1f);
                }
        }
        return true;
    }
}
