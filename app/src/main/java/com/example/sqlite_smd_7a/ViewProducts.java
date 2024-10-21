package com.example.sqlite_smd_7a;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ViewProducts extends AppCompatActivity {

    ListView lvProducts;
    ProductAdapter adapter;
    ArrayList<Product> products;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view_products);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lvProducts = findViewById(R.id.lvProducts);
        ProductDB db = new ProductDB(this);
        db.open();
        products = db.fetchProducts();
        db.close();
        adapter = new ProductAdapter(this, R.layout.product_item_design, products);
        lvProducts.setAdapter(adapter);

    }
}