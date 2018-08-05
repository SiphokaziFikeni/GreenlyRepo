package za.co.greenly.greenly.View;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import za.co.greenly.greenly.R;

public class DropOffFragment extends Fragment {

    String materialID = "";
    View rootLayout;

    public DropOffFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_dropoff_layout, container, false);
        rootLayout = rootView.findViewById(R.id.dropoff_background);
        Bundle args = getArguments();
        materialID = args.getString("Material_ID");

        switch (materialID.toLowerCase()) {
            case "metal": {
                rootLayout.setBackground(getActivity().getResources().getDrawable(R.drawable.metal_information_bg, null));
            }
            break;
            case "glass": {
                rootLayout.setBackground(getActivity().getResources().getDrawable(R.drawable.glass_information, null));
            }
            break;
            case "paper": {
                rootLayout.setBackground(getActivity().getResources().getDrawable(R.drawable.paper_information, null));
            }
            break;
            case "plastic": {
                rootLayout.setBackground(getActivity().getResources().getDrawable(R.drawable.plastics_drop_off, null));
            }
            break;
            case "cartons": {
                rootLayout.setBackground(getActivity().getResources().getDrawable(R.drawable.cartons_material, null));
            }
            break;
            case "batteries": {
                rootLayout.setBackground(getActivity().getResources().getDrawable(R.drawable.batteries_dropoff, null));
            }
        }

        return rootView;
    }
}
