package com.ptp.phamtanphat.webservice1903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThemmonanActivity extends AppCompatActivity {

    EditText edtTenmonan,edtGiamonan,edtDiachi;
    Button btnHuy, btnXacnhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themmonan);
        anhxa();
    }

    private void anhxa() {
        edtTenmonan = findViewById(R.id.edittextTenmonan);
        edtGiamonan = findViewById(R.id.edittextGiamonan);
        edtDiachi = findViewById(R.id.edittextDiachimonan);
        btnHuy = findViewById(R.id.buttonHuy);
        btnXacnhan = findViewById(R.id.buttonXacnhan);
    }
}
