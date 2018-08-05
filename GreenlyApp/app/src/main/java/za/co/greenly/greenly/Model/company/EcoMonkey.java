
package za.co.greenly.greenly.Model.company;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EcoMonkey {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("telephone")
    @Expose
    private String telephone;
    @SerializedName("website")
    @Expose
    private String website;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

}
