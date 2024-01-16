package com.example.androidrecycleview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidrecycleview.Currency;
import com.example.androidrecycleview.R;

import java.util.ArrayList;
import java.util.List;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.CurrencyHolderr> {

    ArrayList<Currency> currencies;

    public CurrencyAdapter(ArrayList<Currency> currencies) {

        this.currencies=currencies ;
    }

    @NonNull
    @Override
    public CurrencyHolderr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1,parent,false);
        return new CurrencyHolderr(item);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyHolderr holder, int position) {
        holder.exchangeTextView.setText(String.valueOf(currencies.get(position).getExchangeRate()));
        holder.codeTextView.setText(currencies.get(position).getCurrencyCode());
        holder.nameTextView.setText(currencies.get(position).getCurrencyName());

    }

    @Override
    public int getItemCount() {
        return currencies.size();
    }
    public static class CurrencyHolderr extends  RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView codeTextView;
        TextView exchangeTextView;
        public CurrencyHolderr(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.CurrencyNametextView);
            codeTextView = itemView.findViewById(R.id.CodeTextView);
            exchangeTextView = itemView.findViewById(R.id.exchangeTextView);

        }




    }
}