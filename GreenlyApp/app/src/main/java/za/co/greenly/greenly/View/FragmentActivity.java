package za.co.greenly.greenly.View;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import za.co.greenly.greenly.R;

public class FragmentActivity extends AppCompatActivity {

    TabLayout mTabLayout;
    ViewPager mViewPager;
    ViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        if (getIntent() != null) {
            Toast.makeText(this, getIntent().getStringExtra("MaterialID"), Toast.LENGTH_LONG).show();
        }

//        Toolbar materialToolbar = findViewById(R.id.material_info_toolbar);
//        setUpToolbar(materialToolbar);
        mTabLayout = findViewById(R.id.material_info_tabs);
        mViewPager = findViewById(R.id.material_info_viewpager);
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        mViewPager.setAdapter(mViewPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpToolbar(Toolbar toolbar) {
        setSupportActionBar(toolbar);
        toolbar.setVisibility(View.VISIBLE);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Material");
            toolbar.setTitleTextColor(getResources().getColor(R.color.colorWhite));
        }
    }

}
