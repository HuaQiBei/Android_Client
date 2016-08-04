package com.xjtuse.administrator.android_client;

import android.os.Bundle;
import android.support.v4.app.Fragment;
<<<<<<< Updated upstream
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by WuJiang on 2016/8/1.
 */
=======
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

>>>>>>> Stashed changes
public abstract class SingleFragmentActivity extends AppCompatActivity {

    protected abstract Fragment createFragment();

    @Override
<<<<<<< Updated upstream
    public void onCreate(Bundle savedInstanceState) {
        Log.d("test","SingleFragmentActivity");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fragment);
=======
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

>>>>>>> Stashed changes
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
}
