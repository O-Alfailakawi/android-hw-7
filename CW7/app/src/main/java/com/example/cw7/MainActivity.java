package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = findViewById(R.id.recyclerView);

        Pokemon P1 = new Pokemon("Bulbasaur",R.drawable.bulbasuar,49,49,318);
        Pokemon P2 = new Pokemon("Charmander",R.drawable.charmander,52,43,309);
        Pokemon P3 = new Pokemon("Squirtle",R.drawable.squirtle,48,65,314);
        Pokemon P4 = new Pokemon("Pikachu",R.drawable.pikachu,48,65,314);

        ArrayList MyPokemons = new ArrayList<Pokemon>();
        MyPokemons.add(P1);
        MyPokemons.add(P2);
        MyPokemons.add(P3);
        MyPokemons.add(P4);


    }
}