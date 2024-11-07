package com.example.aplikacje_mobilna_pazdziernik_zadanie_asynctask;// ListActivity.java

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private ListView listView;
    private CustomAdapter adapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.listView);
        itemList = new ArrayList<>();

        addPredefinedItems();

        adapter = new CustomAdapter(this, itemList);
        listView.setAdapter(adapter);

        new LoadItemsTask().execute();
    }

    private void addPredefinedItems() {
        itemList.add(new Item("Pierwszy wpis do bazy", "101.00", "Opis 1"));
        itemList.add(new Item("Drugi Nowa nazwa", "10.00", "kolejny wpis"));
        itemList.add(new Item("Produkt 3", "70.00", "gffc"));
        itemList.add(new Item("Produkt 4", "2000.00", ""));
        itemList.add(new Item("Wpis nr 5", "40.00", "Info"));
        itemList.add(new Item("aa", "11.00", ""));
    }

    private class LoadItemsTask extends AsyncTask<Void, Void, List<Item>> {
        @Override
        protected List<Item> doInBackground(Void... voids) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return new ArrayList<>();
        }

        @Override
        protected void onPostExecute(List<Item> data) {
            if (!data.isEmpty()) {
                itemList.addAll(data);
                adapter.notifyDataSetChanged();
            }
        }
    }
}
