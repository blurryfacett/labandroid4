package com.example.labandroid4;

import android.os.Bundle;
import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends Activity {
    GLRenderer render = new GLRenderer(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        GLSurfaceView canvas = new GLSurfaceView(this);
        canvas.setEGLContextClientVersion(2);
        canvas.setRenderer(render);
        canvas.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
        setContentView(canvas);
    }
}