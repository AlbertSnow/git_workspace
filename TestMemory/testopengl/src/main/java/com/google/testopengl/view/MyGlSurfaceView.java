package com.google.testopengl.view;

import android.content.Context;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Administrator on 2016/8/10.
 */

public class MyGlSurfaceView extends GLSurfaceView {
    private final MyGlRender mRenderer;

    public MyGlSurfaceView(Context context) {
        super(context);
        setEGLContextClientVersion(2);
        mRenderer = new MyGlRender();
        setRenderer(mRenderer);
        setRenderMode(RENDERMODE_CONTINUOUSLY);
    }

    @Override
    public void onPause() {
        super.onPause();
//        mRenderer.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
//        mRenderer.onResume();
    }



    private static class MyGlRender implements Renderer {

        private final float[] mtrxProjection = new float[16];
//        private final float[] mTrxView


        @Override
        public void onSurfaceCreated(GL10 gl, EGLConfig config) {

        }

        @Override
        public void onSurfaceChanged(GL10 gl, int width, int height) {

        }

        @Override
        public void onDrawFrame(GL10 gl) {

        }
    }
}
