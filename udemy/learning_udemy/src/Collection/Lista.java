package Collection;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		
		Usuario u1 = new Usuario("Emilly");
		lista.add(u1);
		
		lista.add(new Usuario("Diego"));
		lista.add(new Usuario("Thomas"));
		lista.add(new Usuario("Thais"));
		lista.add(new Usuario("Anderson"));
		
		System.out.println(lista.get(3));
		
		for(Usuario n: lista) {
			System.out.println(n.nome);
		}
	}
}
