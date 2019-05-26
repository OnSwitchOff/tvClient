package com.ua.mytrinity.tv_client;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.ua.mytrinity.tv_client.proto.Ping;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void SendPing(View view) {

        Ping.PingRequest pingRequest = Ping.PingRequest.newBuilder().setSequence(1).build();
        NetworkService.getInstance()
                .Ping().SendPing(pingRequest).enqueue(new Callback<Ping>() {
            @Override
            public void onResponse(Call<Ping> call, Response<Ping> response) {
                Log.d("response",response.message());
            }

            @Override
            public void onFailure(Call<Ping> call, Throwable t) {
                Log.d("response","failure");
            }
        });
    }
}
