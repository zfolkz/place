package com.placesapp.activity;


import android.content.Intent;
import android.location.Location;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.placesapp.adapter.PlacesViewPagerAdapter;
import com.placesapp.R;
import com.placesapp.bus.PlacesBus;
import com.placesapp.fragment.FavoriteFragment;
import com.placesapp.fragment.NearbyFragment;
import com.placesapp.model.LocationData;
import com.placesapp.model.OverQueryLimit;


public class MainActivity extends BaseActivity {
    private TabLayout tabLayout;
    private Toolbar toolbar;
    ViewPager viewPager;
    private PlacesViewPagerAdapter placesViewPagerAdapter;
    PlacesOnPageChangeListener placesOnPageChangeListener = new PlacesOnPageChangeListener();
    private boolean firstLoad = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstances();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == NearbyFragment.REQUEST_CODE && resultCode == NearbyFragment.RESULT_CODE){
            viewPager.setCurrentItem(0);
            if (data==null){
                ((NearbyFragment) placesViewPagerAdapter.getItem(viewPager.getCurrentItem())).setOver_limit(true);
            }
            ((NearbyFragment) placesViewPagerAdapter.getItem(viewPager.getCurrentItem())).showed();
        }
    }

    @Override
    void setLocation(Location location) {

        if (firstLoad){
            firstLoad = false;
            LocationData.getInstance().setLocation(location);
            LocationData.getInstance().getLocation().distanceTo(location);
            PlacesBus.getInstance().post(LocationData.getInstance());
        }
    }

    private void initInstances() {
        tabLayout = (TabLayout) findViewById(R.id.main_tabLayout);
        toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        setUpPageViewPager();
        tabLayout.setupWithViewPager(viewPager);

    }
    public void setUpPageViewPager(){
        viewPager = (ViewPager) findViewById(R.id.main_viewPager);

        placesViewPagerAdapter = new PlacesViewPagerAdapter(getSupportFragmentManager());
        placesViewPagerAdapter.addFragment(NearbyFragment.newInstance("",""),"Nearby");
        placesViewPagerAdapter.addFragment(FavoriteFragment.newInstance("",""),"Favorite");
        viewPager.setAdapter(placesViewPagerAdapter);

        viewPager.addOnPageChangeListener(placesOnPageChangeListener);
        viewPager.post(new Runnable() {
            @Override
            public void run() {
                placesOnPageChangeListener.onPageSelected(viewPager.getCurrentItem());
            }
        });
    }

    public class PlacesOnPageChangeListener implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            if (position == 0) {
                ((NearbyFragment) placesViewPagerAdapter.getItem(position)).showed();
            }else{
                ((FavoriteFragment) placesViewPagerAdapter.getItem(position)).showed();
            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        PlacesBus.getInstance().register(this);
    }
    @Override
    protected void onStop() {
        super.onStop();
        PlacesBus.getInstance().unregister(this);
    }
}
