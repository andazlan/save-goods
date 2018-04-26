package com.andazlan.goods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    private TextView name, description, stock;
    private Spinner category;
    private Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setTitle(getString(R.string.label_new_good));

        name = findViewById(R.id.edt_name);
        description = findViewById(R.id.edt_description);
        stock = findViewById(R.id.edt_stock);
        save = findViewById(R.id.btn_save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailActivity.this, "Save to fb", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
