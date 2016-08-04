package com.xjtuse.administrator.android_client;

import android.support.v4.app.Fragment;

public class HeadActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new HeadFragment();
    }
}
