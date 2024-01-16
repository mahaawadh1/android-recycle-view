package com.example.androidrecycleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidrecycleview.R;
import com.example.androidrecycleview.adapter.CurrencyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Currency> currencyList = new ArrayList<>();
    RecyclerView recyclerViewCurrency;

    RecyclerView currencyRecyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addCurrency();
        recyclerViewCurrency = findViewById(R.id.recyclerViewCurrency);
     recyclerViewCurrency.setLayoutManager( new LinearLayoutManager(this));
     CurrencyAdapter currencyAdapter = new CurrencyAdapter(currencyList);

     recyclerViewCurrency.setAdapter(currencyAdapter);



    }

    private void addCurrency() {

        currencyList.add(new Currency("Us dollar ", "usd", 0.31));
        currencyList.add(new Currency("kwd dinar  ", "KWD", 0.36));
        currencyList.add(new Currency("br  dinar ", "BHR", 0.34));
        currencyList.add(new Currency("Us dollar ", "usd", 0.31));
        currencyList.add(new Currency("kwd dinar  ", "KWD", 0.36));
        currencyList.add(new Currency("br  dinar ", "BHR", 0.34));
        currencyList.add(new Currency("Us dollar ", "usd", 0.31));
        currencyList.add(new Currency("kwd dinar  ", "KWD", 0.36));
        currencyList.add(new Currency("br  dinar ", "BHR", 0.34));
    }

}
