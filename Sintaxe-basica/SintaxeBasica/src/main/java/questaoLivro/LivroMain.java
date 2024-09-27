package questaoLivro;

import java.util.Scanner;

public class LivroMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o título do livro que você quer cadastrar:");
        String titulo = teclado.nextLine();
        System.out.println("Insira o autor do livro:");
        String autor = teclado.nextLine();
        System.out.println("Insira a quantidade de páginas que o livro tem:");
        Integer qtdPaginas = teclado.nextInt();
        Livro livroCadastrado = new Livro(titulo, autor, qtdPaginas);

        livroCadastrado.exibirDetalhes(livroCadastrado);
        livroCadastrado.adicionarPaginas(livroCadastrado);
    }
}
