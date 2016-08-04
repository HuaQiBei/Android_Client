package com.xjtuse.administrator.android_client;

import android.support.v4.app.Fragment;

public class ResetActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new PhoneFragment();
    }

}
