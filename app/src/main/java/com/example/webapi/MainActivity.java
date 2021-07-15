package com.example.webapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Adapter;

import com.example.webapi.databinding.ActivityMainBinding;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    String jsonStr = "{\"id\":\"144\",\"publisher_id\":\"3\",\"content_type\":\"3\",\"tab\":\"0\",\"title\":\"Chinese Series\",\"avatar\":null}";
    String jsonArray = "[{\"id\":\"144\",\"publisher_id\":\"3\",\"content_type\":\"3\",\"tab\":\"0\",\"title\":\"Chinese Series\",\"avatar\":null},{\"id\":\"111\",\"publisher_id\":\"113\",\"content_type\":\"113\",\"tab\":\"110\",\"title\":\"Series Phim\",\"avatar\":\"----------\"}]";
    AdapterProduct adapterProduct;
    List<Product>products;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //getJson();
        products =new ArrayList<>();
        getJsonArray();
    }

    private void getJsonArray() {
        try {
            JSONArray array = new JSONArray(jsonArray);
            for (int i = 0; i < array.length(); i++) {
                JSONObject jsonObject = array.getJSONObject(i);
                int id = jsonObject.getInt("id");
                String title = jsonObject.getString("title");
                int publisher_id = jsonObject.getInt("publisher_id");
                int content_type = jsonObject.getInt("content_type");
                int tab = jsonObject.getInt("tab");
                String avatar = jsonObject.getString("avatar");
                products.add(new Product(id,title,content_type,publisher_id,tab,avatar));
                
                //binding.tvText.setText(id + " - " + publisher_id + " - " + title);


            }
            adapterProduct=new AdapterProduct(products);
            binding.lvProduct.setAdapter(adapterProduct);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    private void getJson() {
        try {
            JSONObject jsonObject = new JSONObject(jsonStr);
            int id = jsonObject.getInt("id");
            String title = jsonObject.getString("title");

            //binding.tvText.setText(title);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}