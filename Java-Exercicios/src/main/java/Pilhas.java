package main.java;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilhas {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("Dom Quixote");
        livros.add("O rei leão");
        livros.push("Moby Dick");

        System.out.println(livros.peek()); // retorna o último da pilha; retorna null se estiver vazia
        System.out.println(livros.pop()); // retorna e remova o último inserido; lança um exception se estiver vazia
        System.out.println(livros.element());// retorna o último da pilha; lança um exception se estiver vazia
        System.out.println(livros.pop());
        System.out.println(livros.pop());
        System.out.println(livros.peek());
        System.out.println(livros.poll()); // retorna e remova o último inserido; retorna null se estiver vazia
        System.out.println(livros.isEmpty());
    }
}
