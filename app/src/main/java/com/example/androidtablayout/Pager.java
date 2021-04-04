package com.example.androidtablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Pager extends FragmentStatePagerAdapter {
   //integer to count number of tabs
   int tabCount;

   //constructor to the class
    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        //initializing tab count
        this.tabCount= tabCount;
    }
    //Overriding method getItem
    @NonNull
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                Tab1 tab1= new Tab1();
                return tab1;
            case 1:
                Tab2 tab2 = new Tab2();
                return  tab2;
            case 2:
                Tab3 tab3 = new Tab3();
                return tab3;
            default:
                return null;

        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount(){
        return tabCount;
    }
}
