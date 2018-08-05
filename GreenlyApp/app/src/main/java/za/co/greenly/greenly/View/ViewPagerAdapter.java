package za.co.greenly.greenly.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    String material_id;

    public ViewPagerAdapter(FragmentManager fm, String materialID) {
        super(fm);
        material_id = materialID;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                MaterialFragment materialFrag = new MaterialFragment();
                materialFrag.setArguments(setArgs());
                return materialFrag;
            }
            case 1: {
                DropOffFragment dropOffFrag = new DropOffFragment();
                dropOffFrag.setArguments(setArgs());
                return dropOffFrag;
            }
            case 2: {
                CollectionFragment collectionFrag = new CollectionFragment();
                collectionFrag.setArguments(setArgs());
                return collectionFrag;
            }
        }

        return null;
    }

    private Bundle setArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("Material_ID", material_id);
        return bundle;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "Material";
            case 1: return "Drop-Off";
            case 2: return "Collection";
        }

        return "";
    }
}
