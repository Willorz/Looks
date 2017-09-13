package com.ed.will.looks.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ed.will.looks.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by will on 17-9-13.
 */

public class HomePagerAdapter extends FragmentPagerAdapter {
    private final List<BaseFragment> mFragments=new ArrayList<>();
    private final List<String> mFragmentTitles=new ArrayList<>();


    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
    }


    public void addFragment(BaseFragment fragment,String title){
        mFragments.add(fragment);
        mFragmentTitles.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    public CharSequence getPafeTitle(int position){
        return mFragmentTitles.get(position);
    }
}
