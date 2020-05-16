package com.example.salaodoautomovel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Carro> carroList = new ArrayList<Carro>();

    private RecyclerView recyclerView;

    private RecyclerAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.populate();
        this.recyclerView = findViewById(R.id.recyclerView);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        this.myAdapter = new RecyclerAdapter(this.carroList);

        this.recyclerView.setAdapter(myAdapter);
    }

    private void populate() {
        Carro obj = new Carro();
        obj.setFabricacao("1989");
        obj.setModelo("Lamboguini");
        obj.setPotencia(115);
        obj.setImagem(R.drawable.classic1);

        this.carroList.add(obj);

        Carro obj2 = new Carro();
        obj2.setFabricacao("1989");
        obj2.setModelo("Lamboguini");
        obj2.setPotencia(115);
        obj2.setImagem(R.drawable.classic2);

        this.carroList.add(obj2);

        Carro obj3 = new Carro();
        obj3.setFabricacao("1989");
        obj3.setModelo("Lamboguini");
        obj3.setPotencia(115);
        obj3.setImagem(R.drawable.classic3);

        this.carroList.add(obj3);
    }
}
