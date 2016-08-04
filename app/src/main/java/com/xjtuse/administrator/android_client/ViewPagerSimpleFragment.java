package com.xjtuse.administrator.android_client;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Elvira on 2016/8/4.
 */
public class ViewPagerSimpleFragment extends Fragment {
    private String mTitle;
    public static final String BUNDLE_TITLE = "title";

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        if (bundle != null) {
            mTitle = bundle.getString(BUNDLE_TITLE);
        }

        TextView pTextView = new TextView(getActivity());
        pTextView.setText(mTitle);
        pTextView.setGravity(Gravity.CENTER);

        return pTextView;
    }

    public static ViewPagerSimpleFragment newInstance(String title) {
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_TITLE, title);

        ViewPagerSimpleFragment fragment = new ViewPagerSimpleFragment();
        fragment.setArguments(bundle);

        return fragment;
    }
}
