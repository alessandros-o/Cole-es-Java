package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//offer e add adicionam elementos na fila.
		//A diferença é o comportamento quando a fila está cheia
		
		fila.add("Ana");// retorna false
		fila.offer("Bia");//Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//peel e element -> obter o próximo elemento da fila sem remover
		//A diferença é o comportamento quando a fila está vazia
		System.out.println(fila.peek());//retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());//lança uma exceção
		System.out.println(fila.element());
		
		//fila.size() -> verifica o tamanho da fila
		//fila.clear() -> limpa a fila
		//fila.isEmpty() -> para saber se a fila está ou não vazia
		//fila.contains(...) -> para saber se a fila contém determinado elemento
		
		//poll e remove -> obtem o próximo elemento da fila e remove
		// a diferença é o comportamento quando a fila está vazia
		System.out.println(fila.poll());//retorna null
		System.out.println(fila.remove());//lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}

}
