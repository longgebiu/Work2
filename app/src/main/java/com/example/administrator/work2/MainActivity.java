package com.example.administrator.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "我被创建了！");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "我走到前台了 ");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "我被挡住了！");
        super.onStop();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "我失去了焦点了！" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "我挂了！");
    }
}
