package cl.yota.teaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import cl.yota.teaapp.adapter.adapterTea;
import cl.yota.teaapp.model.Tea;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_tea);
        adapterTea adapterTea = new adapterTea(this,Tea.teaList(),R.layout.item_tea);

        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapterTea);

    }
}