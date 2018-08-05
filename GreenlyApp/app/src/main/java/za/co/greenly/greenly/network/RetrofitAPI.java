package za.co.greenly.greenly.network;

import retrofit2.Call;
import retrofit2.http.GET;
import za.co.greenly.greenly.Model.material.Material;

public interface RetrofitAPI {

    @GET("/greenly-df9b1.json")
    Call<Material> getMaterial();
}
