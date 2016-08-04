package com.xjtuse.administrator.android_client;

import android.support.v4.app.Fragment;
import android.os.Bundle;

public class MyInfoActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new MyInfoFragment();
    }

}
