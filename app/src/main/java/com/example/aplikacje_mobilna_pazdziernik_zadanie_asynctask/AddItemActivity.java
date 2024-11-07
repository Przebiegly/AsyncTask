package com.example.aplikacje_mobilna_pazdziernik_zadanie_asynctask;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AddItemActivity extends AppCompatActivity {

    private EditText etProductName, etPrice, etDescription;
    private Button btnAddItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        etProductName = findViewById(R.id.productNameEditText);
        etPrice = findViewById(R.id.priceEditText);
        etDescription = findViewById(R.id.descriptionEditText);
        btnAddItem = findViewById(R.id.addItemButton);

        btnAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etProductName.getText().toString();
                String price = etPrice.getText().toString();
                String description = etDescription.getText().toString();

                if (!name.isEmpty() && !price.isEmpty()) {
                    Toast.makeText(AddItemActivity.this, "Element dodany", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(AddItemActivity.this, "Wypełnij wszystkie pola", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
