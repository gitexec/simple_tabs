package com.neybapps.apps.webfrane;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by wington on 3/5/17.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    CharSequence titles[];
    int numbOfTabs;


    public ViewPagerAdapter(FragmentManager fragmentManager, CharSequence[] mTitles, int mNumOfTabs){
        super(fragmentManager);
        this.titles = mTitles;
        this.numbOfTabs = mNumOfTabs;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if(position == 0){
            Tab1 tab1 = new Tab1();
            return tab1;
        }
        else{
            Tab2 tab2 = new Tab2();
            return tab2;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public int getCount() {
        return numbOfTabs;
    }
}
