package com.kayz.pokemon;
import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	private ArrayList<Pokemon> myPokemons;

	public Pokedex() {
		this.myPokemons = new ArrayList<Pokemon>();
	}
	
	public void listPokemon() {
		for(Pokemon poke: myPokemons) {
			System.out.println(poke.getName());
		}
	}
}
