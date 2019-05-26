package com.ua.mytrinity.tv_client;

import com.ua.mytrinity.tv_client.proto.Ping;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.protobuf.ProtoConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;

public class NetworkService {

    private static NetworkService mInstance;
    private static final String BASE_URL = "https://tv-server.trinity-tv.net/server/";
    private Retrofit mRetrofit;

    private NetworkService() {

//        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//
//        OkHttpClient.Builder client = new OkHttpClient.Builder()
//                .addInterceptor(interceptor);

        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(ProtoConverterFactory.create())
                .build();
    }

    public static NetworkService getInstance() {
        if (mInstance == null) {
            mInstance = new NetworkService();
        }
        return mInstance;
    }

    public interface IPing {
        @POST("/TvServerService/Ping.pb")
        public Call<Ping> SendPing(@Body Ping.PingRequest pingRequest);
    }

    public IPing Ping(){
        return mRetrofit.create(IPing.class);
    }
}
