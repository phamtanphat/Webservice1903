package com.ptp.phamtanphat.webservice1903;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.ptp.phamtanphat.webservice1903.Service.DataAPI;
import com.ptp.phamtanphat.webservice1903.Service.RetrofitAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MonanAdapter extends ArrayAdapter<Monan>{


    public MonanAdapter(@NonNull Context context, int resource, @NonNull List<Monan> objects) {
        super(context, resource, objects);

    }

    class ViewHolder{
        TextView txtTen,txtGia,txtDiadiem;
    }
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView = layoutInflater.inflate(R.layout.dong_item_mon_an,null);
            viewHolder = new ViewHolder();
            viewHolder.txtDiadiem = convertView.findViewById(R.id.textviewDiadiemmonan);
            viewHolder.txtGia = convertView.findViewById(R.id.textviewGiamonan);
            viewHolder.txtTen = convertView.findViewById(R.id.textviewTenmonan);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final Monan monan = getItem(position);

        viewHolder.txtTen.setText(monan.getTenmonan());
        viewHolder.txtGia.setText(monan.getGiamonan());
        viewHolder.txtDiadiem.setText(monan.getDiadiem());

        return convertView;
    }

}
