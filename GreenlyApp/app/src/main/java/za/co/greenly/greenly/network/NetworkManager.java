package za.co.greenly.greenly.network;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import za.co.greenly.greenly.Model.material.Material;

public class NetworkManager {

    private Retrofit retrofit;
    private RetrofitAPI retrofitAPI;

    public NetworkManager() {

        retrofit = new Retrofit.Builder()
                .baseUrl("https://greenly-df9b1.firebaseio.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofitAPI = retrofit.create(RetrofitAPI.class);
    }


    public void getMaterialDetails(final String materialID) {
        Call<Material> getMaterial = retrofitAPI.getMaterial();

        getMaterial.enqueue(new Callback<Material>() {
            @Override
            public void onResponse(Call<Material> call, Response<Material> response) {
                System.out.println(materialID);
            System.out.print("success " + response.body().getInfo() + " " + response.body().getRecyclable());
            }

            @Override
            public void onFailure(Call<Material> call, Throwable t) {
            System.out.println(t.getMessage());
            }
        });
    }

}
