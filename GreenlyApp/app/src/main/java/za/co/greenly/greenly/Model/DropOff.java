
package za.co.greenly.greenly.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import za.co.greenly.greenly.Model.company.PickitupGardenSites;

public class DropOff {

    @SerializedName("pickitup-garden-sites")
    @Expose
    private PickitupGardenSites pickitupGardenSites;

    public PickitupGardenSites getPickitupGardenSites() {
        return pickitupGardenSites;
    }

    public void setPickitupGardenSites(PickitupGardenSites pickitupGardenSites) {
        this.pickitupGardenSites = pickitupGardenSites;
    }

}
