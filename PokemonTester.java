package com.kayz.pokemon;

public class PokemonTester {
	public static void main(String[] args) {
		Pokedex myPokeDex = new Pokedex();
		Pokemon pica = myPokeDex.createPokemon("Picachu", 100, "electric");
		Pokemon eva = myPokeDex.createPokemon("Eva", 80, "fox");
		myPokeDex.pokemonInfo(pica);
		myPokeDex.pokemonInfo(eva);
		myPokeDex.listPokemon();
	}
}
