package com.ptp.phamtanphat.webservice1903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ptp.phamtanphat.webservice1903.Service.DataAPI;
import com.ptp.phamtanphat.webservice1903.Service.RetrofitAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ThemmonanActivity extends AppCompatActivity {

    EditText edtTenmonan,edtGiamonan,edtDiachi;
    Button btnHuy, btnXacnhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themmonan);
        anhxa();
        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tenmonan = edtTenmonan.getText().toString();
                String giamonan = edtGiamonan.getText().toString();
                String diachi = edtDiachi.getText().toString();
                if (!tenmonan.isEmpty() && !giamonan.isEmpty() && !diachi.isEmpty()){
                    DataAPI dataAPI = RetrofitAPI.getData();
                    Call<String> callback = dataAPI.onInsertMonan(tenmonan,giamonan,diachi);
                    callback.enqueue(new Callback<String>() {
                        @Override
                        public void onResponse(Call<String> call, Response<String> response) {
                            String ketqua = response.body();
                            if (ketqua.equals("success")){
                                Toast.makeText(ThemmonanActivity.this, "Them thanh cong!!", Toast.LENGTH_SHORT).show();
                                finish();
                            }else {
                                Toast.makeText(ThemmonanActivity.this, "Loi!!", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<String> call, Throwable t) {

                        }
                    });
                }
            }
        });
    }

    private void anhxa() {
        edtTenmonan = findViewById(R.id.edittextTenmonan);
        edtGiamonan = findViewById(R.id.edittextGiamonan);
        edtDiachi = findViewById(R.id.edittextDiachimonan);
        btnHuy = findViewById(R.id.buttonHuy);
        btnXacnhan = findViewById(R.id.buttonXacnhan);
    }
}
