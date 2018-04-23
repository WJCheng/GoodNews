package abc.cheng.goodnews;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;

import java.util.Arrays;

import abc.cheng.goodnews.base.BaseActivity;
import abc.cheng.goodnews.widget.NewsFragmentPagerAdapter;
import butterknife.BindArray;
import butterknife.BindView;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";

    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @BindArray(R.array.news_tab)
    String[] tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setElevation(0f);
        }

        Log.i(TAG, "onCreate: " + Arrays.toString(tabs));
        viewPager.setAdapter(new NewsFragmentPagerAdapter(getSupportFragmentManager(), tabs));
    }
}
