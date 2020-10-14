package com.example.stockwatch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Quan Le
 */

public class MainActivity extends AppCompatActivity
        implements View.OnLongClickListener, View.OnLongClickListener{
    private final List<Stock> stockList = new ArrayList<>();
    private RecyclerView recyclerView;
    private static final String TAG = "MainActivity";
    private StockAdapter stockAdapter;
    private SwipeRefreshLayout swipeRefresh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);

        swipeRefresh = findViewById(R.id.swipeRefresh);
        swipeRefresh.setOnRefreshListener();

        stockAdapter = new StockAdapter(stockList, this);
        recyclerView.setAdapter(stockAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Load the data
        StockLoaderRunnable stockLoaderRunnable = new StockLoaderRunnable(this);
        new Thread(stockLoaderRunnable).start();
    }
//    public void execRunnable(View v){
//        String stockData = editText.getText().toString();
//        StockDataGetter dataGetter = new StockDataGetter(this, stockData);
//        new Thread(dataGetter).start();
//        Log.d(TAG, "run: Pretending");
//    }
    @Override
    public void onClick(View v){
        int pos = recyclerView.getChildLayoutPosition(v);
        Stock s = stockList.get(pos);
        Intent intent = new Intent(MainActivity.this, StockDetailActivity.class);
        intent.putExtra(Stock.class.getName(), s);
        startActivity(intent);
    }
    @Override
    public boolean onLongClick(View v){
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        return true;
    }
    public void updateStockData(ArrayList<Stock> stockList){
        this.stockList.addAll(stockList);
        this.stockAdapter.notifyDataSetChanged();
    }
    public void downloadFailed(){
        this.stockList.clear();
        this.stockAdapter.notifyDataSetChanged();
    }
}