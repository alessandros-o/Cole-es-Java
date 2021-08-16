package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//offer e add adicionam elementos na fila.
		//A diferen�a � o comportamento quando a fila est� cheia
		
		fila.add("Ana");// retorna false
		fila.offer("Bia");//Lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//peel e element -> obter o pr�ximo elemento da fila sem remover
		//A diferen�a � o comportamento quando a fila est� vazia
		System.out.println(fila.peek());//retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());//lan�a uma exce��o
		System.out.println(fila.element());
		
		//fila.size() -> verifica o tamanho da fila
		//fila.clear() -> limpa a fila
		//fila.isEmpty() -> para saber se a fila est� ou n�o vazia
		//fila.contains(...) -> para saber se a fila cont�m determinado elemento
		
		//poll e remove -> obtem o pr�ximo elemento da fila e remove
		// a diferen�a � o comportamento quando a fila est� vazia
		System.out.println(fila.poll());//retorna null
		System.out.println(fila.remove());//lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}

}
