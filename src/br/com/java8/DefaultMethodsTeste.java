package br.com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsTeste {
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("casa do código");
		palavras.add("caelum");
		palavras.add("alura online");
		
		Consumer<String> action = new ImprimeNaLinha();
		palavras.forEach(action);
	}

}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}
