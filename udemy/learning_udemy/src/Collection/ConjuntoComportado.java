package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();
		//Set<String> lista = new HashSet<>(); também é valido
		lista.add("Diego");
		lista.add("Emilly");
		lista.add("Thomas");
		
		for(String candidato: lista) { //o HashSet não segue a orden de inserção
			System.out.println(candidato);
		}
		
		TreeSet<String> listaAprovados = new TreeSet<>();//o treeset segue a ordenação
		//SortedSet<String> listaAprovados = new TreeSet<>(); também serve, faz a mesma coisa
		listaAprovados.add("Emilly");
		listaAprovados.add("Diego");
		listaAprovados.add("Thomas");

		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		HashSet<Integer> nums = new HashSet<>();//o treeset segue a ordenação
		//SortedSet<String> listaAprovados = new TreeSet<>(); também serve, faz a mesma coisa
		nums.add(1);
		nums.add(120);
		nums.add(6);

		for(int n: nums) {
			System.out.println(n);
		}
	}
}
