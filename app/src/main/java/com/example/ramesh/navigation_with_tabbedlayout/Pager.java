package com.example.ramesh.navigation_with_tabbedlayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by J.yugandhar on 19-06-2017.
 */
class Pager extends FragmentStatePagerAdapter {
    private int count;
     Pager(FragmentManager fm,int count) {
        super(fm);
        this.count  =   count;
    }
    @Override
    public Fragment getItem(int position) {
        Tab1 tab1    =   null;
        Tab2 tab2    =   null;
        Tab3 tab3    =   null;
        switch (position) {
            case 0:
                 tab1 = new Tab1();
                return tab1;
            case 1:
                 tab2 = new Tab2();
                return tab2;
            case 2:
                 tab3 = new Tab3();
                return tab3;
            default:
            return null;
        }
    }
    @Override
    public int getCount() {
        return count;
    }
}