
package za.co.greenly.greenly.Model.material;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metal {

    @SerializedName("info")
    @Expose
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
