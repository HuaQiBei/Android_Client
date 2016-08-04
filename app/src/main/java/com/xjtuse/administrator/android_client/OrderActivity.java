package com.xjtuse.administrator.android_client;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderActivity extends FragmentActivity {

    private ViewPagerIndicator mIndicator;
    private ViewPager mViewPager;

    private List<String> mTitles = Arrays.asList("全部", "待支付", "生效中", "理赔中", "已失效");
    private List<ViewPagerSimpleFragment> mContents = new ArrayList<ViewPagerSimpleFragment>();

    private FragmentPagerAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //隐藏Action Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_order);
        
        initViews();
        initData();

        mViewPager.setAdapter(mAdapter);
        
    }
    private void initViews() {
        mViewPager = (ViewPager) findViewById(R.id.id_viewpager);
        mIndicator = (ViewPagerIndicator) findViewById(R.id.id_indicator);
    }


    private void initData() {
        for (String title : mTitles) {
            ViewPagerSimpleFragment fragment = ViewPagerSimpleFragment.newInstance(title);
            mContents.add(fragment);
        }

        mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mContents.get(position);
            }
            @Override
            public int getCount() {
                return mContents.size();
            }
        };
    }

}
