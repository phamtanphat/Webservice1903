package com.ptp.phamtanphat.webservice1903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.ptp.phamtanphat.webservice1903.Service.DataAPI;
import com.ptp.phamtanphat.webservice1903.Service.RetrofitAPI;
import com.ptp.phamtanphat.webservice1903.Service.RetrofitInit;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MonanAdapter monanAdapter;
    ArrayList<Monan> mangmonan = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);


        DataAPI dataAPI = RetrofitAPI.getData();
        Call<List<Monan>> callback = dataAPI.getTatcamonan();
        callback.enqueue(new Callback<List<Monan>>() {
            @Override
            public void onResponse(Call<List<Monan>> call, Response<List<Monan>> response) {
                mangmonan = (ArrayList<Monan>) response.body();
                monanAdapter = new MonanAdapter(MainActivity.this,android.R.layout.simple_list_item_1,mangmonan);
                listView.setAdapter(monanAdapter);
            }

            @Override
            public void onFailure(Call<List<Monan>> call, Throwable t) {

            }
        });

    }
}
