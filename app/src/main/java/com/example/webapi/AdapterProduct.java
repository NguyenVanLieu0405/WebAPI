package com.example.webapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterProduct extends BaseAdapter {
    List<Product> products;

    public AdapterProduct(List<Product> products) {
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int position) {
        return products.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.itemproduct,parent,false);
        TextView tvId,tvPublisher_id,tvContent_type,tvTab,tvTitle,tvAvatar;
        tvId=view.findViewById(R.id.tvID);
        tvPublisher_id=view.findViewById(R.id.tvPublisher);
        tvContent_type=view.findViewById(R.id.tvContent_type);
        tvTab=view.findViewById(R.id.tvTab);
        tvTitle=view.findViewById(R.id.tvTitle);
        tvAvatar=view.findViewById(R.id.tvAvatar);

        tvId.setText(products.get(position).getId()+"");
        tvPublisher_id.setText(products.get(position).getPublisher_id()+"");
        tvContent_type.setText(products.get(position).getContent_type()+"");
        tvTab.setText(products.get(position).getTab()+"");
        tvTitle.setText(products.get(position).getTitle());
        tvAvatar.setText(products.get(position).getAvatar());



        return view;
    }
}
