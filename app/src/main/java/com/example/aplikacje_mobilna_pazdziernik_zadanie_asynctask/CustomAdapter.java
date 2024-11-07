package com.example.aplikacje_mobilna_pazdziernik_zadanie_asynctask;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Item> {

    public CustomAdapter(Context context, List<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Item item = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView titleTextView = convertView.findViewById(R.id.item_title);
        TextView priceTextView = convertView.findViewById(R.id.item_price);
        TextView descriptionTextView = convertView.findViewById(R.id.item_description);

        titleTextView.setText(item.getTitle());
        priceTextView.setText(item.getPrice());
        descriptionTextView.setText(item.getDescription());

        return convertView;
    }
}
