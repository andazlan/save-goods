package com.andazlan.goods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.andazlan.goods.model.Good;
import com.google.firebase.database.FirebaseDatabase;

public class DetailActivity extends AppCompatActivity {
    private TextView name, description, stock;
    private Spinner category;
    private Button save;

    private FirebaseDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mDatabase = FirebaseDatabase.getInstance();

        setTitle(getString(R.string.label_new_good));

        name = findViewById(R.id.edt_name);
        description = findViewById(R.id.edt_description);
        stock = findViewById(R.id.edt_stock);
        category = findViewById(R.id.spn_category);
        save = findViewById(R.id.btn_save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = mDatabase.getReference("goods").push().getKey();
                Good newGood = new Good(id,
                        name.getText().toString(),
                        description.getText().toString(),
                        category.getSelectedItem().toString(),
                        Integer.valueOf(stock.getText().toString()));
                mDatabase.getReference().child("goods").child(id).setValue(newGood);
                finish();
                Toast.makeText(DetailActivity.this, "Data saved", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
