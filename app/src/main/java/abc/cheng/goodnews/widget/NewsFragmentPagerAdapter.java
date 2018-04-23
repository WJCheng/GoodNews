package abc.cheng.goodnews.widget;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class NewsFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] titles;

    private Fragment[] fragments;

    public NewsFragmentPagerAdapter(FragmentManager fm, String[] titles) {
        super(fm);
        this.titles = titles;
        this.fragments = new Fragment[titles.length];
        for (int i=0; i<titles.length; i++){
            this.fragments[i] = new NewsFragment();
        }
    }

    @Override
    public Fragment getItem(int position) {
        if (fragments != null) {
            return fragments[position];
        }
        return null;
    }

    @Override
    public int getCount() {
        return fragments != null ? fragments.length : 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles != null ? titles[position] : "News";
    }

}
