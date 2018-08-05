
package za.co.greenly.greenly.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import za.co.greenly.greenly.Model.company.None;

public class Collection {

    @SerializedName("none")
    @Expose
    private None none;

    public None getNone() {
        return none;
    }

    public void setNone(None none) {
        this.none = none;
    }

}
