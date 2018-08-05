package za.co.greenly.greenly.View;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
   private int mNumOfTabs = 2;
   public HistoryFragment tabHistory = new HistoryFragment();
   public VoucherFragment tabVoucher = new VoucherFragment();

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return tabHistory;
            case 1:
                return tabVoucher;
        }
        return null;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "History";
            case 1: return "Vouchers";
        }

        return "";
    }
}
