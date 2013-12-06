package net.orbitalchainsaw.andro.yshare;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class SearchResultsActivity extends FragmentActivity{
	FragmentManager fragManager;
	private static final int NUM_PAGES = 3;
	
	private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
            //Social
			case 0:
				SearchResultsSocialFragment socialFragment = new SearchResultsSocialFragment();
				return socialFragment;
			case 1:
				SearchResultsEventsFragment eventsFragment = new SearchResultsEventsFragment();
				return eventsFragment;
			default:
				SearchResultsSocialFragment fragment = new SearchResultsSocialFragment();
				return fragment;
			}
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }

	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		fragManager = this.getSupportFragmentManager();
		setContentView(R.layout.activity_search_results);
		
		ViewPager mViewPager = (ViewPager)findViewById(R.id.searchResultsPager);
		PagerAdapter mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
		mViewPager.setAdapter(mPagerAdapter);
		
	}

}
