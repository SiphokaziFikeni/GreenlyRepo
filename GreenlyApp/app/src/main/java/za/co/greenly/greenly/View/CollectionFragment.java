package za.co.greenly.greenly.View;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import za.co.greenly.greenly.R;

public class CollectionFragment extends Fragment {

    String materialID = "";
    View rootLayout;

    public CollectionFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_collection_layout, container, false);
        rootLayout = rootView.findViewById(R.id.collection_background);
        Bundle args = getArguments();
        materialID = args.getString("Material_ID");

        switch (materialID.toLowerCase()) {
            case "metal": {
                rootLayout.setBackground(getActivity().getResources().getDrawable(R.drawable.metal_collection_bg, null));
            }
            break;
            case "glass": {
                rootLayout.setBackground(getActivity().getResources().getDrawable(R.drawable.cartons_collection, null));
            }
            break;
            case "paper": {
                rootLayout.setBackground(getActivity().getResources().getDrawable(R.drawable.paper_information, null));
            }
            break;
            case "plastic": {
                rootLayout.setBackground(getActivity().getResources().getDrawable(R.drawable.plastic_collection, null));
            }
            break;
            case "cartons": {
                rootLayout.setBackground(getActivity().getResources().getDrawable(R.drawable.cartons_collection, null));
            }
            break;
            case "batteries": {
                rootLayout.setBackground(getActivity().getResources().getDrawable(R.drawable.batteries_collection, null));
            }
        }

        return rootView;
    }
}
