package com.mankhautunproject.bdalcorn.practicetablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter{

    int tabCount;

    public TabPagerAdapter(FragmentManager fm, int numTabs) {

        super(fm);
        this.tabCount = numTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                return new StatusFragment();
            case 1:
                return new LibraryFragment();
            case 2:
                return new HistoryFragment();
            case 3:
                return new ProfileFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
