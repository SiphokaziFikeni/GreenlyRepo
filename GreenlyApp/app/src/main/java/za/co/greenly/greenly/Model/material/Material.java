package za.co.greenly.greenly.Model.material;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Collection;

import za.co.greenly.greenly.Model.DropOff;

public class Material {

    @SerializedName("collection")
    @Expose
    private Collection collection;

    @SerializedName("drop-off")
    @Expose
    private DropOff dropOff;

    @SerializedName("info")
    @Expose
    private String info;

    @SerializedName("nonrecyclable")
    @Expose
    private String nonRecyclable;

    @SerializedName("recyclable")
    @Expose
    private String recyclable;

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public DropOff getDropOff() {
        return dropOff;
    }

    public void setDropOff(DropOff dropOff) {
        this.dropOff = dropOff;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getNonrecyclable() {
        return nonRecyclable;
    }

    public void setNonrecyclable(String nonrecyclable) {
        this.nonRecyclable = nonrecyclable;
    }

    public String getRecyclable() {
        return recyclable;
    }

    public void setRecyclable(String recyclable) {
        this.recyclable = recyclable;
    }

}
