package com.ptp.phamtanphat.webservice1903;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                DataAPI dataAPI = RetrofitAPI.getData();
                Call<String> callback = dataAPI.onDeleteMonan(Integer.valueOf(mangmonan.get(position).getId()));
                callback.enqueue(new Callback<String>() {
                    @Override
                    public void onResponse(Call<String> call, Response<String> response) {
                        String ketqua = response.body();
                        if (ketqua.equals("success")){
                            Toast.makeText(MainActivity.this, "Thanh cong!!", Toast.LENGTH_SHORT).show();
                           Intent intent = new Intent(MainActivity.this,MainActivity.class);
                           startActivity(intent);
                        }else {
                            Toast.makeText(MainActivity.this, "Loi!!", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<String> call, Throwable t) {

                    }
                });
                return true;
            }
        });
    }
}
